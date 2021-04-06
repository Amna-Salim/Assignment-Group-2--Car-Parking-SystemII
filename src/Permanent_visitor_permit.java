
public class Permanent_visitor_permit extends Permit {
        private String permitType;
   //constructor
    public Permanent_visitor_permit(String a) 
    {
        super(a);
        permitType = "Permanent visitor";
    }

    @Override
    public String toString() {
        return "Permanent_visitor_permit{" + "permitType=" + permitType + '}';
    }

   
        
}


