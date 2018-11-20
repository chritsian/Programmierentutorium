package s_a2;

public class Game {
	
	private Team team1;
	private Team team2;
	private boolean gameRunning;
	
	public Game() {
		gameRunning = false;
	}
	
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	
	public void start() {
		if(gameRunning == false) {
			gameRunning = true;
			print("Spielstart " + team1.getName() + " " + team2.getName());
		} else {
			print("Spiel läuft schon.");
		}
	}
	
	public void halftime() {
		if(gameRunning == true) {
			print("Halbzeit.");
			printScore();
		} else {
			print("Spiel hat noch nicht begonnen.");
		}
	}
	
	public void goal1() {
		team1.goal();
		printScore();
	}
	
	public void goal2() {
		team2.goal();
		printScore();
	}
	
	public void end() {
		if(gameRunning == true) {
			gameRunning = false;
			print("Spielende " + team1.getName() + " " + team2.getName());
			printScore();
		} else {
			print("Spiel hat noch nicht begonnen.");
		}
	}
	
	private void printScore() {
		print("Spielstand " + team1.getGoals() + " : " + team2.getGoals());
	}
	
	private void print(String s) {
		System.out.println(s);
	}
}
