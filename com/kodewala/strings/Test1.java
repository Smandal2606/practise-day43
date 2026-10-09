
   package com.kodewala.strings;
  
  class Test1
  {
   public static void main(String[] args)
  {
   
	String s1 = "kodewala";
	String s2 = s1.toString();
	String s3 = s1.toLowerCase();
	String s4 = s1.toUpperCase();
	
	
	System.out.println(s1 == s2); // true
	System.out.println(s1 == s3); // true 
	System.out.println(s1 == s4); // false
  
  }
  }