
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

public class FleetList {
    private ArrayList<Car> carList;
     
    public FleetList(){    
     carList = new ArrayList<>();
    }
    
    public void addCar(Car carIn){
        carList.add(carIn);
    }
    
    public void removeCar(String regIn){
        Car c=findCar(regIn);
        if(c!=null){
            carList.remove(c);
        }
        else{
            System.out.println("No car found");
        }
    }
    
    public Car findCar(String regIn){
       for(Car c : carList){  
            if(c.getReg().equals(regIn)){
                return c;
            }
        } 
       return null;
    }
    
    public Car getCarIndex(int indexIn){
        if(indexIn>0 && indexIn<=carList.size()){
             return carList.get(indexIn -1);
        }
        return null;
    }
     
     public int getTotal() {
        return carList.size();
    }
     
     
     
 
}
