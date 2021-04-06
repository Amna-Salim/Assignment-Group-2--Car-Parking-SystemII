
import java.util.Enumeration;
import java.util.Hashtable;


public class Vehicle_list {
private java.util.Hashtable lnkVehicle;
private Vehicle_info Vehicle_info;
private boolean flag = false;
// Constructor to initialize hashtable
public Vehicle_list() 
   {
    lnkVehicle = new Hashtable();
   }
// Code to check hashtable contains key
public boolean checkPermit(String s)
   {
    return lnkVehicle.containsKey(s);
   }
//Code to check Permission of Vehicles
public boolean PermissionCheck(String a, int day1)
   {
    if(lnkVehicle.containsKey(a))
   {
      // Retrieving data from the hashtable for checking
      String Permittype    =  ((Vehicle_info)lnkVehicle.get(a)).getPermitType();
      System.out.println("The Permit type is " +Permittype);
      String visitday   =  (((Vehicle_info)lnkVehicle.get(a)).getVisitday());
      System.out.println("The Visit day is " +visitday);
      String a4   =  (((Vehicle_info)lnkVehicle.get(a)).getEndday());
      System.out.println("The Endday is " +a4);
      System.out.println("date is " +day1);
    if (Permittype == "Regular visitor")
   {
    if(day1>= Integer.parseInt(visitday) && day1<= Integer.parseInt(a4))
   {
    flag = true;
    System.out.println("Permit allowed for regular visitor");
   }
    else
   {
    flag = false;
    System.out.println("Permit not allowed for regular visitor");
   }
  } 
            
    //check day visitor
    if (Permittype == "Day visitor")
   {
    if(day1== Integer.parseInt(visitday))
   {
    flag = true;
    System.out.println("Permit allowed for day visitor");
   }
    else
   {
    flag = false;
    System.out.println("Permit not allowed for day visitor");
   }
  } 
             
    //check University Member
    if (Permittype == "University member visitor")
    {
    flag = true;
    System.out.println("Permit allowed for University Member");   
    }
    //check Permanent Visitor     
    if (Permittype == "Permanent Visitor ")
    {
    flag = true;
    System.out.println("Permit allowed for Permanent Visitor");
    }
  } 
    else
    {
    System.out.println("Not availabe the vehicle registration number");
    } 
        
    return flag;
    }

  // add vehicle details        
    
    public void add(Permit paPermit, String s,String s1,String s2,String s3,String s4,String s5,String s6)
    {
      Vehicle_info = new Vehicle_info(paPermit, s,s1,s2,s3,s4,s5,s6);
      lnkVehicle.put(s,Vehicle_info);
      System.out.println("Vehicle Table is:" +lnkVehicle );
    }
    
    // Print Hashtable
    public Hashtable print()
   
    {
      Enumeration e = lnkVehicle.elements();
      while(e.hasMoreElements()){
      System.out.println("The element are\n:" +e.nextElement() );
        }
      return lnkVehicle;
    }
    
     // Remove vehicle details from hashtable
     public String removeVehicle(String rnum)
    {
      if(lnkVehicle.containsKey(rnum))
        {
          lnkVehicle.remove(rnum);
          return"Vehicle details are removed";
        } 
      else
        {
          return"No Vehicle found";  
        }
    }
   
     // Modify vehicle details from hashtable
      public void modify()
      {
        Enumeration e = lnkVehicle.elements();
        while(e.hasMoreElements())
        {
        System.out.println("The   modify element are\n:" +e.nextElement() );
        }
      }
}