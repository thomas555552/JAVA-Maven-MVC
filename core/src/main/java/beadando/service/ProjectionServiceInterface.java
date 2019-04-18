package beadando.service;

import beadando.modell.Projection;

import java.util.List;

public interface ProjectionServiceInterface {

    void addProjection(Projection projection);
    void deleteProjectionByID(int id);

    List<Projection> getAllProjection();

    Projection getProjectionByID(int id);


}
