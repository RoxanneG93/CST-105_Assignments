
public class Main {
	
	private static NFL_Player_Manager nflManager = new NFL_Player_Manager();

	public static void main(String[] args) {
		// ======= Driver methods for NFL_PLAYER CLASS =======
		
//		Testing Default constructor
		NFL_Player playerOne = new NFL_Player();
//		testing toString method
		System.out.println(playerOne.toString());
		
		
//		Testing 2nd constructor 
	NFL_Player playerTwo = new NFL_Player("Patrick", "Mahomes", "Kansas City Cheifs", "Quarterback", "Texas Tech", "2nd Season", 6.3, 230, 23, 15);
		
	//	Testing toString methods and getFullName getter method
		System.out.println(playerTwo.toString());
		System.out.println(playerTwo.getFullName());
		
//		======= Driver Methods for NFL_PLAYER_MANAGER CLASS =========
		
//		New Player objects
		NFL_Player player1 = NFL_Player.createNewPlayer("Dak", "Prescott", "Dallas Cowboys", "Quarter Back", "Mississippi State", "3rd Season", 6.2, 235, 25, 4);
		NFL_Player player2 = NFL_Player.createNewPlayer("Ezekiel", "Elliot", "Dallas Cowboys", "Running Back", "Ohio State", "3rd Season", 6.0, 228, 23, 21);
		NFL_Player player3 = NFL_Player.createNewPlayer("Sean", "Lee", "Dallas Cowboys", "Line Back", "Penn State", "9th Season", 6.2, 245, 32, 50);
		NFL_Player player4 = NFL_Player.createNewPlayer("Todd", "Gurley", "Los Angeles Rams", "Running Back", "Georgia", "4th Season", 6.1, 224, 24, 30);
		NFL_Player player5 = NFL_Player.createNewPlayer("Drew", "Brees", "New Orleans Saints", "Quarter Back", "Purdue", "18th Season", 6.0, 209, 39, 9);
		NFL_Player player6 = NFL_Player.createNewPlayer("Julio", "Jones", "Atlanta Falcons", "Wide Receiver", "Alabama", "8th Season", 6.3, 220, 29, 11);
		
//		adding each new player -- need to come up with better method to make code more dry
		nflManager.addNewPlayer(player1);
		nflManager.addNewPlayer(player2);
		nflManager.addNewPlayer(player3);
		nflManager.addNewPlayer(player4);
		nflManager.addNewPlayer(player5);
		nflManager.addNewPlayer(player6);
		
//		print all players
		nflManager.printPlayers();

	}

}
