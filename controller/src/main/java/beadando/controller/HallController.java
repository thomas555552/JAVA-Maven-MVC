package beadando.controller;

import beadando.modell.Hall;
import beadando.service.HallServiceInterface;

import java.util.List;

public class HallController {


    private HallServiceInterface hallServiceInterface;

    public HallController(HallServiceInterface hallServiceInterface){
        this.hallServiceInterface=hallServiceInterface;
    }

    public List<Hall> getAllHall(){
        return hallServiceInterface.getAllHall();
    }

    public Hall getHallbyID(int ID){
        return hallServiceInterface.getHallbyID(ID);
    }

    public void deleteHallByID(int ID){
        hallServiceInterface.deleteHallByID(ID);
    }



    public void addHall(int ID,String name, int seatperrows, int rowsnumber){
        hallServiceInterface.addHall(ID,name, seatperrows, rowsnumber);
    }

    public int[] getFreeSeats(Hall hall){
        return hallServiceInterface.getFreeSeats(hall);
    }

    public void setUserToOneSeat(Hall hall, int seatNumber, String user){
        hallServiceInterface.setUserToOneSeat(hall,seatNumber,user);
    }

    public void setUserToMoreSeat(Hall hall,String seatNumbers,String user){
        hallServiceInterface.setUserToMoreSeat(hall,seatNumbers,user);
    }


}
