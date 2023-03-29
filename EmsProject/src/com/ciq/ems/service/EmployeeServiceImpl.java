package com.ciq.ems.service;

import java.util.List;

import com.ciq.ems.dao.EmployeeDaoImpl;
import com.ciq.ems.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDaoImpl dao = new EmployeeDaoImpl();

	@Override
	public void save(Employee employee) {
		dao.save(employee);

	}

	@Override
	public List<Employee> getEmployees() {
		return dao.getEmployees();
	}

	@Override
	public void update(Employee employee) {
		dao.update(employee);

	}

	@Override
	public void delete(int id) {
		dao.delete(id);

	}

}
