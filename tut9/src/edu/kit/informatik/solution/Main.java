package edu.kit.informatik.solution;

import java.util.List;

import edu.kit.informatik.Terminal;
import edu.kit.informatik.solution.exception.FileSizeException;

public class Main {

    public static void main(String[] args) {
        
        SmallFileReader sf;
        
        try {
            sf = new SmallFileReader(args[0]);
            List<String> list = sf.read();
            for (int i = 0; i < list.size(); i++) {
                Terminal.printLine(list.get(i));
            }
        } catch(IndexOutOfBoundsException a) {
            Terminal.printError("Argument Missing");
        } catch (FileSizeException e) {
            Terminal.printError(e.getMessage());
        }
        
        
    }

}
