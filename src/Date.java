


public class Date {
    
    private int dayNumber;

    public Date() {
        dayNumber = 31;
    }
    
    public void increment() {
        
        dayNumber = dayNumber++;
        if(dayNumber > 365)
            dayNumber = 1;

    }
    
}
