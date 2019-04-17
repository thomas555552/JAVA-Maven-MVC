package beadando.service;

import beadando.modell.Hall;
import beadando.modell.User;

import java.util.List;

public interface HallServiceInterface {

    List<Hall> getAllHall();
    Hall getHallbyName(String name);
    void deleteHallByName(String name);
    Hall addHall(Hall hall);

    Integer getFreeSeats(Hall hall);
    void setUserToOneSeat(Integer seatNumber,User user);
    void setUserToMoreSeat(String seatNumbers,User user);

}
