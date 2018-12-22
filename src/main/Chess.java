package main;

public class Chess extends Sports {
	private int sportID = 1;
	final int min = 2;
	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
	public int getTeamSize() {
		return teamSize;
	}
	final int max = 20;
	final int teamSize = 2;
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
