package beadando.modell;

public class Film {
    private String title;
    private String director;
    private int year;
    private int length;

    public Film(String title, String director, int year, int length) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
