//Controller source file
package main;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {
	FootBall football = new FootBall();
	VolleyBall volleyball = new VolleyBall();
	Tennis tennnis = new Tennis();
	Chess chess = new Chess();
	Relay relay = new Relay();
	private String pName="Anirudh";
	private String selectedSports[] = {"Chess","Football"};
	DbHelper h = new DbHelper();
	private String mode[] = {"Group","Individual"};
	
	//Check if registration limit is Full
	@RequestMapping(/DbHelper)
	public void registerIndividualParticipant(){
		football.setParticipantName(pName);
		boolean b = h.checkRegistrationLimit();
		// if return false
		if(!b){
		System.out.println("Registraion Limit is full");	
		}
		else if  (checkConstraint()){
			System.out.println("this participant has already regitered for 3 sports");
			
			
		}
	}
	//Deregister from the sport
	@RequestMapping(/DbHelper)
	public void deRegisterSport(){
		Sports sport = new Sports();
		//getters and setters of participant name,ID etc
		boolean b = h.deRegisterSport(sport);
		if(b)
		System.out.println("you have deresistered from the sport successfully");
		else{
			Team team = new Team();
			//Individual participant registered successfully
			boolean b = h.registerIndividualParticipant(pName,selectedSports,team);
			if(b)
			System.out.println("Individual participant registered successfully");
			else
			System.out.print("There was an error in registering the participant");
		}
		
	}
	//Code to deregister and entire team
	@RequestMapping(/DbHelper)
	public void deRegisterTeam(){
		Team t = new Team();
		/*getters and setters of team,
		that is get the data like participant name,team name 
		and send it to de register and entire team*/
		boolean b = h.deRegisterTeam(t);
		if(b)
		System.out.println("The team has been successfully deregistered");
		
	}
	//Check maximum number of sports registered by participants
	public boolean checkConstraint(){
		boolean b = h.maxSports(selectedSports);
		if(b!=true){
			System.out.println("Cannot register for more than 3 sports");
		}
		return true;
	}
	//Creates a team
	@RequestMapping(/DbHelper)
	public void createTeam(){
		List<String> participantName = new ArrayList<String>();
		participantName.add("Anirudh");
		participantName.add("Bhargav");
		String sportName = "Tennis";
		String teamName = "UTA";
		boolean b = h.createTeam(participantName, teamName, sportName);
		if(b)
		System.out.println("The participant was successfully added");
		else
		System.out.println("There was an error(s) creating a team.");
		
	}
	//Update team participant
	@RequestMapping(/DbHelper)
	public void updateTeam(){
		List<Team> team = h.getTeamList();
		String getSelectedTeam = "UTA";
		String participantName = "Anirudh";
		String sportName = "FootBall";
		
		boolean b = h.updateTeam(getSelectedTeam, participantName, sportName);
		if(b){
			//update success;
			}
		else{
			// there was an error updating the database;
		}
				
	}

}
