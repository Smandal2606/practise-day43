
  package com.kodewala.Switchstatement;
  
  class ApplyDiscount
  {
   public static void main(String[] args)
  {
    ApplyDiscount applyDiscount = new ApplyDiscount();
	String customer = args[0];
	int amount = Integer.parseInt(args[1]);
	applyDiscount.customerDiscount(customer, amount);
  
  }
  static void customerDiscount(String discountType, int purchadeAmount)
  {
  int discount = 0;
  if(purchadeAmount >= 1000)
  {
  switch(discountType)
  {
   case "Gold";
   discount = purchadeAmount * 0.20;
   break;
   
   case "Silver";
   discount = purchadeAmount * 0.10;
   break;
   
   case "Regular";
   discount = purchadeAmount * 0.05;
   break;
   
   default;
   System.out.println("No discount available");
   return;
  }
  if(discount > 2500){
   discount = 2500;
  }
  System.out.println("Discount: " + discount);
  } else {
    
  }
   System.out.println("Minimum purchase should be 1000");
  }
  }
  }