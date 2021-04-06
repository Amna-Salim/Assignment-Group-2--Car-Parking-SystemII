import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class Barrier extends JFrame implements Observer, ActionListener {
    
    private Vehicle_list lnkVehicle_list;
    private System_status lnkSystem_status;
    private boolean active = false;
    private String rNumber;
    private String visitday;
    private String Date;
    private boolean raised = false;
    private Campus_security campussecurity1;
    private JButton Checking;  
    private JTextField display;   
    private JTextField tx;
    private JLabel lblName;
    private JTextField txtName;
    private JLabel lblName1;
    private JTextField txtName1;
    private JLabel RaisedUp1;
    private JLabel isLowered1;
    
    public Barrier(System_status lnkSystem_status, Vehicle_list lnkVehicle_list)
   {
         setTitle("Barrier");
         setLocation(30,50);
         setSize(250,200);
         setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         Container window = getContentPane();
         window.setLayout(new FlowLayout());   
        
         JLabel label = new JLabel("Enter Number:");
         add(label);
         display = new JTextField("", 20);
         add(display);
         tx = new JTextField("The Barrier is:", 20);
         add(tx);
         Checking = new JButton("Checking");
         window.add(Checking);
         Checking.addActionListener(this);
         RaisedUp1 = new JLabel("Raised ");
         window.add(RaisedUp1);   
         isLowered1 = new JLabel("Lowered");
         window.add(isLowered1);
        
         setVisible(true);
         this.lnkSystem_status = lnkSystem_status;
         this.lnkVehicle_list = lnkVehicle_list;
         lnkSystem_status.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        active = lnkSystem_status.getStatus();
        
        //Checking barrier and permission       

        if(active == false)
        {
        tx.setText("Lower Barrier");
        isLowered1.setEnabled(true);
        RaisedUp1.setEnabled(false);
        }
       
        if (active == true && raised == false)
        { tx.setText("Lower Barrier");
         isLowered1.setEnabled(true);
         RaisedUp1.setEnabled(false);
         }
     
        if(active == true && raised == true)
        {
           tx.setText("Lift Barrier");
          RaisedUp1.setEnabled(true);
          isLowered1.setEnabled(false);
        }
     }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        //Check permitted vehicle code by calling method
        if (arg0.getSource() ==Checking )
        { 
        // code to get date from the full date
        Calendar Date = Calendar.getInstance();
        int day = Date.get(Calendar.DAY_OF_MONTH);
        //get registration number
        rNumber = display.getText();
        raised = lnkVehicle_list.PermissionCheck(rNumber, day);            
       }  
    }
}