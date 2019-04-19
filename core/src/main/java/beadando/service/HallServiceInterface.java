package beadando.service;

import beadando.modell.Hall;
import beadando.modell.User;

import java.util.List;

public interface HallServiceInterface {

    List<Hall> getAllHall();
    Hall getHallbyID(int ID);
    void deleteHallByID(int ID);


    void addHall(int ID, String name, int seatperrows, int rowsnumber);

    int[] getFreeSeats(Hall hall);
    void setUserToOneSeat(Hall hall,int seatNumber,String user);
    void setUserToMoreSeat(Hall hall,String seatNumbers,String user);

}
