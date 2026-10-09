
  package com.kodewala.arrays;
   
   
   class ElectronicItems
   {
     public static void main(String[] args)
   {
    String products[] = {"Laptop", "Smartphone", "Tablet", "Smartwatch", "Headphone"};
	int[] prices = {50000, 30000, 20000, 1500, 10000};
	
	int maxPrice = 0;
	
	for(int i = 0; i < prices.length; i++)
	{
	 if(prices[i] > prices[maxPrice])
	 {
	  maxPrice = i;
	 }
	}
	   System.out.println("The products with the highest price is: " + products[maxPrice] + " with price of RS." + prices[maxPrice]);
	
	}
	}