package beadando.modell;

public class Seat {

    private int SeatNumber;
    private String UserName;

    public Seat(int seatNumber, String userName) {
        SeatNumber = seatNumber;
        UserName = userName;
    }


    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        SeatNumber = seatNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
