package beadando.service;

import beadando.modell.Hall;
import beadando.modell.User;

import java.util.List;

public interface HallServiceInterface {

    List<Hall> getAllHall();
    Hall getHallbyName(String name);
    void deleteHallByName(String name);

    /*
    private String name;
    private int seatperrows;
    private int rowsnumber;
    // private SortedMap<Integer, User> seats;
    private List<Seat> seats;
     */

    void addHall(String name, int seatperrows, int rowsnumber);

    int[] getFreeSeats(Hall hall);
    void setUserToOneSeat(Hall hall,int seatNumber,User user);
    void setUserToMoreSeat(Hall hall,String seatNumbers,User user);

}
