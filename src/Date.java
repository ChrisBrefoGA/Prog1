import java.util.StringTokenizer;

/**
  
 @author Christopher Brefo & Thomas McNeil
 */
public class Date 
{
   private int  day;
   private int  month;
   private int  year;
   
   public Date(String d)
   {
	   StringTokenizer tokens = new StringTokenizer("//", d);//tokenizer to break the string
	   String holder = tokens.nextToken();//gets the first token
			   month = new Integer(holder);//makes the string into an integer to set the month
			   holder = tokens.nextToken();//gets the second token
			   day = new Integer(holder);//makes the string into an integer to set the day
			   holder = tokens.nextToken();//gets the third token
			   year = new Integer(holder);//makes the string into an integer to set the year
   }
   
   public Date(Date d)
   {
     day = d.day;//sets the day from the date constructor
     month = d.month;//sets the month from the date constructor
     year = d.year;//sets the year from the date constructor
   }      
   
   public boolean isValid()
   {
	   if(this.day < 1) {	
		   return false;
	   }
	   
	   switch (month) {
       case Month.JAN: case Month.MAR: case Month.MAY:
       case Month.JUL: case Month.AUG: case Month.OCT:
       case Month.DEC:
            if(this.day <= 31) {
            	return true;
            }
            else {
            	return false;
            }
       case Month.APR: case Month.JUN:
       case Month.SEP: case Month.NOV:
           if(this.day <= 30) {
           	return true;
           }
           else {
        	   return false;
           }
       case Month.FEB:
           if (isLeapYear()) {
               if(this.day <= 28) {
            	   return true;
               }
               else {
            	   return false;
               }
           }
           else {
               if(this.day <= 29) {
            	   return true;
               }
               else {
            	   return false;
               }
           }
       default:
           return false;	//if the month is not 1-12 return false
	   }
   }
   
   @Override
   public String toString()
   {
       //use the format "month/day/year"
	   return month + "/" + day + "/" + year;
   }
   
   @Override
   public boolean equals(Object obj)
   {
       return false;
   }  
   
   private boolean isLeapYear(){
	   if(this.year % 4 == 0 && this.year % 100 != 0) {
		   return true;
	   }
	   if(this.year % 400 == 0) {
		   return true;
	   }
	   return false;
   }
   
   
   
   
}


