
   package com.kodewala.Switchstatement;
   
   public class CabFareCalculate {

	public static void main(String[] args) 
	{
		CabFareCalculate cabFare = new CabFareCalculate();
		String cabe = args[0];
		double cabeDistance = Double.parseDouble(args[1]);
		cabFare.calculateFare(cabe, cabeDistance);

	}
	public void calculateFare(String cabeType, double distance)
	{
		double total = 0;
		if(distance >= 2) {
		switch (cabeType) {
		case "Bike":
			total = distance * 10;
			break;

		case "Sedan":
			total = distance * 20;
			break;
			
		case "SUV":
			total = distance * 30;
			break;
			
		default:
			System.out.println("No booked");
			return;
		}
		if(total > 2000) {
			total = 2000;
		}
		System.out.println("Total fare is: " + total);
		} else {
			System.out.println("If distance below 2km then minimum fare is RS. 50");
		}
	}

}
