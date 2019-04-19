package beadando.controller;

import beadando.modell.Hall;
import beadando.modell.User;
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

    public Hall getHallbyName(String name){
        return hallServiceInterface.getHallbyName(name);
    }

    public void deleteHallByName(String name){
        hallServiceInterface.deleteHallByName(name);
    }



    public void addHall(String name, int seatperrows, int rowsnumber){
        hallServiceInterface.addHall(name, seatperrows, rowsnumber);
    }

    public int[] getFreeSeats(Hall hall){
        return hallServiceInterface.getFreeSeats(hall);
    }

    public void setUserToOneSeat(Hall hall, int seatNumber, User user){
        hallServiceInterface.setUserToOneSeat(hall,seatNumber,user);
    }

    public void setUserToMoreSeat(Hall hall,String seatNumbers,User user){
        hallServiceInterface.setUserToMoreSeat(hall,seatNumbers,user);
    }


}
