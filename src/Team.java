/**
This is the container class that defines a team and its properties.
 @author  Christopher Brefo & Thomas McNeil
*/
public class Team 
{
   private final int NOT_FOUND = -1;
   private final int GROW_SIZE = 4; //initial and grow size
   private TeamMember[] team;
   private int numMembers;
   
   /**
	Constructor for the Team container class
   @param None
   @return A Team object
   */
   public Team()
   {
      numMembers = 0;
      team = new TeamMember[GROW_SIZE];
   }
   /**
	Locates where a TeamMember is given in the array of the Team class
   @param TeamMember m
   @return if found returns the integer position it is in the array, otherwise it returns NOT_FOUND(-1).
   */
   private int find(TeamMember m)
   {
	   for(int i = 0; i < numMembers; i++){
		   if(team[i].equals(m)) {
			   return i;
		   }
	   }
       return NOT_FOUND;
   }
   /**
	Increases the size of the array when it hits the max limit of the array while adding to it.
   @param None
   @return None
   */
   private void grow() //doubles array size when array is filled
   {
       TeamMember[] newArray = new TeamMember[2*GROW_SIZE];
       for(int i = 0; i < GROW_SIZE; i++) {
    	   newArray[i] = team[i];
       }
       team = newArray;
   }
   /**
	Checks if the Team container has members in it or not by checking the number of numMembers
   @param None
   @return true if numMembers = 0, false otherwise
   */
   public boolean isEmpty()
   {
	   if(numMembers == 0) return true;	   
       return false;
   }
   /**
	Adds a teamMember to the back of the array, but if the array is full then it grows the array and then puts it in the back of the new array
   @param TeamMember m
   @return None
   */
   public void add(TeamMember m)
   {     
	   if(numMembers == GROW_SIZE) {
		   this.grow();
	   }	   
       team[numMembers] = m;
       numMembers++;
   }
   /**
	Locates a teamMember by checking if they're in the array, by using the find method. If they're found then
	it goes ahead and swaps that member with the member in the back of the list and then sets that last position to null.
	After that is done it subtracts the numMembers variable by 1.
   @param TeamMember m
   @return true if the variable was successfully removed, otherwise it returns false
   */
   public boolean remove(TeamMember m)
   {
	   int memberIndex = find(m);
	   
	   if(memberIndex == NOT_FOUND) {
		   return false;
	   }
	   int lastMemberIndex = numMembers - 1;
	   team[memberIndex] = team[lastMemberIndex];
	   team[lastMemberIndex] = null; 
	   numMembers--;
	   return true;
   } 
   /**
	Checks if the Team actually contains the TeamMember that is already being provided
   @param TeamMember m
   @return true if the TeamMember is actually in the team, false otherwise
   */
   public boolean contains(TeamMember m)
   {
	  for(int i = 0; i < numMembers; i++) {
		  if(team[i].equals(m)) {
			  return true;
		  }
	  }
      return false;
   } 
   /**
	Prints out all the members in the team
   @param None
   @return None
   */
   public void print()
   {
	   for(int i = 0; i < numMembers; i++) {
		   System.out.println(team[i].toString());  //prints each team members name and date
	   }
   } 
}
