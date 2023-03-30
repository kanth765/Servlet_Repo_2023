package com.ciq.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ciq.ems.model.Employee;
import com.ciq.ems.queries.EmployeeQuery;
import com.ciq.ems.util.ConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

//	private static List<Employee> employees = new ArrayList<Employee>();
//	static {
//		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
//		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
//		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
//		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
//	}

	@Override
	public void save(Employee employee) {
		System.out.println("employee save method is staring.....");
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection + "loading....");
		PreparedStatement preparedStatement = null;

		try {
			System.out.println("prepared statement is calling statement method....");
			preparedStatement = connection.prepareStatement(EmployeeQuery.INSERT);
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDouble(3, employee.getSalary());
			preparedStatement.setString(4, employee.getEmail());
			int result = preparedStatement.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage() + " " + e.getSQLState());
		}
//		} finally {
//			System.out.println("connection is closing....");
//			ConnectionUtil.close(preparedStatement, connection);
//		}
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
			e.printStackTrace();
		}
//		} finally {
//			System.out.println("get all connection is closing....");
//			ConnectionUtil.close(resultSet, preparedStatement, connection);
//		}
		return null;
	}

	@Override
	public void update(Employee employee) {
//		employees.get(i);
//		employees.set(i, employee);

	}

	@Override
	public void delete(int id) {
//		employees.remove(id);

	}

}
