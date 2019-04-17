package beadando.service;

import beadando.modell.Hall;
import beadando.modell.User;

import java.util.List;

public class HallService implements HallServiceInterface {
    @Override
    public List<Hall> getAllHall() {
        return null;
    }

    @Override
    public Hall getHallbyName(String name) {
        return null;
    }

    @Override
    public void deleteHallByName(String name) {

    }

    @Override
    public Hall addHall(Hall hall) {
        return null;
    }

    @Override
    public Integer getFreeSeats(Hall hall) {
        return null;
    }

    @Override
    public void setUserToOneSeat(Integer seatNumber, User user) {

    }

    @Override
    public void setUserToMoreSeat(String seatNumbers, User user) {

    }
}
