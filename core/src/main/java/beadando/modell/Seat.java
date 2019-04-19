package beadando.modell;

public class Seat {
    private int seatNumber;
    private String userName;

    public Seat(int seatNumber, String userName) {
        this.seatNumber = seatNumber;
        this.userName = userName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
