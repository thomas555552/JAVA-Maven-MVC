package beadando.view;

import beadando.controller.FilmController;
import beadando.controller.HallController;
import beadando.controller.ProjectionController;
import beadando.controller.UserController;
import beadando.modell.Film;
import beadando.modell.Hall;
import beadando.modell.Seat;
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


        usersList(userController);
        filmsList(filmController);

        //hallController.setUserToOneSeat(hallController.getHallbyID(2),201, "User3");
        hallController.setUserToMoreSeat(hallController.getHallbyID(2), "201,202", "User2");
        hallsList(hallController);
    }

    public static void addDataBeforeStart(FilmController Fcontroller, UserController Ucontroller, HallController Hcontroller, ProjectionController Pcontroller){

        Ucontroller.add("User1","Address1", 20);
        Ucontroller.add("User2","Address2", 30);
        Ucontroller.add("User2","Address2", 40);

        Fcontroller.addFilm("Film1","Director1",2000,100);
        Fcontroller.addFilm("Film2","Director2",2018,150);
        Fcontroller.addFilm("Film3","Director3",2017,86);

        Hcontroller.addHall(1,"Nagy terem",5,3);
        Hcontroller.addHall(2,"Kis terem",3,2);

        Pcontroller.addProjection(1,"03.26, 18:00", Fcontroller.getFilmByTitle("Film1"), Hcontroller.getHallbyID(1));
        Pcontroller.addProjection(2,"03.27, 20:00", Fcontroller.getFilmByTitle("Film1"), Hcontroller.getHallbyID(2));

    }

    public static void usersList(UserController Ucontroller){
        System.out.println("Felhasznalok: ");
        for (User user: Ucontroller.getAllUsers()){
            System.out.println("Nev: "+user.getName()+"; Cim: "+user.getAddress()+ "; Eletkor: "+user.getAge());
        }

    }

    public static void filmsList(FilmController Fcontroller){
        System.out.println("Filmek: ");
        for (Film film: Fcontroller.getAllFilms()){
            System.out.println("Cime: "+film.getTitle()+"; Rendezo: "+film.getDirector()+"; Kiadas eve: "+film.getYear()+"; Idotartam: "+film.getLength());
        }

    }

    public static void hallsList(HallController Hcontroller){
        System.out.println("Hall-ra proba: ");
        Hall hall= Hcontroller.getHallbyID(2);
        System.out.println("ID: "+hall.getID()+" Neve: "+hall.getName()+" :");
        for(Seat seat: hall.getSeats()){
            System.out.println("SzekSZAMA: "+seat.getSeatNumber()+" Ures/foglalt: "+seat.getUserName() );
        }


        System.out.println("szabad helyek: ");

        int[] i =Hcontroller.getFreeSeats(hall);

        for (int j=0;j<i.length;j++){
            if(i[j]!=0)
            System.out.println(i[j]+ " ; ");
        }

    }

}
