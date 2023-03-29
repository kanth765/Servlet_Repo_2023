package com.ciq.ems.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciq.ems.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static List<Employee> employees = new ArrayList<Employee>();
	static {
		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
		employees.add(new Employee(1, "anil", 22000.00, "anil@ciq.com"));
	}

	@Override
	public void save(Employee employee) {
		employees.add(employee);

	}

	@Override
	public List<Employee> getEmployees() {
		return employees;
	}

	@Override
	public void update(Employee employee) {
//		employees.get(i);
//		employees.set(i, employee);

	}

	@Override
	public void delete(int id) {
		employees.remove(id);

	}

}
