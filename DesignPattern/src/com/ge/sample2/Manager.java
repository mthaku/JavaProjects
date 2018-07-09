package com.ge.sample2;


	
	
	import java.util.ArrayList;   
	import java.util.List;  
	import com.ge.sample2.*;
	public class Manager  implements Employee,EmployeeContainer {  
	     private int id;  
	     private String name;  
	     private double salary;
	     
	     public Manager(){}
	  
	     public Manager(int id,String name,double salary) {  
	      this.id=id;      
	      this.name = name;  
	      this.salary = salary;  
	     }  
	     List<Employee> employees = new ArrayList<Employee>();  
	     @Override  
	     public void add(Employee employee) {  
	        employees.add(employee);  
	     }  
	       
	     @Override  
	     public void remove(Employee employee) {  
	      employees.remove(employee);  
	     }    
	     @Override  
	     public int getId()  {  
	      return id;  
	     }  
	     @Override  
	     public String getName() {  
	      return name;  
	     }  
	    @Override  
	     public double getSalary() {  
	      return salary;  
	     }  
	     @Override  
	     public void print() {  
	      System.out.println("==========================");  
	      System.out.println("Id ="+getId());  
	      System.out.println("Name ="+getName());  
	      System.out.println("Salary ="+getSalary());  
	      System.out.println("==========================");  
	        
	     
	      //Using own iterator
	    
	      for(Iterator iter = getIterator(); iter.hasNext();){
	         Employee employee = (Employee) iter.next();
	         employee.print();
	     }}
	     
	     
	     @Override
	     public Iterator getIterator() {
	        return new NameIterator();
	     }

	     private class NameIterator implements Iterator {

	        int index;

	        @Override
	        public boolean hasNext() {
	        
	           if(index < employees.size()){
	              return true;
	           }
	           return false;
	        }

	        @Override
	        public Object next() {
	        
	           if(this.hasNext()){
	              return employees.get(index++);
	           }
	           return null;
	        }		
	     }

}
