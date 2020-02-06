/**
 
 @author  Christopher Brefo & Thomas McNeil
 */
public class TeamMember 
{
   private String name;//objects name variable
   private Date   startDate;//objects date variable
   
   public TeamMember(String nm, Date date)
   {
       name = nm;//sets the object's name 
       startDate = date;//sets the object's date
   }
   
   public Date getStartDate()
   {
      return startDate;// returns the objects set date
   }
   
   public boolean equals(Object obj)
   {
      if(this.toString().equals(obj.toString()))//this team member checks 
    	  //if the given team member's toString is equal to this current toString  
      {
    	  return true;
      }
	   return false;
   }  
   
   public String toString()
   {
       return name+ " "+ startDate;
   }

   public static void main(String [] args)
   {
	   String name1 = "Sam";//first team member name
	   String name2 = "Kyle";//second team member name
	   String name3 = "Diana";//third team member name
	   String name4 = "Andrea";//fourth team member name
	   String name5 = "Kevin";//fifth team member name
	   String name6 = "Karla";//sixth team member name
	   Date date1 = new Date("12/3/2009");//first team member date
	   Date date2 = new Date("11/8/2010");//second team member date
	   Date date3 = new Date("5/12/2029");//third team member date
	   Date date4 = new Date("3/10/2015");//fourth team member date
	   Date date5 = new Date("0/16/2007");//fifth team member date
	   Date date6 = new Date("12/3/2009");//sixth team member date
     TeamMember member1 = new TeamMember(name1,date1);//first team member
     TeamMember member2 = new TeamMember(name2,date2);//second team member
     TeamMember member3 = new TeamMember(name3,date3);//third team member
     TeamMember member4 = new TeamMember(name4,date4);//fourth team member
     TeamMember member5 = new TeamMember(name5,date5);//fifth team member
     TeamMember member6 = new TeamMember(name6,date6);//sixth team member
   }
}