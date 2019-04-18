package beadando.view;

import beadando.controller.FilmController;
import beadando.controller.HallController;
import beadando.controller.ProjectionController;
import beadando.controller.UserController;
import beadando.modell.Film;
import beadando.modell.Hall;
import beadando.modell.Projection;
import beadando.modell.User;
import beadando.service.FilmService;
import beadando.service.HallService;
import beadando.service.ProjectionService;
import beadando.service.UserService;

public class View {


    public static void main( String[] args )
    {

        FilmController filmController = new FilmController(new FilmService());
        UserController userController = new UserController(new UserService());
        HallController hallController = new HallController(new HallService());
        ProjectionController projectionController = new ProjectionController(new ProjectionService());


        addDataBeforeStart(filmController,userController,hallController,projectionController);


        hallController.setUserToMoreSeat(hallController.getHallbyName("Nagy terem"), "101,102,103", userController.findByUsername("User1"));

        System.out.println(hallController.getFreeSeats(hallController.getHallbyName("Nagy terem")));

    }

    public static void addDataBeforeStart(FilmController Fcontroller, UserController Ucontroller, HallController Hcontroller, ProjectionController Pcontroller){
        Fcontroller.addFilm(new Film("TestTitle1", "TestDirector1", 2019, 90));
        Fcontroller.addFilm(new Film("TestTitle2", "TestDirector2", 2018, 150));
        Fcontroller.addFilm(new Film("TestTitle3", "TestDirector3", 2017, 100));

        Ucontroller.add(new User("User1", "Valami utca 2", 20));
        Ucontroller.add(new User("User2", "Kis utca 4", 50));

        Hcontroller.addHall(new Hall("Nagy terem", 5, 3));

        Pcontroller.addProjection(new Projection(1,"2019.05.20, 18:00", Fcontroller.getFilmByTitle("TestTitle2"), Hcontroller.getHallbyName("Nagy terem")));

    }

}
