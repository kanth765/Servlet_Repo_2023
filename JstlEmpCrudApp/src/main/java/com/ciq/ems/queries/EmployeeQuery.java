package com.ciq.ems.queries;

public interface EmployeeQuery {

	static String INSERT = "INSERT INTO EMPLOYEE VALUES(?,?,?,?)";
	static String SELECT = "SELECT * FROM EMPLOYEE";
	static String UPDATE = "UPDATE EMPLOYEE SET NAME=?, SALARY=?, EMAIL=? WHERE ID=?";
	static String DELETE = "DELETE FROM EMPLOYEE WHERE ID=?";

}
