package edu.kit.informatik;

public class ExceptionExample {
    
    public static void main(String[] args) {
       
        try {
           
            String s = args[1];
            Terminal.printLine(s);
           
        } catch(IndexOutOfBoundsException i) {
            i.printStackTrace();
            Terminal.printError("Nicht genug Argumente");
        }
        example();
       //example();
    }
    
    private static void example() {
        int[] array = new int[3];
        array[5]++;
    }

}
