import java.util.*;

/**
  
 @author  Christopher Brefo & Thomas McNeil
 */
 
public class ProjectManager
{
   Scanner stdin;
   Team cs213;
   public void run()
   {
      boolean done = false;
      while ( !done )
      {
    	 System.out.println("What would you like to do? ((A)dd,(P)rint,(R)emove, or (Q)uit");
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
   
   private void add()
   {
      	//must check if the date is valid
	//must call the contains() method to check if a given 
	//team member is in the team already
   }
   
   private void remove()
   {
      //must check if the date is valid
	   
   }
   
   private void print()
   {
      //must check if the team has 0 members. 
   }   
} //ProjectManager
