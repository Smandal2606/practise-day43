
   package com.kodewala.arrays;
   
   class BooksItem
   {
    public static void main(String[] args)
   {
     String[] bookTitle = {"Java", "Sql", "Html" , "Springboot", "Kafka"};
	 int[] prices = {1200, 1000, 800, 1500, 2000};
	 
	 for(int i = 0; i < prices.length; i++)
	 {
	   System.out.println("The Bookstitle and their prices is: " + bookTitle[i] + " is: " + prices[i]);
	 }
   
   }
   }