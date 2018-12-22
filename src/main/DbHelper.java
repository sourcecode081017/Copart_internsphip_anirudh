//Database backend logic
package main;

import java.util.ArrayList;
import java.util.List;

public class DbHelper {
	public boolean maxSports(String[] arr){
		if(arr.length>3)
			return false;
		else
			return true;
	}
	public boolean createTeam(List<String> participants,String teamName,String sportName){
		if(participants==null ||teamName==null||sportName ==null){
			System.out.println("Team name of name of participant cannot be empty");
			return false;
		}
		//Iterate through the list and add to the data base each participant,team name 
		//and corresponing sport.
		// create table and insert into table query goes here
		return true;
	}
	Team t = new Team();// calling team constructor by Rest api
	public List<Team> getTeamList(){
		/*from the database return list object which contains participant name
		 * sports name and team name
		 */
		List<Team> team = new ArrayList<Team>();
		return team;
	}
	
   public boolean updateTeam(String teamName,String participantName,String sportName){
	   //update query on the Sport team goes here using 
	   return true;
   }
   public boolean checkRegistrationLimit(){
   //query the sports database to check if registration limit is full
   //if not return false.
	   return true;
   }
public <Sport> boolean deRegisterSport(Sport sport) {
	// code to de resigter a sport from a back end;
	return false;
}
public boolean deRegisterTeam(Team t2) {
	// getters and setters of the team object with constists team name
	// delete the team from the database..
	//this deletes other entries in sports table and entire participants 
	//are removed
	//participants of other team of sports are retained
	return false;
}
public boolean registerIndividualParticipant(String pName, String[] selectedSports, Team team) {
	// Code to register individual participant in the database
	return false;
}
   
}
