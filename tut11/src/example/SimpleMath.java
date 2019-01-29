package example;

public class SimpleMath {
    
    private int x;
    private int y;
    
    public SimpleMath(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int add() {
        return x + y;
    }

    public int getX() {
        return x;
    }
}
