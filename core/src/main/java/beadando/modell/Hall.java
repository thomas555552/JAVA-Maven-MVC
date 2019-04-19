package beadando.modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Hall {

    // ID  - vetitesnel eloszor letrehozni az uj Hallt es azt hozzaadni az uj projectionhoz
    private int ID;
    private String name;
    private int seatperrows;
    private int rowsnumber;
    private List<Seat> seats= new ArrayList<Seat>();


    public Hall(int ID, String name, int seatperrows, int rowsnumber) {
        this.ID=ID;
        this.name = name;
        this.seatperrows = seatperrows;
        this.rowsnumber = rowsnumber;

        //TODO exeption esetleg seatperrows nem lehet nagyobb mint 99
        for(int i=1;i<=rowsnumber;i++){
            for(int j=1;j<=seatperrows;j++){
                int temp=(i*100)+j;
                seats.add(new Seat(temp, "null"));
            }
        }



    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatperrows() {
        return seatperrows;
    }

    public void setSeatperrows(int seatperrows) {
        this.seatperrows = seatperrows;
    }

    public int getRowsnumber() {
        return rowsnumber;
    }

    public void setRowsnumber(int rowsnumber) {
        this.rowsnumber = rowsnumber;
    }
}
