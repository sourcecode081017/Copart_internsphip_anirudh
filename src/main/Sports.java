package main;
//Sport POJO is base class. This class is inherited by Sports classes such as football,tennis etc
import java.util.HashMap;
//Sports POJO Class. Has the sports table, max limit and number of registrations
public class Sports {
	//Consists of the Sports name and the max Limit
	private HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
	//Hash map to set sport name and max limit
	public void setHashMap(){
	
	hashMap.put("Relay",50);
	hashMap.put("FootBall",80);
	hashMap.put("VolleyBall",50);
	hashMap.put("Tennis",50);
	hashMap.put("Chess",20);
	
	}
    
	public int getNoOfRegistrations() {
		return noOfRegistrations;
	}
	public void setNoOfRegistrations(int noOfRegistrations) {
		this.noOfRegistrations = noOfRegistrations;
	}
	private int noOfRegistrations ;

}
