package beadando.controller;

import beadando.modell.Film;
import beadando.modell.Hall;
import beadando.modell.Projection;
import beadando.service.ProjectionServiceInterface;

import java.util.List;

public class ProjectionController {

    private ProjectionServiceInterface projectionServiceInterface;

    public ProjectionController(ProjectionServiceInterface projectionServiceInterface){
        this.projectionServiceInterface=projectionServiceInterface;
    }

   
    public void addProjection(int ID, String date, Film film, Hall hall){
        projectionServiceInterface.addProjection(ID, date, film, hall);
    }

    public void deleteProjectionByID(int id){
        projectionServiceInterface.deleteProjectionByID(id);
    }

    public List<Projection> getAllProjection(){
        return projectionServiceInterface.getAllProjection();
    }

    public Projection getProjectionByID(int id){
        return projectionServiceInterface.getProjectionByID(id);
    }


    public  List<Projection> getProjectionsByFilm(String filmTitle){
        return projectionServiceInterface.getProjectionsByFilm(filmTitle);
    }

}
