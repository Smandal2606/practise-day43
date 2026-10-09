
   package com.kodewala.arrays;
   import java.util.Scanner;
   
   class EmployeeSearch
   {
     public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
	
	String employees[] = new String[4];
	employees[0] = "Mohit";
	employees[1] = "Raj";
	employees[2] = "Sanjay";
	employees[3] = "Neha";
	
	System.out.println("Enter employee to search name: ");
	String searchName = sc.nextLine();
	boolean found = false;
	
	for(int i = 0; i < employees.length; i++)
	{ 
	if(employees[i].equalsIgnoreCase(searchName)){
	 System.out.println("Employee found: " + employees[i]);
	 found = true;
	 break;
	}
	}
	if(!found)
	{
	System.out.println("Employee with name " + searchName + " not found");
	}
     sc.close();
   }
   }