
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uel
 */
public class Booking {
    private String CustomerName;
    private String CarReg;
    private double HirePrice;
    private Date   StartDate;
    private Date   EndDate;
    public Booking(String Cname,String CarRegIn, double PriceIn,Date StartDateIn, Date EndDateIn){
        CustomerName=Cname;
        CarReg=CarRegIn;
        HirePrice=PriceIn;
        StartDate=StartDateIn;
        EndDate=EndDateIn;
    }
    public String getCname(){
        return CustomerName;
    }
    
    public String getCarReg(){
        return CarReg;
    }
    
    public double getHirePrice(){
        return HirePrice;
    }
    
    public Date getStartDate(){
        return StartDate;
    }
    
    public Date getEndDate(){
        return EndDate;
    }
    
    public void setCname(String NameIn){
        CustomerName=NameIn;
    }
    
    public void setCarReg(String RegIn){
        CarReg=RegIn;
    }
    
    public void setHirePrice(double PriceIn){
        HirePrice=PriceIn;
    }
    
    public void setStartDate(Date DateIn){
        StartDate=DateIn;
    }
    
    public void setEndate(Date DateIn){
        EndDate=DateIn;
    }
    
    
    
    
    
    
    
    
    
}
