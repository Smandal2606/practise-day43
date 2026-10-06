
     package com.kodewala.Switchstatement;
	 
	 public class BankLoanEligibilty {

	public static void main(String[] args) 
	{
		
		BankLoanEligibilty bank = new BankLoanEligibilty();
		
		String customer = args[0];
		double customerSalary = Double.parseDouble(args[1]);
		int credit = Integer.parseInt(args[2]);
		
		bank.checkLoanEligible(customer, customerSalary, credit);
		
	}
	public void checkLoanEligible(String customerType,double salary,int creditCard)
	{
			switch (customerType) 
			{
			case "Gold":
			if(salary >= 50000 && creditCard >= 750)
			{
				System.out.println("Loan approve");
			} else {
				System.out.println("Loan not approve");
			}
				break;
				
			case "Silver":
				if(salary >= 40000 && creditCard >= 700) 
				{
					System.out.println("Loan approve");
				} else {
					System.out.println("Loan not approve");
				}
				break;
				
			case "Regular":
				if(salary >= 30000 && creditCard >= 650) {
					System.out.println("Loan approve");
				} else {
					System.out.println("Loan not approve");
				}
				break;
				
			default:
				System.out.println("Invalid customer type");
				break;
			
		}
	}

   }
