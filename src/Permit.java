
abstract public class Permit {
    
   private String permitType;
   private String visitday;
   private String endday;
   private String noentries; 
   private String noWarning;
   private String permitHolder;
   private int noOfEntries = 0;
   private int warnings = 0;
   private boolean suspended = false;
   private boolean enteredToday = false;
   private Vehicle_info vehicleUsedToday;
   private Vehicle_info permittedVehicles;
    
    //constructor
    public Permit(String a) {
        permitHolder = a;
    }
    // set Methods
    public void setPermitType(String permitType) {
        this.permitType = permitType;
    }

    public void setVisitday(String visitday) {
        this.visitday = visitday;
    }

    public void setEndday(String endday) {
        this.endday = endday;
    }
    
      public void setNoEntries(String noentries) {
        this.noentries = noentries;
    }
      public void setNoWarning(String noWarning) {
        this.noWarning = noWarning;
    }
    // get Methods
    public String getPermitType() {
        return permitType;
    }

    public String getVisitday() {
        return visitday;
    }

    public String getEndday() {
        return endday;
    }
    
    public String getNoEntries() {
        return noentries;
    }
    public String getNoWarning() {
        return noentries;
    }

    @Override
    public String toString() {
        return "Permit{" + "permitType=" + permitType + ", visitday=" + visitday + ", endday=" + endday + ", noentries=" + noentries + ", noWarning=" + noWarning + ", permitHolder=" + permitHolder + ", noOfEntries=" + noOfEntries + ", warnings=" + warnings + ", suspended=" + suspended + ", enteredToday=" + enteredToday + ", vehicleUsedToday=" + vehicleUsedToday + ", permittedVehicles=" + permittedVehicles + '}';
    }
        
}
