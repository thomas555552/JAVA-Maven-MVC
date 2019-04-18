package beadando.service;

import beadando.modell.Hall;
import beadando.modell.User;

import java.util.List;

public interface HallServiceInterface {

    List<Hall> getAllHall();
    Hall getHallbyName(String name);
    void deleteHallByName(String name);
    void addHall(Hall hall);

    int[] getFreeSeats(Hall hall);
    void setUserToOneSeat(Hall hall,Integer seatNumber,User user);
    void setUserToMoreSeat(Hall hall,String seatNumbers,User user);

}
