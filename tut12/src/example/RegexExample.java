package example;

import edu.kit.informatik.task.ui.Terminal;

public class RegexExample {
    
    public static final String NUMBER_REGEX = "\\d+";
    public static final String VARIABLE_NAME_REGEX = "[a-z].*";
    

    public static void main(String[] args) {
        
        String input = "test";
                
        Terminal.printLine(input.matches(NUMBER_REGEX));
        
        input = "245425";
        
        Terminal.printLine(input.matches(NUMBER_REGEX));
        
        Terminal.printLine("aVariable".matches(VARIABLE_NAME_REGEX));
        
        Terminal.printLine("FalseVariableName".matches(VARIABLE_NAME_REGEX));

    }

}
