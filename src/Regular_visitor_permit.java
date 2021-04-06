
public class Regular_visitor_permit extends Permit {
    
    private String hostName;
    private String visitday;
    private String endday;
    private String permitType;
     private String noentries;
    private String noWarning;
    
    //constructor

    public Regular_visitor_permit(String a, String a1, String a2, String a3,String a5,String a6) {
        
        super (a);
        visitday = a1;
        endday = a2;
        hostName = a3;
        noentries= a5;
        noWarning = a6;
        permitType = "Regular visitor";
        setPermitType(permitType);
        setVisitday(a1);
        setEndday(a2);
        setNoEntries(a5);
        setNoWarning(a6);
    }

    @Override
    public String toString() {
        return "Regular_visitor_permit{" + "hostName=" + hostName + ", visitday=" + visitday + ", endday=" + endday + ", permitType=" + permitType + ", noentries=" + noentries + ", noWarning=" + noWarning + '}';
    }

   
}
