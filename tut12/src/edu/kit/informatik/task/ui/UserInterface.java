package edu.kit.informatik.task.ui;

import edu.kit.informatik.task.ArithmeticParser;
import edu.kit.informatik.task.ParseException;

/**
 * Provides a UserInterface to interact with the parser.
 * 
 * @author christian
 *
 */
public class UserInterface {
    
    private ArithmeticParser arithmeticParser;

    /**
     * starts the UI
     * 
     * @param args run arguments
     */
    public static void main(String[] args) {
        
           UserInterface ui = new UserInterface(new ArithmeticParser());
           ui.start();
    
    }
    
    private UserInterface(ArithmeticParser arithmeticParser) {
        this.arithmeticParser = arithmeticParser;
    }

    private void start() {
        
        String input = Terminal.readLine();
        
        while (!input.equals("quit")) {
            
          String[] splitInput = input.split(" ");
          
          if (splitInput.length != 2) {
              Terminal.printError("Wrong format.");
          } else {
              checkCommands(splitInput);
          }
          input = Terminal.readLine();
            
        }
    }
    
    private void checkCommands(String[] input) {
        
        arithmeticParser.setString(input[1]);
        
        switch (input[0]) {
        
            case "calculate": 
                try {
                    arithmeticParser.setString(input[1]);
                    Terminal.printLine(arithmeticParser.parseArithmetic());
                } catch (ParseException p) {
                    Terminal.printError(p.getMessage());
                } 
                break;
                
            case "bracketCheck":
                Terminal.printLine(arithmeticParser.checkBrackets());
                break;
                
            default: Terminal.printError("no valid command.");
        
        }
    
    }

    

}
