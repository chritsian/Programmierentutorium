package assignment2;

import java.util.Scanner;

public class InputHandler {
	
	private Scanner scanner;
	private Game game;
	
	public InputHandler() {
		scanner = new Scanner(System.in);
	}
	
	public void start() {
		System.out.print("Kommando: ");
		String s = scanner.nextLine();

		while(!s.equals("Exit")) {
			switch (s) {
				case "new": newGame();
					break;
				case "team1 goal": //Tor für Team 1
					break;
				case "team2 goal": //Tor für Team 2
					break;
				case "halbzeit": //Halbzeitstand soll ausgegeben werden
					break;
				case "game end": //Spiel beenden
					break;
				default: System.out.println("No valid command");
			}

			System.out.print("Kommando: ");
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
