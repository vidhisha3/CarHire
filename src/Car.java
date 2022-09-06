

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uel
 */
public class Car {
    private String Reg;
    private String Make;
    private String Status;
    
    public Car (String regIn, String makeIn){
        Reg=regIn;
        Make=makeIn;
        Status="Available at depot";
    }
    public String getReg() {
        return Reg;
    }
    public String getMake() {
        return Make;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus( String StatusIn) {
        Status = StatusIn;
    } 
    
   
     
    
    
    
    
    
}
