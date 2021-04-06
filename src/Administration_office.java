import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Administration_office extends JFrame implements Observer, ActionListener {
private Permit_list lnkPermit_list;
private Vehicle_list lnkVehicle_list;
private System_status lnkSystem_status;
private JLabel lblName;
private JTextField txtName;
private JLabel lblName1;
private JTextField txtName1;
private JLabel lblName2;
private JTextField txtName2;
private JLabel lblName3;
private JTextField txtName3;
private JLabel lblName4;
private JTextField txtName4;
private JButton addVehicle;
private JButton printVehicle; 
private JButton removeVehicle;
private JButton ModifyVehicle;
Permit PermitLC = null;
private JComboBox<String> cmbPermitType;
String[] permitTypes = { "Day Visitor", "Regular Visitor", "Permanent Visitor", "University Member" };
private JLabel lblName5;
private JTextField txtName5;
private JLabel lblName6;
private JTextField txtName6;
private JLabel lblName7;
private JTextField txtName7;
private JLabel lblName8;
private JTextField txtName8;
private JLabel lblName10;
private JTextField txtName10;
private JLabel lblName11;
private JTextField txtName11;
private JLabel lblwarningRecorded;
private JTextField ldlblwarningRecorded;
private JButton addPermit;
private JButton removePermit;
private JButton printPermit;
private JButton Warning;


    public Administration_office(Vehicle_list lnkVehicle_list,Permit_list lnkPermit_list) {
         // this code for the Administration_office screan design 
         setTitle("Administration_office");
         setLocation(900,70);
         setSize(350,650);
         setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         Container window = getContentPane();
         window.setLayout(new FlowLayout());  
         //this part for vehicle
         lblName =new JLabel("Registration No:");
         window.add(lblName); 
         txtName = new JTextField("",25);
         window.add(txtName);
         lblName1 =new JLabel("car Name:");
         window.add(lblName1);
         txtName1 = new JTextField("",25);
         window.add(txtName1);
         lblName2 =new JLabel("car Color:");
         window.add(lblName2);
         txtName2 = new JTextField("",25);
         window.add(txtName2);
         lblName3 =new JLabel("car type:");
         window.add(lblName3);
         txtName3 = new JTextField("",25);
         window.add(txtName3);
         lblName4 =new JLabel("car Model:");
         window.add(lblName4);
         txtName4 = new JTextField("",25);
         window.add(txtName4);
         addVehicle = new JButton("Add Vehicle");
         window.add(addVehicle);
         addVehicle.addActionListener(this);
         printVehicle = new JButton("Print Vehicle");
         window.add(printVehicle);
         printVehicle.addActionListener(this);
         removeVehicle = new JButton("Remove");
         window.add(removeVehicle);
         removeVehicle.addActionListener(this);
         ModifyVehicle = new JButton("Modify");
         window.add(ModifyVehicle);
         //this part for permit
         ModifyVehicle.addActionListener(this);
         lblName = new JLabel("Select permit type: ");
         window.add(lblName);
         cmbPermitType= new JComboBox(permitTypes); 
         cmbPermitType.setSelectedIndex(0);
         window.add(cmbPermitType);
         lblName6=new JLabel("Visit Day:");
         window.add(lblName6);
         txtName6 = new JTextField("",25);
         window.add(txtName6);
         lblName7=new JLabel("End Day:");
         window.add(lblName7);
         txtName7 = new JTextField("",25);
         window.add(txtName7);
         lblName8=new JLabel("car Owner Name:");
         window.add(lblName8);
         txtName8 = new JTextField("",25);
         window.add(txtName8);
         lblName10=new JLabel("No of Entries:");
         window.add(lblName10);
         txtName10 = new JTextField("",25);
         window.add(txtName10);
         lblName11=new JLabel("No of Warning:");
         window.add(lblName11);
         txtName11 = new JTextField("",25);
         window.add(txtName11);
         addPermit= new JButton("Add Permit");
         window.add(addPermit);
         addPermit.addActionListener(this);
         removePermit= new JButton("Remove Permit");
         window.add(removePermit);
         removePermit.addActionListener(this);
         printPermit = new JButton("Print Permit");
         window.add(printPermit);
         printPermit.addActionListener(this);
         setVisible(true);
         this.lnkVehicle_list = lnkVehicle_list;
         this.lnkPermit_list= lnkPermit_list;

    }

    @Override
    public void update(Observable arg0, Object arg1) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // addVehicle code
        if (e.getSource() == addVehicle)
        {
            
        if (!lnkVehicle_list.checkPermit(txtName.getText()))
            {
             PermitLC = lnkPermit_list.getPermit(txtName1.getText()); 
             lnkVehicle_list.add(PermitLC,txtName.getText(),txtName1.getText(),txtName2.getText(),txtName3.getText(),txtName4.getText(),txtName10.getText(),txtName11.getText());
             System.out.println("Added Vehicle");
            }
        else
            {
             System.out.println("The vehicle registration number is already added");
            }
        }
        
        // printVehicle code
        if (e.getSource() == printVehicle)
            {
             lnkVehicle_list.print();
            }
        // removeVehicle code
        if (e.getSource() == removeVehicle)
            {
             String vehicleStatue= lnkVehicle_list.removeVehicle(txtName.getText());
             System.out.println("The  Vehicle car name is: " +txtName.getText()+"isremoved from the table");
            }
        // addPermit code
        if (e.getSource() == addPermit)
            { 
        //add Regular Visitor Permit
        if (((String)cmbPermitType.getSelectedItem()).equals("Regular Visitor")) 
            {
             lnkPermit_list.addRegularVisitor(txtName1.getText(),txtName6.getText(),txtName7.getText(),txtName8.getText(),txtName10.getText(),txtName11.getText());
             System.out.println("Added Regular Visitor");
            }
        //add Day Visitor Permit
        if (((String)cmbPermitType.getSelectedItem()).equals("Day Visitor")) 
            {
             lnkPermit_list.addDayVisitor(txtName1.getText(), txtName6.getText(), txtName8.getText());
             System.out.println("Added Day Visitor");
            } 
        //add Permanent Visitor Permit
        if (((String)cmbPermitType.getSelectedItem()).equals("Permanent Visitor")) 
            {
             lnkPermit_list.addPermanentVisitor(txtName1.getText());
             System.out.println("Added Permanent Visitor");
            }
        //add University Member Permit
        if (((String)cmbPermitType.getSelectedItem()).equals("University Member")) 
            {
             lnkPermit_list.addUniversityMember(txtName1.getText(), txtName6.getText());
             System.out.println("Added University Member");
            }
         }
                     
        // ModifyVehicle code
        if (e.getSource() == ModifyVehicle)
             {
              lnkVehicle_list.modify();
             } 
          
        // printPermit code 
        if (e.getSource() == printPermit)
             {
              lnkPermit_list.printPermit();
             }
           
        // removePermit code 
        if (e.getSource() == removePermit)
             {
              String permitStatue=
              lnkPermit_list.removePermit(txtName1.getText());
              System.out.println("The  permit car name is: " +txtName1.getText()+"is:"+permitStatue);
             } 
             
        // Warning code      
        if (e.getSource() == Warning)
             {
              //lnkPermit_list.printPermit();
             } 

    }  
}