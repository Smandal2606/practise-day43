

     package com.kodewala.Switchstatement;

     public class ElectricityBill {

	public static void main(String[] args) 
	{
		ElectricityBill electric = new ElectricityBill();
		String customer = args[0];
		double units = Double.parseDouble(args[1]);
		
        electric.calculateBill(customer, units);
	}
	
	public void calculateBill(String customerType, double unit) 
	{
		double bill = 0;
		double rate = 0;
		
		switch (customerType) 
		{
		case "Residential":
			rate = 5;
			break;
			
		case "Commercial":
			rate =  8;
			break;
			
		case "Industrial":
			rate =  12;
			break;

		default:
			System.out.println("Below 100 is free");
			return;
		}

		if(unit <= 100) 
		{
		 bill = unit * rate;	
		} else {
			double first100 = 100 * rate;
			double reamining = unit - 100;
			bill = first100 + (reamining * (rate + 2));
		}
				if(bill > 10000) {
			bill = 10000;
		}
		System.out.println("Total bills is: " + bill);
	} 
 }
  
