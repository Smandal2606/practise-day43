
  package com.kodewala.strings;
  
  class StringConstant
  {
   public static void main(String[] args)
  {
  String s1 = "Kodewala";
  String s2 = s1 + " Academy";
  
  System.out.println(s1); // Kodewala
  System.out.println(s2); // Kodewala Academy
  System.out.println(s1 == s2);  // false
  System.out.println(s1.equals(s2)); // false
  
  }
  }