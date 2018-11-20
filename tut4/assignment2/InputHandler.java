package assignment2;

import java.util.Scanner;

public class InputHandler {
	
	private Scanner scanner;
	private Game game;
	
	public InputHandler() {
		scanner = new Scanner(System.in);
	}
	
	public void start() {
		System.out.print("command: ");
		String s = scanner.nextLine();

		while(!s.equals("exit")) {
			switch (s) {
				case "new": newGame();
					break;
				case "team1 goal": //goal team 1
					break;
				case "team2 goal": //goal team 2
					break;
				case "halftime": //print halftime score here
					break;
				case "game end": //end game here
					break;
				default: System.out.println("No valid command");
			}

			System.out.print("command: ");
			s = scanner.nextLine();
		}
		
		scanner.close();
	}
	
	private void newGame() {
		
		//add code here
	
		System.out.print("Team1: ");
		String s = scanner.nextLine();
		
		// add code here
		
		System.out.print("Team2: ");
		s = scanner.nextLine();
		
		// add code here
		
	}

}
