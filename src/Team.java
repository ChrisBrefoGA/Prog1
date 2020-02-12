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
	   for(int i = 0; i < numMembers; i++) {
		   if(team[i] == m) {
			   return i;
		   }
	   }
       return NOT_FOUND;
   }
   
   private void grow() //doubles array size when array is filled
   {
       TeamMember[] newArray = new TeamMember[2*GROW_SIZE];
       for(int i = 0; i < GROW_SIZE; i++) {
    	   newArray[i] = team[i];
       }
       team = newArray;
   }
   
   public boolean isEmpty()
   {
	   if(numMembers == 0) return true;	   
       return false;
   }
   
   public void add(TeamMember m)
   {     
	   if(numMembers == GROW_SIZE) {
		   this.grow();
	   }
	   
       team[numMembers] = m;
       numMembers++;
   }
   
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
   
   public boolean contains(TeamMember m)
   {
	  for(int i = 0; i < numMembers; i++) {
		  if(team[i].toString().equals(m.toString())) {
			  return true;
		  }
	  }
      return false;
   } 
   
   public void print()
   {
	   for(int i = 0; i < numMembers; i++) {
		   System.out.println(team[i].toString());  //prints each team members name and date
	   }
   } 
}
