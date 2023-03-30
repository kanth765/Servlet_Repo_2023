package com.ciq.ems.queries;

public interface EmployeeQuery {

	static String INSERT = "INSERT INTO EMPLOYEE VALUES(?,?,?,?)";
	static String SELECT = "select * from employee";

}
