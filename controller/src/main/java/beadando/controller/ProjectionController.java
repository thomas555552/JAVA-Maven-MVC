package beadando.controller;

import beadando.modell.Projection;
import beadando.service.ProjectionServiceInterface;

import java.util.List;

public class ProjectionController {

    private ProjectionServiceInterface projectionServiceInterface;

    public ProjectionController(ProjectionServiceInterface projectionServiceInterface){
        this.projectionServiceInterface=projectionServiceInterface;
    }


    public void addProjection(Projection projection){
        projectionServiceInterface.addProjection(projection);
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


}
