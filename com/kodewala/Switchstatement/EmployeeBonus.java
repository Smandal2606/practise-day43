
    package com.kodewala.Switchstatement;

   public class EmployeeBonus {

	public static void main(String[] args) 
	{
		EmployeeBonus employeeBonus = new EmployeeBonus();
		String employee = args[0];
		double empSalary = Double.parseDouble(args[1]);
		int year = Integer.parseInt(args[2]);
		employeeBonus.calculateBonus(employee, empSalary, year);

	}
	public void calculateBonus(String employeeType, double salary, int yearsOfExperience) 
	{
		double bonus = 0.0;
		if(yearsOfExperience >= 1) 
		{
		switch (employeeType) 
		{
		case "Manager":
			bonus = salary * 0.15;
			break;
			
		case "Senior":
			bonus = salary * 0.10;
			break;
			
		case "Junior":
			bonus = salary * 0.05;
			break;

		default:
			System.out.println("No bonus ");
			return;
			
		}
		if(bonus > 50000)
		{
			bonus = 50000;
		} 
			System.out.println("Bonus : " + bonus);
		}else 
		{
		
		System.out.println("Experience require more than 1 years for Bonus");
		}
	}

}
