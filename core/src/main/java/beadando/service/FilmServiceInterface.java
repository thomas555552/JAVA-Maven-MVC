package beadando.service;

import beadando.modell.Film;
import java.util.List;

public interface FilmServiceInterface {

    List<Film> getAllFilms();

    Film getFilmByTitle(String title);

    void addFilm(Film film);

    void deleteFilmByTitle(String title);



}
