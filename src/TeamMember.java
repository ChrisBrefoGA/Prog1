/**
This class is to build the methods and properties of a team member
 @author  Christopher Brefo & Thomas McNeil
*/
public class TeamMember 
{
   private String name;//objects name variable
   private Date   startDate;//objects date variable
   /**
    Constructor for the TeamMember class 
   @param String nm, Date date
   @return TeamMember class 
   */
   public TeamMember(String nm, Date date)
   {
       name = nm;//sets the object's name 
       startDate = date;//sets the object's date
   }
   /**
	returns the startDate of the current TeamMember 
   @param None
   @return Date startDate variable

   */
   public Date getStartDate()
   {
      return startDate;// returns the objects set date
   }
   /**
	Checks if the given TeamMember is equal to the current TeaMember that is using the equals method. 
	It checks the day, month, and year variables of both TeamMembers and sees if they are equal to each other.
   @param Object obj
   @return true if the Date objects equal each other in day, month, and year. False if the Date objects don't equal each other.
   */
   public boolean equals(Object obj)
   {
      if(obj instanceof TeamMember)//this team member checks   
      {//if the given team member's toString is equal to this current toString
    	  TeamMember m = (TeamMember) obj;
    	  if(this.name.equals(m.name) && this.getStartDate().equals(m.startDate)) {
    	  return true;
    	  }
      }
	   return false;
   }  
   /**
	Prints out the name and startDate in a string of the given constructor
   @param None
   @return name variable and the startDate variable
   */
   public String toString()
   {	   
       return name+" "+ startDate;
   }
   /**
	Main method of the TeamMember class in order to test all of the different methods. toString(), and equals().
   @param String[] args
   @return it doesn't return anything specific,but it prints out all the answers for all of the tests being run in the method.
   */
   public static void main(String [] args)
   {
	 System.out.println("Starting the TeamMember Testbed....");
	 System.out.println("--------------------------------------");
	 System.out.println("Setting up the names....");
	 String name1 = "Sam";//first team member name
	 String name2 = "Kyle";//second team member name
	 String name3 = "Diana";//third team member name
	 String name4 = "Andrea";//fourth team member name
	 String name5 = "Kevin";//fifth team member name
	 String name6 = "Karla";//sixth team member name
	 String name7 = "Karla";//seventh team member name
	 System.out.println("--------------------------------------");
	 System.out.println("Setting up the startDates....");
	 Date date1 = new Date("12/3/2009");//first team member date
	 Date date2 = new Date("11/8/2010");//second team member date
	 Date date3 = new Date("5/12/2029");//third team member date
	 Date date4 = new Date("5/13/2029");//fourth team member date
	 Date date5 = new Date("3/11/2015");//fifth team member date
	 Date date6 = new Date("12/3/2009");//sixth team member date
	 Date date7 = new Date("12/3/2009");//seventh team member date
	 System.out.println("--------------------------------------");
	 System.out.println("Constructing the TeamMembers....");
     TeamMember member1 = new TeamMember(name1,date1);//first team member
     System.out.println(member1.toString());
     TeamMember member2 = new TeamMember(name2,date2);//second team member
     System.out.println(member2.toString());
     TeamMember member3 = new TeamMember(name3,date3);//third team member
     System.out.println(member3.toString());
     TeamMember member4 = new TeamMember(name4,date4);//fourth team member
     System.out.println(member4.toString());
     TeamMember member5 = new TeamMember(name5,date5);//fifth team member
     System.out.println(member5.toString());
     TeamMember member6 = new TeamMember(name6,date6);//sixth team member
     System.out.println(member6.toString());
     TeamMember member7 = new TeamMember(name7,date7);//sixth team member
     System.out.println(member7.toString());
     System.out.println("--------------------------------------");
     System.out.println("Teasting the equals method....");
	 if(member1.equals(member2)) System.out.println("member1 and member2 are equal.");
	 else System.out.println("member1 and member2 aren't equal.");
	 if(member3.equals(member4)) System.out.println("member3 and member4 are equal.");
	 else System.out.println("member3 and member4 aren't equal.");
	 if(member5.equals(member6)) System.out.println("member5 and member6 are equal.");
	 else System.out.println("member5 and member6 aren't equal.");
	 if(member6.equals(member7)) System.out.println("member6 and memeber7 are equal.");
	 else System.out.println("memeber6 and memeber7 aren't equal.");
     System.out.println("Ending the TeamMember Testbed....");
     System.out.println("--------------------------------------");
   }
}