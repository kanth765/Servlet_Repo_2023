package com.ciq.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ciq.ems.model.Employee;
import com.ciq.ems.queries.EmployeeQuery;
import com.ciq.ems.util.ConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	private static Logger LOG = Logger.getLogger(EmployeeDaoImpl.class);

//	private static List<Employee> employees = new ArrayList<Employee>();
//	static {
//		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
//		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
//		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
//		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
//	}

	@Override
	public void save(Employee employee) {
//		System.out.println("employee save method is staring.....");
		LOG.debug("employee save method is staring.....");
		LOG.debug(employee + "before imployee info");
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection + "loading....");
		PreparedStatement preparedStatement = null;

		try {
//			System.out.println("prepared statement is calling statement method....");
			LOG.info("employee save method is staring.....");
			LOG.debug(employee + "before imployee info");
			preparedStatement = connection.prepareStatement(EmployeeQuery.INSERT);
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDouble(3, employee.getSalary());
			preparedStatement.setString(4, employee.getEmail());
			int result = preparedStatement.executeUpdate();
//			System.out.println(result);
			LOG.info("result");
			LOG.debug(employee + "after imployee info");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " " + e.getSQLState());
		}
	}

	@Override
	public void update(Employee employee) {
//		System.out.println("employee save method is staring.....");
		LOG.info("employee save method is staring.....");
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection + "loading....");
		PreparedStatement preparedStatement = null;

		try {
			System.out.println("prepared statement is calling update method....");
			preparedStatement = connection.prepareStatement(EmployeeQuery.UPDATE);
			preparedStatement.setInt(4, employee.getId());
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setDouble(2, employee.getSalary());
			preparedStatement.setString(3, employee.getEmail());
			int result = preparedStatement.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " " + e.getSQLState());
		}
		System.out.println("prepared statement is calling update method end....");
	}

	@Override
	public List<Employee> getEmployees() {
		System.out.println("employee get all  method is staring.....");
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection + "loading....");
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Employee> employees = null;
		try {
			System.out.println("prepared statement is calling statement method....");
			preparedStatement = connection.prepareStatement(EmployeeQuery.SELECT);
			resultSet = preparedStatement.executeQuery();
			employees = new ArrayList<>();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setSalary(resultSet.getDouble(3));
				employee.setEmail(resultSet.getString(4));
				employees.add(employee);
			}
			return employees;
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " " + e.getSQLState());
		}
		return null;
	}

	@Override
	public void delete(int id) {
		System.out.println("delete method started execution....");
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection + "loading....");
		PreparedStatement ps = null;
		try {
			ps = connection.prepareStatement(EmployeeQuery.DELETE);
			ps.setInt(1, id);
			int result = ps.executeUpdate();
			System.out.println("deleted " + result + " id");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " " + e.getSQLState());
		}

		System.out.println("delete method stops execution....");

	}

	@Override
	public Employee getById(int id) {
		System.out.println("employee get by  method is staring.....");
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection + "loading....");
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Employee employee = new Employee();
			System.out.println("employee get by ps method is staring.....");
			ps = connection.prepareStatement("select * from employee where id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				employee.setEmail(rs.getString(4));

			}
			return employee;
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " " + e.getSQLState());
		}

		return null;
	}

	public static void main(String[] args) {
		EmployeeDaoImpl impl = new EmployeeDaoImpl();
		Employee employee = impl.getById(1);
		System.out.println(employee);
	}
}
