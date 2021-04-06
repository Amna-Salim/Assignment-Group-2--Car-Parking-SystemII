import java.util.Observable;

// A database with two counter components

import java.util.*;  // For Observable
import javax.swing.JTextField;

public class System_status extends Observable {

    private boolean active = false;
    private boolean deactivate = true;
    private JTextField display;
    private boolean systemActive = false;
    private String[] log;
    private Date today;
 
    // constructor
    public System_status() { 
        today = new Date();
    }             

  // code for active button
   public void active() {                
       systemActive = true;
       setChanged();
       notifyObservers();                 
    } // activate

   //code for deactivate button
   public void deactivate() {                
        systemActive = false;
        setChanged();
        notifyObservers();                 
    } //deactivate

    // code to get system status
    public boolean getStatus() {
        return systemActive;
    } // getStatus

    //code to get todays date 
    public Date getToday() {
        return today;
    }
  
    public void clear() {
        display.setText("");     
    }
    
}
