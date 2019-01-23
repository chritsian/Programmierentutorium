package edu.kit.informatik.task1;

import edu.kit.informatik.Terminal;

public class Main {

    private static final String QUIT_COMMAND = "quit";
    private static final String ERROR_MESSAGE = "input too short";
    
    public static void main(String[] args) {
        
        String userInput = Terminal.readLine();
        
        while (!userInput.equals(QUIT_COMMAND)) {
            
            if (userInput.length() < 1) {
                Terminal.printError(ERROR_MESSAGE);
            } else {
                Terminal.printLine(isPalindrom(userInput));
            }
                     
            userInput = Terminal.readLine();
        }
    }

    private static boolean isPalindrom(String userInput) {
        char[] inputArray = userInput.toCharArray();
        if (userInput.length() < 2) {
            return true;
        } else if (inputArray[0] == inputArray[inputArray.length - 1]){
            StringBuilder sb = new StringBuilder(userInput);
            sb.deleteCharAt(userInput.length() - 1);
            sb.deleteCharAt(0);
            return isPalindrom(sb.toString());
        } else {
            return false;
        }
    }

}
