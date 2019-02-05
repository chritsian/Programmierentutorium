package edu.kit.informatik.task;

public class ArithmeticParser {

    private String input;
    
    public ArithmeticParser() {
        
    }
    
    public ArithmeticParser(String input) {
        this.input = input;
    }
    
    public void setString(String input) {
        this.input = input;
    }
    
    public boolean checkBrackets() {
        int count = 0;
        char[] c = input.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if(c[i] == '(') {
                count++;
            } else if(c[i] == ')') {
                count--;
            }
            if(count < 0) {
                return false;
            }
        }
        if(count != 0) {
            return false;
        }
        
        return true;
    }
    
    public int parseArithmetic() throws ParseException {
        
        int a;
        int b;
        
        //funktioniert auch ohne oder Verknüpfung ;)
        if(!input.matches("\\d+[\\+\\*/-][\\d]+")) {
            throw new ParseException("No valid operation");
        }
        
        try {
            String[] splitInput = input.split("[\\+|\\*|/|-]");
            a = Integer.valueOf(splitInput[0]);
            b = Integer.valueOf(splitInput[1]);
        } catch (NumberFormatException n) {
            throw new ParseException("Invalid Numbers.");
        }
        
        if(input.matches("[\\d]+\\+[\\d]+")) {
            return a + b;
        } else if(input.matches("[\\d]+\\*[\\d]+")) {
            return a * b;
        } else if(input.matches("[\\d]+\\-[\\d]+")) {
            return a - b;
        } else if(input.matches("[\\d]+/[\\d]+")) {
            return a / b;
        } 
        
        throw new ParseException("Unknown Error");
    }
    
    

}
