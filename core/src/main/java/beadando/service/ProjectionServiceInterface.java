package beadando.service;

import beadando.modell.Film;
import beadando.modell.Hall;
import beadando.modell.Projection;

import java.util.List;

public interface ProjectionServiceInterface {


    void addProjection(int ID, String date, Film film, Hall hall);
    void deleteProjectionByID(int id);

    List<Projection> getAllProjection();

    Projection getProjectionByID(int id);

    //TODO getProjectionsByFilms - var egy film cimet es vissza kell adnia a hozza tartozo vetiteseket Listben

}
