// Student Roxanne Garcia
// My attempt of creating the NFL_Player class and all it's properties. 
public class NFL_Player {

// setting 10 properties	
	private String firstName;
	private String lastName;
	private String currentTeam;
	private String postition;
	private String college;
	private String experience;
	private double height;
	private int weight;
	private int age;
	private int teamNo;
	
	
	//	constructor for ALL properties
	public NFL_Player(String firstName, String lastName, String currentTeam, String postition, String college,
				String experience, double height, int weight, int age, int teamNo) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.currentTeam = currentTeam;
			this.postition = postition;
			this.college = college;
			this.experience = experience;
			this.height = height;
			this.weight = weight;
			this.age = age;
			this.teamNo = teamNo;
		}

	// Constructor with no properties - Default settings
	public NFL_Player() {
		this("Will", "Turner", "team: NA", "position: NA", "University: NA", "experience: NA", 6, 200, 25, 90);
	}
	
	//	3rd constructor to add new player object
	public static NFL_Player createNewPlayer(String firstName, String lastName, String currentTeam, String postition, String college,
				String experience, double height, int weight, int age, int teamNo) {
		return new NFL_Player(firstName, lastName, currentTeam, postition, college,
				experience, height, weight, age, teamNo);
		}
	
	
	//	Setters and Getters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCurrentTeam() {
		return currentTeam;
	}
	public void setCurrentTeam(String currentTeam) {
		this.currentTeam = currentTeam;
	}
	public String getPostition() {
		return postition;
	}
	public void setPostition(String postition) {
		this.postition = postition;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	
//	======= two other Getter methods =======
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
	
//	("Will", "Turner", "team: NA", "position: NA", "University: NA", "experience: NA", 6, 200, age: 25, 90)
	public String getAllStats() {
		return "FullName: "  + getFullName() + " Team No: " + this.getTeamNo() +  " currentTeam:  " +  this.getCurrentTeam() + " University: " + this.getCollege() + 
				" Experience: " + this.getExperience() + " Height: " + this.getHeight() + " Weight: " + "lbs Age: " + this.getAge();
	}
	
//	toString method?
	@Override
	public String toString() {
		 return getAllStats();
	}	



}
