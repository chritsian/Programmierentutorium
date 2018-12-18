package example.generics;

import java.util.Iterator;
import java.util.List;

import edu.kit.informatik.terminal.Terminal;

public class Main {

    public static void main(String[] args) {
        Calculator<Integer> calcI = new Calculator<Integer>(5, 4);
        Terminal.printLine(calcI.addInt());
        Terminal.printLine(calcI.addDouble());
        
        Calculator<Double> calcD = new Calculator<Double>(5.0, 4.5);
        Terminal.printLine(calcD.addInt());
        Terminal.printLine(calcD.addDouble());
        // Calculator<String> calcS;
    }
    
    
    private static int wildCardExampleUpperBound(List<? extends Number> list) {
        Iterator<? extends Number> iter = list.iterator();
        int n= 0;
        while (iter.hasNext()) {
           n += iter.next().intValue();
            
        }
        return n;
    }
    
    private static void wildCardExampleLowerBound(List<? super Integer> list) {
       /*
        * Object o = new Integer(5);
        */
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
    }


}
