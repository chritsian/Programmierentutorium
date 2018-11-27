package s_a2;

import java.util.Scanner;

public class InputHandler {
	
	private Scanner scanner;
	private Game game;
	
	public InputHandler()	 {
		scanner = new Scanner(System.in);
	}

	//no Execption handling implemented here, NullPointerException can occur

	public void start() {
		System.out.print("command: ");
		String s = scanner.nextLine();

		while(!s.equals("exit")) {
			switch (s) {
				case "new": newGame();
					break;
				case "start": game.start();
					break;
				case "team1 goal": game.goal1();
					break;
				case "team2 goal": game.goal2();
					break;
				case "halftime": game.halftime();
					break;
				case "game end": game.end(); game = null;
					break;
				default: System.out.println("No valid command");
			}

			System.out.print("command: ");
			s = scanner.nextLine();
		}
		
		scanner.close();
	}
	
	private void newGame() {
		
		game = new Game();
		
		System.out.print("Team1: ");
		String s = scanner.nextLine();
		
		Team team = new Team(s);
		game.setTeam1(team);
		
		System.out.print("Team2: ");
		s = scanner.nextLine();
		
		game.setTeam2(new Team(s));
	}

}
