package exercice2;

public class Player {
	//properties
	private String Name;
	private int Age;
	private String Gametype;
	
	//constructor without parameter
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructor with parameter
	public Player(String name, int age, String gametype) {
		super();
		Name = name;
		Age = age;
		Gametype = gametype;
	}
	
	//getter et setter

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGametype() {
		return Gametype;
	}

	public void setGametype(String gametype) {
		Gametype = gametype;
	}

	@Override
	public String toString() {
		return "Player's Name : " + Name + "\n Player's Age : " + Age + "\n Player's Gametype : " + Gametype ;
	}
	
	

	

	
	
	

	

	
	
	
	

}
