package beadando.modell;

import java.util.List;


public class Hall {


    //TODO ID-t meg hozzaadni es javitani az egeszet az szerint
    //TODO ha lesz ID akkor ha uj vetitest csinalunk es adunk hozza hallt, akkor uj hall kell, vagyis
    //TODO annak a masolata amit megadtak,de uj ID-val, hogy a seatek uresek legyenek...
    private String name;
    private int seatperrows;
    private int rowsnumber;
    /*private SortedMap<Integer, User> seats;*/
    private List<Seat> seats;

    public Hall(String name, int seatperrows, int rowsnumber) {
        this.name = name;
        this.seatperrows = seatperrows;
        this.rowsnumber = rowsnumber;

        //TODO exeption esetleg seatperrows nem lehet nagyobb mint 99 ++JAVITANI
        for(int i=1;i<=rowsnumber;i++){
            for(int j=1;j<=seatperrows;j++){
                int temp=(i*100)+j;

            }
        }


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
