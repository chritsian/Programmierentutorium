package edu.kit.informatik.task2;

import edu.kit.informatik.Terminal;

public class Main {

    public static void main(String[] args) {
        
       BinomialImplementation binom = new BinomialImplementation();
       String userInput = "";
       
       while (!userInput.equals("stop")) {
           
           try {
               Terminal.printLine("Erste Zahl eingeben: ");
               int n = Integer.valueOf(Terminal.readLine());
               
               Terminal.printLine("Zweite Zahl eingeben: ");
               int k = Integer.valueOf(Terminal.readLine());
               
               Terminal.printLine(binom.binom(n, k));
               Terminal.printLine(binom.binomRek(n, k));
               
           } catch (NumberFormatException e) {
               Terminal.printLine("Als Eingabe sind nur Integer Zahlen zulässig.");
           } catch (IllegalArgumentException e) {
               Terminal.printLine(e.getMessage());
           }
           
           Terminal.printLine("Press Enter to continue or write \"quit\" to stop...");
           
           userInput = Terminal.readLine();
       }
    }

}
