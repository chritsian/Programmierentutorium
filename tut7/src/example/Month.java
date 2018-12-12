package example;

public enum Month {
    
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30);
    
    private final int days;
    
    private Month (int days) {
        this.days = days;
    }
    
    public int getDays() {
        return days;
    }
    
    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

}
