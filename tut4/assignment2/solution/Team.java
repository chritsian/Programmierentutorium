package s_a2;

public class Team {
	
	private String name;
	private int goals;
	
	//add constructor here
	public Team(String name) {
		this.name = name;
		goals = 0;
	}
	
	//add methods here
	public void goal() {
		goals++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGoals() {
		return goals;
	}
}
