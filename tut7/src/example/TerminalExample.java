package example;

public class TerminalExample {

    public static void main(String[] args) {
        
        
        Terminal.printLine("Zahl eingeben: ");
        String s = Terminal.readLine();
        int i = 0;
        
        try {
           i = Integer.valueOf(s); 
        } catch (NumberFormatException e) {
            Terminal.printError("keine gültige Zahl");
        }
        
        Terminal.printLine(i * i);
        
        
        //read file example
        //task: print the file, an empty line means to print a paragraph 
        
        String[] data = Terminal.readFile(/*your path to example.txt*/);
        String temp = "";
        
        for (int j = 0; j < data.length; j++) {
            if(data[j].equals("")) {
                Terminal.printLine(temp);
                temp = "";
            } else {
                temp += data[j]; 
            }
        }
        Terminal.printLine(temp);
    }

}
