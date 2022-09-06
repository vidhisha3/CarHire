
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uel
 */
public class BookingList {
    
    private ArrayList<Booking> BookingList;
    public BookingList(){  
        BookingList = new ArrayList<>();
    } 
    
    public void addBooking(Booking bIn){
        BookingList.add(bIn);
    }
    
    public void delelteBooking(String regIn){
        Booking b= findBooking(regIn);
        if(b!=null){
            BookingList.remove(b);
        }
        else{
            System.out.println("Invalide registration.");
        }
    }
    
    public Booking findBooking(String regIn){
       for(Booking b : BookingList){  
            if(b.getCarReg().equals(regIn)){
                return b;
            }
        } 
       return null;
    }
    
    public Booking getBookingIndex(int indexIn){
        if(indexIn>0 && indexIn<=BookingList.size()){
             return BookingList.get(indexIn -1);
        }
        return null;
    }
     
     public int getTotal() {
        return BookingList.size();
    }

   
    
}
