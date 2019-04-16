package beadando.modell;

public class Hall {

    private String name;
    private int seatperrows;
    private int rowsnumber;

    public Hall(String name, int seatperrows, int rowsnumber) {
        this.name = name;
        this.seatperrows = seatperrows;
        this.rowsnumber = rowsnumber;
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
