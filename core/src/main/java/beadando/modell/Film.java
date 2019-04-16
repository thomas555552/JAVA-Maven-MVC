package beadando.modell;

public class Film {
    private String name;
    private String director;
    private int year;
    private int length;

    public Film(String name, String director, int year, int length) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
