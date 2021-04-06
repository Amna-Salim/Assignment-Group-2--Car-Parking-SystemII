
public class Day_visitor_permit extends Permit {
    
    private String hostName;
    private String visitday;
    private String permitType;
   
   //constructor

    public Day_visitor_permit(String a, String a1, String a3) {
        super(a);
        visitday = a1;
        hostName = a3;
        permitType = "Day visitor";
        setPermitType(permitType);
        setVisitday(a1);

    }

    //to string method 
    @Override
    public String toString() {
        return "Day_visitor_permit{" + "hostName=" + hostName + ", visitday=" + visitday + ", permitType=" + permitType + '}';
    }

}
