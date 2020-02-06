/**
  
 @author  Christopher Brefo & Thomas McNeil 
 */
public class Team 
{
   private final int NOT_FOUND = -1;
   private final int GROW_SIZE = 4; //initial and grow size
   private TeamMember[] team;
   private int numMembers;
   
   public Team()
   {
      numMembers = 0;
      team = new TeamMember[GROW_SIZE];
   }
   
   private int find(TeamMember m)
   {
       return NOT_FOUND;
   }
   
   private void grow()
   {
       
   }
   
   public boolean isEmpty()
   {
	   if(numMembers > 0) return true;	   
       return false;
   }
   
   public void add(TeamMember m)
   {     
            
   }
   
   public boolean remove(TeamMember m)
   {
       return false;
   } 
   
   public boolean contains(TeamMember m)
   {
      return false;
   } 
   
   public void print()
   {
      //set up a for loop and call the toString() method
   } 
}
