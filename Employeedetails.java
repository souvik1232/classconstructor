package com.java.classconstructor;

public class Employeedetails {
	
	int empId;  
	String empName;  
		    
	public Employeedetails(int id, String name){  
	       this.empId = id;  
	       this.empName = name;  
	   }  
	void info(){
	        System.out.println("Id: "+empId+" Name: "+empName);
	   }  

}
