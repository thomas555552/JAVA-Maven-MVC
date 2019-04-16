package beadando.modell;

public class Projection {
    private int ID;
    private String date;
    private Film film;
    private Hall hall;

    public Projection(int ID, String date, Film film, Hall hall) {
        this.ID = ID;
        this.date = date;
        this.film = film;
        this.hall = hall;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }
}
