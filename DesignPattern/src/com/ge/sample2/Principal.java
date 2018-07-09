package com.ge.sample2;



    public class Principal implements Employee{  
         int id;  
        private String name;  
        private double salary;  
       public Principal(int id,String name,double salary)  {  
           this.id=id;  
           this.name = name;  
           this.salary = salary;  
       }  
       @Override  
       public void add(Employee employee) {  
          
       }  
         
       @Override  
        public int getId() {  
            // TODO Auto-generated method stub  
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
           System.out.println("=========================");  
           System.out.println("Id ="+getId());  
           System.out.println("Name ="+getName());  
           System.out.println("Salary ="+getSalary());  
           System.out.println("=========================");  
       }  
      @Override  
       public void remove(Employee employee) {  
           
       }  
    
}
