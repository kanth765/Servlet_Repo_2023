package com.ciq.ems.dao;

import java.sql.Connection;
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
		Connection connection = ConnectionUtil.getConnection();
		try {
			connection.prepareStatement(EmployeeQuery.INSERT);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		return employees;
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
