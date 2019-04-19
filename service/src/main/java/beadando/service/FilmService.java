package beadando.service;

import beadando.modell.Film;

import java.util.ArrayList;
import java.util.List;

public class FilmService implements FilmServiceInterface {
    List<Film> films= new ArrayList<Film>();

    @Override
    public List<Film> getAllFilms() {
        return films;
    }

    @Override
    public Film getFilmByTitle(String title) {
        for(Film film:films) {
            if (film.getTitle().equals(title))
                return film;
        }
        return null;
    }




    @Override
    public void addFilm(String title, String director, int year, int length) {
        Film film = new Film(title, director, year, length);
        films.add(film);
    }

    @Override
    public void deleteFilmByTitle(String title) {
        for(Film film:films){
            if(film.getTitle().equals(title))
                films.remove(film);
        }
    }
}
