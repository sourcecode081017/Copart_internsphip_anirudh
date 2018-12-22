package main;

public class Relay extends Sports {
	private int sportID = 1;
	final int min = 20;
	final int max = 80;
	final int teamSize = 4;
	public int getSportID() {
		return sportID;
	}
	public void setSportID(int sportID) {
		this.sportID = sportID;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	private String teamName;
	private String participantName;

}
