
    public class Main {
    
    public static void main(String[] args) {
        System_status systemStatus = new System_status();
        Vehicle_list vehicleList = new Vehicle_list();
        Permit_list permitList = new Permit_list();
        //Timer timer = new Timer(systemStatus, permitList);     // Frame, boundary class
        Barrier barrier1 = new Barrier(systemStatus, vehicleList);  // Frame, boundary class
        Campus_security campusSecurity1 = new Campus_security(systemStatus,vehicleList );  // Frame, boundary class
        Administration_office adminOffice1 = new Administration_office(vehicleList,permitList); 
         
    } // main
}
