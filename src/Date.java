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
	           return false;
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
}


