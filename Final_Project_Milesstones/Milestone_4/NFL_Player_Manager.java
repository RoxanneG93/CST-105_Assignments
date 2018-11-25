// Student Roxanne Garcia
// Not sure what to change on this part?
import java.util.ArrayList;

public class NFL_Player_Manager {
	
	private ArrayList<NFL_Player> myPlayers;

//	constructor for NFL players arraylist
	public NFL_Player_Manager() {
		this.myPlayers = new ArrayList<NFL_Player>();
	}
	
//	Add Player method
	public boolean addNewPlayer(NFL_Player player) {
		myPlayers.add(player);
		return true;
	}
		
	
//	 FIND CONTACT method
	private int findPlayer(NFL_Player player) {
		return this.myPlayers.indexOf(player);
	}
	
	
//	FIND Contact converting to string?
	public String queryPlayers(NFL_Player player) {
		if(findPlayer(player) >=0) {
			return player.getAllStats();
		}
		return null;
	}
	
//	Print Players method
	public void printPlayers() {
		System.out.println("Players List");
		for(int i=0; i<this.myPlayers.size(); i++) {
			System.out.println((i+1) + "." + 
			this.myPlayers.get(i).getAllStats());
		}
	}
	
	

}