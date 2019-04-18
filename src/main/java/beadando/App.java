package beadando;


import beadando.controller.FilmController;
import beadando.controller.HallController;
import beadando.controller.ProjectionController;
import beadando.controller.UserController;
import beadando.service.FilmService;
import beadando.service.HallService;
import beadando.service.ProjectionService;
import beadando.service.UserService;

public class App {

    public static void main( String[] args )
    {

        FilmController filmController = new FilmController(new FilmService());
        UserController userController = new UserController(new UserService());
        HallController hallController = new HallController(new HallService());
        ProjectionController projectionController = new ProjectionController(new ProjectionService());

        


    }
}
