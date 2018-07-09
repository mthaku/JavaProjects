package com.ge.sample2;


public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		//Demostrating Factory Pattern
		System.out.println("***Demostrating Factory Design Pattern****");
		EmployeeFactory empFact= new EmployeeFactory();
		Employee emp = empFact.getEmployee("Associate");
		System.out.println("ID "+emp.getId()+"Name "+emp.getName()+" Salary "+emp.getSalary());
		emp = empFact.getEmployee("Manager");
		System.out.println("ID "+emp.getId()+"Name "+emp.getName()+" Salary "+emp.getSalary());
		
		//Demonstrating Composite and Iterator Design pattern
		System.out.println("***Demonstrating Composite and Iterator Design pattern***");
		 Employee emp1=new Associate(101,"Sohan Kumar", 20000.0);  
         Employee emp2=new Associate(102,"Mohan Kumar", 25000.0);  
         Employee emp3=new Principal(103,"Seema Mahiwal", 30000.0);   
         Employee   manager=new Manager(100,"Ashwani Rajput",100000.0);  
            
         manager.add(emp1);  
         manager.add(emp2);  
         manager.add(emp3);  
         manager.print(); 
        
	}

	

}
