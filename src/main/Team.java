package main;

import java.util.List;

public class Team {
 private String teamName=null;
 public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public List<String> getpName() {
	return pName;
}
public void setpName(List<String> pName) {
	this.pName = pName;
}
public String getSportName() {
	return sportName;
}
public void setSportName(String sportName) {
	this.sportName = sportName;
}
private List<String> pName = null;
 private String sportName = null;
 
}
