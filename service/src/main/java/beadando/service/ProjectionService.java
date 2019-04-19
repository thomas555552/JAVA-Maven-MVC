package beadando.service;

import beadando.modell.Film;
import beadando.modell.Hall;
import beadando.modell.Projection;

import java.util.ArrayList;
import java.util.List;

public class ProjectionService implements ProjectionServiceInterface {

    List<Projection> projections = new ArrayList<Projection>();


    @Override
    public void addProjection(int ID, String date, Film film, Hall hall) {
        Projection projection=new Projection(ID, date, film, hall);
        projections.add(projection);

    }

    @Override
    public void deleteProjectionByID(int id) {
        for(Projection projection:projections){
            int temp;
            temp=projection.getID();
            if(temp==id) projections.remove(projection);
        }
    }

    @Override
    public List<Projection> getAllProjection() {
        return projections;
    }

    @Override
    public Projection getProjectionByID(int id) {
        for(Projection projection:projections){
            int temp;
            temp=projection.getID();
            if(temp==id) return projection;
        }
        return null;
    }
}
