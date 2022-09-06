
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vidhisha
 * 
 */
public class Car_Hire_Main_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FleetList carFile = new FleetList();
        BookingList BookingFile= new BookingList();
        char choice;
         do
        {
            System.out.println("File Tester");
            System.out.println("1.Add a car in fleet.");
            System.out.println("2.Remove a car");
            System.out.println("3.List all cars and status");
            System.out.println("4.Add booking");
            System.out.println("5.Remove a booking.");
            System.out.println("6.Display all booking");
            System.out.println("7.Find status of current vehicle.");
            System.out.println("8.get total vehicle in fleet.");
            System.out.println("9.Quit");
            choice = EasyScanner.nextChar();
            System.out.println();
            switch(choice)
            {
                case '1' : addCar(carFile);
                break;
                
                case '2' : removeCar(carFile);
                break;
                
                case '3' : listAll(carFile);
                break;
                
                case '4' : makeBooking(BookingFile,carFile);
                break;
                
                case '5' : removeBooking(BookingFile);
                break;
                
                case '6' : displayBooking(BookingFile);
                break;
                
                case '7' : findStatus(carFile,BookingFile);
                break;
                case '8' : findtotalcar(carFile);
                break;
                default: System.out.println("please choose number 1-9 only");
                
            }
        }while(choice!='9');
    
}
    
    static void addCar(FleetList carFile){
        System.out.println("Enter car registration.");
        String reg=EasyScanner.nextString();
        
        System.out.println("Enter car make.");
        String make=EasyScanner.nextString();
        
        Car c= new Car(reg,make);
        carFile.addCar(c);
        
        System.out.println("Car added.");
    }
    
    static void removeCar(FleetList carFile){
        System.out.println("Enter car registration.");
        String reg=EasyScanner.nextString();
        
        carFile.removeCar(reg);
    }
    
    static void listAll(FleetList carFile){
        System.out.println("Fleet File");
        for(int i=1;i<=carFile.getTotal();i++){
            System.out.println("Car registration= "+carFile.getCarIndex(i).getReg()+" , Car Status= "+ carFile.getCarIndex(i).getStatus());
        }
    }
    
    static void makeBooking(BookingList BookingFile,FleetList carFile) {
        System.out.println("Enter customer name");
        String cName=EasyScanner.nextString();
        
        System.out.println("Enter car registration");
        String reg=EasyScanner.nextString();
        
        System.out.println("Enter price");
        double price=EasyScanner.nextDouble();
        
        System.out.println("Enter start date (format mm-dd-yyyy): ");
        String date1 = EasyScanner.nextString();
        Date startdate;
        
         try {
          startdate = new SimpleDateFormat("MM-dd-yyyy").parse(date1);
        } catch (ParseException ex) {
            System.out.println("You have to enter date in format mm-dd-yyyy");
            return;
        }
        
        System.out.println("Enter end date (format mm-dd-yyyy): ");
        String date2 = EasyScanner.nextString();
        Date enddate;
         try {
              enddate = new SimpleDateFormat("MM-dd-yyyy").parse(date2);
        } catch (ParseException ex) {
            System.out.println("You have to enter date in format mm-dd-yyyy");
            return;
        }
        
        Booking b =new Booking(cName,reg,price,startdate,enddate);
        BookingFile.addBooking(b);
        
        carFile.findCar(reg).setStatus("Booked");
                
    }
    
    static void removeBooking(BookingList BookingFile) {
        System.out.println("Enter car registration");
        String reg=EasyScanner.nextString();
        
        BookingFile.delelteBooking(reg);
        
    }
    static void displayBooking(BookingList BookingFile){
        for(int i=1; i<=BookingFile.getTotal(); i++){
            System.out.println("Customer name= "+BookingFile.getBookingIndex(i).getCname());
            System.out.println("Car registration= "+BookingFile.getBookingIndex(i).getCarReg());
            System.out.println("Hire Price= "+BookingFile.getBookingIndex(i).getHirePrice());
            System.out.println("Start date= "+BookingFile.getBookingIndex(i).getStartDate());
            System.out.println("End date= "+BookingFile.getBookingIndex(i).getEndDate());
        }
    }
        
    static void findStatus(FleetList carFile,BookingList BookingFile){
        System.out.println("Enter car registration");
        String reg=EasyScanner.nextString();
        if(carFile.findCar(reg).getStatus().equals("Available at depot")){
        System.out.println("Current state of car is= "+carFile.findCar(reg).getStatus());}
        else{
           System.out.println("Vehicle is booked with customer= "+BookingFile.findBooking(reg).getCname() );
           System.out.println("Return date of vehicle is= "+BookingFile.findBooking(reg).getEndDate());
        }
        
    }
    static void findtotalcar(FleetList carFile){
        System.out.println("Total vehicle registered in fleet= "+carFile.getTotal());
    }
    
    
}
