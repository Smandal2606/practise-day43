
 package com.kodewala.strings;
 
 class StringInternalExample
 {
 public static void main(String[] args)
 {
   String s1 = "Kodewala Academy";
  String s2 = new String("Kodewala Academy");
  
  System.out.println(s1 == s2); // false because s2 point to the new object in Heap , not SCP 
  
  // this check the SCP and returns the reference to the string in the Pool
		  System.out.println(s1 == s2.intern()); // true 
 
 }
 }