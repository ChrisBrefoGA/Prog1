import java.util.StringTokenizer;
/**
 This is the date class being used by the TeamMember class. It's used to check the validity of a typed date and to check if the TeamMember being created hasn't already been made. 
 @author  Christopher Brefo & Thomas McNeil

*/
public class Date 
{
   private int  day;
   private int  month;
   private int  year;
   /**
   The constructor for the date object. It takes in a String of date format "MM/DD/YYYY" and constructs the object.
   @param String d, for the date
   @return Date object of set date
   */
   public Date(String d)
   {
	   StringTokenizer tokens = new StringTokenizer(d, "/");//tokenizer to break the string
	   String holder = tokens.nextToken();//gets the first token
			   month = new Integer(holder);//makes the string into an integer to set the month
			   holder = tokens.nextToken();//gets the second token
			   day = new Integer(holder);//makes the string into an integer to set the day
			   holder = tokens.nextToken();//gets the third token
			   year = new Integer(holder);//makes the string into an integer to set the year
   }
   /**
   The constructor for the date object. It takes in a Date object and constructs the object.
   @param Date d, for the date
   @return Date object of set date
   */
   public Date(Date d)
   {
     day = d.day;//sets the day from the date constructor
     month = d.month;//sets the month from the date constructor
     year = d.year;//sets the year from the date constructor
   }      
   /**
	Checks if the date object has been set with an actual valid date.
   @param None
   @return true if the date object has been set with a valid date, returns false if it hasn't been set with a valid date
   */
   public boolean isValid()
   {
	   if(this.day < 1) {	
		   return false;
	   }
	   
	   switch (month) 
	   {
       		case Month.JAN: case Month.MAR: case Month.MAY:
       		case Month.JUL: case Month.AUG: case Month.OCT:
       		case Month.DEC:
       			if(this.day <= 31){
       				return true;
       			}
       			else {
       				return false;
       			}
       		case Month.APR: case Month.JUN:
       		case Month.SEP: case Month.NOV:
       			if(this.day <= 30){
       				return true;
       			}
       			else{
       				return false;
       			}
       		case Month.FEB:
       			if (isLeapYear()){
       				if(this.day <= 28){
       					return true;
       				}
       				else{
       					return false;
       				}
       			}
       			else {
       				if(this.day <= 29){
       					return true;
       				}
       				else{
       					return false;
       				}
       			}
       		default:
       			return false;	//if the month is not 1-12 return false
	   }
   }
   /**
	Returns the date of the object in month/day/year format from the month, day, and year variables.
   @param None
   @return a String of month/day/year format

   */
   @Override
   public String toString()
   {
       //use the format "month/day/year"
	   return month + "/" + day + "/" + year;
   }
   /**
	Checks if the given Date object is equal to the current Date object that is using the equals method. 
	It checks the day, month, and year variables of both Date objects and sees if they are equal to each other.
   @param Object obj
   @return true if the Date objects equal each other in day, month, and year. False if the Date objects don't equal each other.
   */
   @Override
   public boolean equals(Object obj)
   {
	   if(obj instanceof Date)//this Date checks   
	      {//if the given Date's day, month, and year are equal to this day, month, and year
	    	  Date d = (Date) obj;
	    	  if(this.day == d.day && this.month  == d.month && this.year == d.year) {
	    	  return true;
	    	  }
	      }
		   return false;
   }  
   /**
	Checks to see if the year variable of the current date object is a leap year or not based on the criteria of the
	checks.
   @param   None
   @return  true if it meets the criteria. False if it doesn't meet any of the criteria 
   */
   private boolean isLeapYear(){
	   if(this.year % 4 == 0 && this.year % 100 != 0) {
		   return true;
	   }
	   if(this.year % 400 == 0) {
		   return true;
	   }
	   return false;
   }
   /**
	Main method of the Date class in order to test all of the different methods. toString(), equals(), and isLeapYear().
   @param String[] args
   @return it doesn't return anything specific,but it prints out all the answers for all of the tests being run in the method.
   */
   public static void main(String [] args)
   {
	 System.out.println("Starting the Date Testbed....");
	 Date date1 = new Date("12/3/2020");//first  date
	 System.out.println("Date1: "+ date1.toString());
	 Date date2 = new Date("11/8/2010");//second date
	 System.out.println("Date2: " + date2.toString());
	 Date date3 = new Date("3/10/2017");//third  date
	 System.out.println("Date3: " + date3.toString());
	 Date date4 = new Date("3/10/2016");//fourth date
	 System.out.println("Date4: " + date4.toString());
	 Date date5 = new Date("0/16/2007");//fifth date
	 System.out.println("Date5: " + date5.toString());
	 Date date6 = new Date("12/23/2024");//sixth date
	 System.out.println("Date6: " + date6.toString());
	 Date date7 = new Date("12/23/2024");//sixth date
	 System.out.println("Date7: " + date7.toString());
	 System.out.println("--------------------------------------");
	 System.out.println("Starting the valid method test");
	 if(date1.isValid()) System.out.println("date1 is valid.");
	 else System.out.println("date1 isn't valid.");
	 if(date2.isValid()) System.out.println("date2 is valid.");
	 else System.out.println("date2 isn't valid.");
	 if(date3.isValid()) System.out.println("date3 is valid.");
	 else System.out.println("date3 isn't valid.");
	 if(date4.isValid()) System.out.println("date4 is valid.");
	 else System.out.println("date4 isn't valid.");
	 if(date5.isValid()) System.out.println("date5 is valid.");
	 else System.out.println("date5 isn't valid.");
	 if(date6.isValid()) System.out.println("date6 is valid.");
	 else System.out.println("date6 isn't valid.");
	 if(date7.isValid()) System.out.println("date7 is valid.");
	 else System.out.println("date7 isn't valid.");
	 System.out.println("--------------------------------------");
	 System.out.println("Starting the leap year method test");
	 if(date1.isLeapYear()) System.out.println("date1 is a leap year.");
	 else System.out.println("date1 isn't a leap year.");
	 if(date2.isLeapYear()) System.out.println("date2 is a leap year.");
	 else System.out.println("date2 isn't a leap year.");
	 if(date3.isLeapYear()) System.out.println("date3 is a leap year.");
	 else System.out.println("date3 isn't a leap year.");
	 if(date4.isLeapYear()) System.out.println("date4 is a leap year.");
	 else System.out.println("date4 isn't a leap year.");
	 if(date5.isLeapYear()) System.out.println("date5 is a leap year.");
	 else System.out.println("date5 isn't a leap year.");
	 if(date6.isLeapYear()) System.out.println("date6 is a leap year.");
	 else System.out.println("date6 isn't a leap year.");
	 if(date7.isLeapYear()) System.out.println("date7 is a leap year.");
	 else System.out.println("date7 isn't a leap year.");
	 System.out.println("--------------------------------------");
	 System.out.println("Starting the equal method test");
	 if(date1.equals(date2)) System.out.println("date1 and date2 are equal.");
	 else System.out.println("date1 and date2 aren't equal.");
	 if(date3.equals(date4)) System.out.println("date3 and date4 are equal.");
	 else System.out.println("date3 and date4 aren't equal.");
	 if(date5.equals(date6)) System.out.println("date5 and date6 are equal.");
	 else System.out.println("date5 and date6 aren't equal.");
	 if(date6.equals(date7)) System.out.println("date6 and date7 are equal.");
	 else System.out.println("date6 and date7 aren't equal.");
	 System.out.println("--------------------------------------");
	 System.out.println("Ending the Date testBed....");
   }
}


