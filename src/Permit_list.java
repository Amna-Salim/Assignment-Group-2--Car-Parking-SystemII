
import java.util.Enumeration;
import java.util.Hashtable;



public class Permit_list {
    
    private java.util.Hashtable lnkPermit;
    // constructor to initialize hashtable
    public Permit_list() 
    {
        lnkPermit = new Hashtable();
    }
     // check hashtable contains key
    public boolean checkPermit(String a)
    {
        return lnkPermit.containsKey(a);
    }
    // return hashtable
    public Permit getPermit(String a)
    {
        return ((Permit) lnkPermit.get(a));
    }

   // addRegularVisitor code
   public Permit addRegularVisitor(String a, String a1, String a2, String a3,String a5,String a6)
   {
       Regular_visitor_permit regular_visitor_permit = new Regular_visitor_permit(a, a1, a2, a3,a5,a6);
       lnkPermit.put(a, regular_visitor_permit);
       //return regular_visitor_permit;
       System.out.println("Table of Regular Visitor is:" +lnkPermit );
       return regular_visitor_permit;
   }
   
   // addDayVisitor code
   public Permit addDayVisitor(String a, String a1, String a3)
   {
       Day_visitor_permit day_visitor_permit = new Day_visitor_permit(a, a1, a3);
       lnkPermit.put(a, day_visitor_permit);
       System.out.println("Table of Day Visitor is:" +lnkPermit );
       return day_visitor_permit;
   }
   
   // addPermanentVisitor code
   public Permit addPermanentVisitor(String a)
   {
       Permanent_visitor_permit permanent_visitor_permit = new Permanent_visitor_permit(a);
       lnkPermit.put(a, permanent_visitor_permit);
       System.out.println("Table of Permanent Visitor is:" +lnkPermit );
       return permanent_visitor_permit;
       
   }
   
   // add University Member code
   public Permit addUniversityMember(String a, String a1)
   {
       University_member_permit university_member_permit = new University_member_permit(a, a1);
       lnkPermit.put(a, university_member_permit);
       System.out.println("University member visitor Table is:" +lnkPermit );
        return university_member_permit;
   }
   
   // Print Hashtable
   public Hashtable printPermit()
   {
       Enumeration e = lnkPermit.elements();
       while(e.hasMoreElements()){
       System.out.println("The element are\n:" +e.nextElement() );
   }
       return lnkPermit;
 }
   // Remove Permit code
    public String removePermit(String carName)
    {
        if(lnkPermit.containsKey(carName))
        {
          lnkPermit.remove(carName);
          return "Permit is removed for the vehicle";
        } else
        {
         return "No permit is found for the vehicle";  
        }
    }
    
}

