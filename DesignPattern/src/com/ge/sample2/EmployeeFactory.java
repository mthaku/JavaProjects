package com.ge.sample2;


public class EmployeeFactory {
	
	public Employee getEmployee(String employeeType) {
		 if(employeeType==null) {
			 return null;
		 }
		 if(employeeType.equalsIgnoreCase("PRINCIPAL")) {
			return new Principal(101,"Pandurang",22000);
		 }else if (employeeType.equalsIgnoreCase("MANAGER")) {
			return new Manager(102,"Mayuri Thakur",140000.0);
		 }else if (employeeType.equalsIgnoreCase("ASSOCIATE"))
		 {
			 return new Associate(103,"Avinash Patil",50000.0);
		 }
		return null;
	 }

}
