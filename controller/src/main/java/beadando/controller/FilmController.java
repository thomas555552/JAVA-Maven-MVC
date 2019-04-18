package beadando.controller;

import beadando.modell.Film;
import beadando.service.FilmServiceInterface;

import java.util.List;

public class FilmController {

    private FilmServiceInterface filmServiceInterface;

    public FilmController(FilmServiceInterface filmServiceInterface){
        this.filmServiceInterface = filmServiceInterface;
    }

    public List<Film> getAllFilms(){
        return filmServiceInterface.getAllFilms();
    }

    public Film getFilmByTitle(String title){
        return filmServiceInterface.getFilmByTitle(title);
    }

    public void addFilm(Film film){
        filmServiceInterface.addFilm(film);
    }

    public void deleteFilmByTitle(String title){
        filmServiceInterface.deleteFilmByTitle(title);
    }




}
