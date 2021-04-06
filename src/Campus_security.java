import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class Campus_security extends JFrame implements Observer, ActionListener{
    
    private Vehicle_list lnkVehicle_list;
    private System_status lnkSystem_status;
    private System_status vehicleList;
    private System_status systemStatus;
    private Campus_security campusSecurity1;
    private JButton active;            
    private JButton deactivate; 
    private JButton warning; 
    private JButton check;
    private JTextField text22;
    private JTextField lab22;
    private JButton Closing;
    private System_status system_status1;
    

    public Campus_security(System_status system_status1, Vehicle_list vehicleList){
        
        setTitle("Campus security");
        setLocation(60,300);
        setSize(300,130);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
    
        active = new JButton("Active");
        window.add(active);
        active.addActionListener((ActionListener) this);
        deactivate = new JButton("Deactivate");
        window.add(deactivate);
        deactivate.addActionListener((ActionListener) this);
        warning = new JButton("Warning");
        window.add(warning);
        warning.addActionListener((ActionListener) this);
        check = new JButton("Checking");
        window.add(check);
        check.addActionListener((ActionListener) this);
        Closing = new JButton("Close");
        window.add(Closing);
        Closing.addActionListener(this);
        
        setVisible(true);
        this.lnkSystem_status = system_status1;
        this.lnkSystem_status.addObserver(this);
 }

   
    @Override
    public void actionPerformed(ActionEvent arg0) {
        //code for each buttons used in the campus security screen
            if (arg0.getSource() == active) 
            {
            lnkSystem_status.active(); 
            }
            else if (arg0.getSource() == deactivate) 
            {
            lnkSystem_status.deactivate(); 
            }
            else if(arg0.getSource() == warning) 
            {
              
            }
             else if(arg0.getSource() == check) {
            
            }
                  
           else if(arg0.getSource() == Closing) 
            {
             System.exit(0);
           }
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
