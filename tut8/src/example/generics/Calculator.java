package example.generics;

public class Calculator<T extends Number> {
    
    private T param1;
    private T param2;

    public Calculator(T param1, T param2) {
        this.param1 = param1;
        this.param2 = param2;
    }
    
    public int addInt() {
        return param1.intValue() + param2.intValue();
    }
    
    public double addDouble() {
        return param1.doubleValue() + param2.doubleValue();
    }

}
