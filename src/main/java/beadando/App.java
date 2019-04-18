package beadando;

import beadando.controller.FilmController;
import beadando.service.FilmService;

public class App {

    public static void main( String[] args )
    {

        FilmController filmController = new FilmController(new FilmService());

        System.out.println("ASD");
/*
        FilmController filmController = new FilmController(new FilmService());
        UserController userController = new UserController(new UserService());
        HallController hallController = new HallController(new HallService());
        ProjectionController projectionController = new ProjectionController(new ProjectionService());

        filmController.addFilm(new Film("asd","qwe",2014, 150));

        System.out.println("Director: " +filmController.getFilmByTitle("asd").getDirector());
*/
    }
}
