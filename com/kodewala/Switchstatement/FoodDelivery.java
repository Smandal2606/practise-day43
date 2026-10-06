
    package com.kodewala.Switchstatement;
	
	class FoodDelivery
	{
	  public static void main(String[] args)
	{
	 FoodDelivery foodDelivery = new FoodDelivery();
	 String customer = args[0];
	 double amount = Double.parseDouble(args[1]);
	 
	foodDelivery.calculateDiscount(customer, amount);
	}
	
	public void calculateDiscount(String customerType, double orderAmount)
	{
	 double discount = 0;
	 if(orderAmount >= 500)
	 {
	 switch(customerType)
	 {
	 case "Gold":
	  discount = orderAmount * 0.20;
	  break;
	  
	  case "Silver":
	  discount = orderAmount * 0.10;
	  break;
	  
	  case "Regular":
	  discount = orderAmount * 0.05;
	  break;
	  
	  default:
	  System.out.println("No discount");
	  return;
	}
	 if(discount > 1000){
	  discount = 1000;
	 }
	 System.out.println("Discount: " + discount);
	} else {
	System.out.println("No discount below 500");
	}
	}
	}