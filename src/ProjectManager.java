import java.util.*;

/**
This class is the user interface class that handles input commands and output messages.
 @author  Christopher Brefo & Thomas McNeil
*/
 
public class ProjectManager
{
   Scanner stdin;
   Team cs213 = new Team();
   
   /**
	Runs the program that will take in user inputs from the user such as the A,P,R, and Q commands then goes to the corresponding method.
	It will then ask for the requirements of the user, then fulfill the task of that method and return back to the beginning of the while loop
   @param None
   @return None
   */
   public void run()
   {
	  System.out.println("Let's start a new team!");
      boolean done = false;
      while ( !done )
      {
    	 System.out.println("What would you like to do? ((A)dd,(P)rint,(R)emove, or (Q)uit)");
    	 stdin= new Scanner(System.in);
    	 String command = stdin.nextLine();
         switch(command.charAt(0))
         {   
            case 'A': add();
		      break; 
            case 'P': print();
            	break; 
            case 'R': remove();
            	break;              
            case 'Q':
            		  done = true;
            	break;      
            default: System.out.println("The command '"+command+"' is not supported.");
         }  
      }
      print();
      System.out.println("The Team is ready to go!");
   } //run()
   /**
	This is the add method that takes in the name of the user and the date it's being added. After it takes in the following requirements
	it checks the validity of the date, if it passes then it builds the teamMember, else it will produce an error message saying the date 
	isn't a valid date. After it does this and the TeamMember has been built. It then uses the add method in the Team class to add the TeamMember.
	If the TeamMember isn't already in the team then it adds them, else it produces an error message.
   @param None
   @return None
   */
   private void add()
   {
	   TeamMember member = null;
	   System.out.println("Please type the name of the person being added");//displayed string
	   stdin = new Scanner(System.in);// input scanner for the name
	   String name = stdin.nextLine();// name variable
	   System.out.println("Please type the date of the person being added (MM/DD/YYYY):");// displayed string
	   stdin = new Scanner(System.in);// input scanner for the date
	   String Date = stdin.nextLine();//date variable
	   Date date = new Date(Date);// build a date object
	   if(date.isValid()){// check if that date is a valid date
	   member = new TeamMember(name, date);//if it is build a teamMember object
	   }
	   else {
		   System.out.println("You didn't submit a valid date.");//else display an error message
		   return;
	   }
      	if(!cs213.contains(member)){//check if the Team contains this member already
      		cs213.add(member);
      		System.out.println(member.toString()+" has joined the team.");//confirmation message
      	}else {
      		System.out.println(member.toString()+" is already in the team.");//else display an error message
 		   return;
      	}
   }
   /**
	This is the remove method that takes in the name of the user and the date it's going to remove. After it takes in the following requirements
	it checks the validity of the date, if it passes then it builds the teamMember, else it will produce an error message saying the date 
	isn't a valid date. After it does this and the TeamMember has been built. It then uses the remove method in the Team class to remove the TeamMember.
	If the TeamMember is in the team then it removes them, else it produces an error message.
   @param None
   @return None
   */
   private void remove()
   {
	   TeamMember member = null;
	   System.out.println("Please type the name of the person being added");//displayed string
	   stdin = new Scanner(System.in);// input scanner for the name
	   String name = stdin.nextLine();// name variable
	   System.out.println("Please type the date of the person being added (MM/DD/YYYY):");// displayed string
	   stdin = new Scanner(System.in);// input scanner for the date
	   String Date = stdin.nextLine();//date variable
	   Date date = new Date(Date);// build a date object
	   if(date.isValid()){// check if that date is a valid date
	   member = new TeamMember(name, date);//if it is build a teamMember object
	   }
	   else {
		   System.out.println("You didn't submit a valid date.");//else display an error message
		   return;
	   }
      	if(cs213.contains(member)){//check if the Team contains this member already
      		cs213.remove(member);//if the team does contain this member then remove them
      		System.out.println(member.toString()+" has left the team.");//confirmation message
      	}else {
      		System.out.println(member.toString()+" isn't in the team.");//else display an error message
 		   return;
      	}   
   }
   /**
	Prints and displays the members inside of the team to the user
   @param None
   @return None
   */
   private void print()
   {
	  if(cs213.isEmpty()) { //check if the team has 0 members. 
		  System.out.println("We have 0 team members!");
	  }
	  else {
		  System.out.println("We have the following team members:");
		  cs213.print();  //prints team members
		  System.out.println("-- end of the list --");
	  }
   }   
} //ProjectManager
