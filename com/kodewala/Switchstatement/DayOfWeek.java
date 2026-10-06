
   package com.kodewala.Switchstatement;
   
   class DayOfWeek
   {
     public static void main(String[] args)
   {
     
      DayOfWeek dayOfWeek = new DayOfWeek();
	  int days = Integer.parseInt(args[0]);
	  dayOfWeek.day(days);
   }
   public void day(int number)
   {
    switch(number){
	case 1:
	System.out.println("Monday");
	break;
	case 2:
	System.out.println("Tuesday");
	break;
	case 3:
	System.out.println("Wednesday");
	break;
	case 4:
	System.out.println("Thursday");
	break;
	case 5:
	System.out.println("Friday");
	break;
	case 6:
	System.out.println("Saturday");
	break;
	case 7:
	System.out.println("Sunday");
	break;
	default:
	System.out.println("Unknown number !! Please enter number between [1-7]");
   }
   }
   }