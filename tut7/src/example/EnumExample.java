package example;

public class EnumExample {
    
    
    public static void main(String args[]) {
        
        Month month = Month.JANUARY;
        Terminal.printLine(month);
        Terminal.printLine(month.getDays());
    }

}
