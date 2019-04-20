package beadando.view;

import beadando.controller.FilmController;
import beadando.controller.HallController;
import beadando.controller.ProjectionController;
import beadando.controller.UserController;
import beadando.modell.*;
import beadando.service.FilmService;
import beadando.service.HallService;
import beadando.service.ProjectionService;
import beadando.service.UserService;

import java.util.List;
import java.util.Scanner;


public class View {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main( String[] args )
    {

        FilmController filmController = new FilmController(new FilmService());
        UserController userController = new UserController(new UserService());
        HallController hallController = new HallController(new HallService());
        ProjectionController projectionController = new ProjectionController(new ProjectionService());


        addDataBeforeStart(filmController,userController,hallController,projectionController);

        try (Scanner scanner=new Scanner(System.in)){

            //Filmek listazasa
            filmsList(filmController);

            //Film kivalasztasa
            System.out.println("Kerem kivalasztani a filmet - cime alapjan: ");
            String selectFilm = scanner.next();
            //Kivalasztott filmhez tartozo vetitesek kiiratasa
            projectionListByFilm(projectionController, selectFilm);

            //Vetites kivalasztasa
            System.out.println("Kerem kivalasztani a vetitest - Vetites ID alapjan: ");
            int selectProjection = scanner.nextInt();

            //Vetiteshez tartozo hall kiirasa - szabad/foglalt helyek
            hallListing(hallController, projectionController.getProjectionByID(selectProjection).getHall().getID());

            //Szekek kivalasztasa
            System.out.println("Kerem megadni a szeket/szekeket - Szek szama szerint (tobbet egyszerre vesszovel elvalasztva): ");
            String selectSeats= scanner.next();

            //Felhasznalok listazasa, kivalasztasa melyik felhasznalo foglalja a szeket/szekeket
            System.out.println("Felhasznalok: ");
            usersList(userController);
            System.out.println("Kerem kivalasztani a felhasznalot - nev alapjan: ");
            String selectUser = scanner.next();

            //foglaljuk a fent megadott szeket/szekeket a megadott felhasznalo szerint
            hallController.setUserToMoreSeat(projectionController.getProjectionByID(selectProjection).getHall(),selectSeats, selectUser);

            System.out.println(ANSI_PURPLE+"Koszonjuk a foglalast!");

            //kiiratjuk hogy lassuk hogy lefoglaltuk
            hallListing(hallController, projectionController.getProjectionByID(selectProjection).getHall().getID());

         }catch (Exception e){
            e.printStackTrace(System.err);
        }



/*  TEST
        usersList(userController);
        filmsList(filmController);

        //hallController.setUserToOneSeat(hallController.getHallbyID(2),201, "User3");
        hallController.setUserToMoreSeat(hallController.getHallbyID(2), "201,202", "User2");
        //hallsList(hallController);

        hallListing(hallController, 2);

        projectionListByFilm(projectionController, "Film1");*/
    }

    public static void addDataBeforeStart(FilmController Fcontroller, UserController Ucontroller, HallController Hcontroller, ProjectionController Pcontroller){

        Ucontroller.add("User1","Address1", 20);
        Ucontroller.add("User2","Address2", 30);
        Ucontroller.add("User3","Address2", 40);

        Fcontroller.addFilm("Film1","Director1",2000,100);
        Fcontroller.addFilm("Film2","Director2",2018,150);
        Fcontroller.addFilm("Film3","Director3",2017,86);

        Hcontroller.addHall(1,"Nagy terem",5,3);
        Hcontroller.addHall(2,"Kis terem",3,2);
        Hcontroller.addHall(3,"Kis terem",3,2);

        Pcontroller.addProjection(1,"03.26, 18:00", Fcontroller.getFilmByTitle("Film1"), Hcontroller.getHallbyID(1));
        Pcontroller.addProjection(2,"03.27, 20:00", Fcontroller.getFilmByTitle("Film1"), Hcontroller.getHallbyID(2));
        Pcontroller.addProjection(3,"03.27, 18:00", Fcontroller.getFilmByTitle("Film2"), Hcontroller.getHallbyID(3));

    }
    //Felhasznalok lista
    public static void usersList(UserController Ucontroller){
        System.out.println(ANSI_YELLOW+"Felhasznalok: ");
        for (User user: Ucontroller.getAllUsers()){
            System.out.println(ANSI_YELLOW+"Nev: "+user.getName()+"; Cim: "+user.getAddress()+ "; Eletkor: "+user.getAge());
        }

    }
    // Filmek lista
    public static void filmsList(FilmController Fcontroller){
        System.out.println(ANSI_BLUE+"Film Lista: ");
        for (Film film: Fcontroller.getAllFilms()){
            System.out.println(ANSI_BLUE+"Cime: "+film.getTitle()+"; Rendezo: "+film.getDirector()+"; Kiadas eve: "+film.getYear()+"; Idotartam: "+film.getLength());
        }

    }
    // Vetites lista kivalasztott film szerint
    public static void projectionListByFilm(ProjectionController Pcontroller, String filmTitle){
        List<Projection> temp= Pcontroller.getProjectionsByFilm(filmTitle);
        System.out.println(ANSI_CYAN+filmTitle+"-hez tartozo vetitesek: ");
        for (Projection projection:temp){
            System.out.println(ANSI_CYAN+"Vetites ID: "+projection.getID()+"- Kivalasztott film vetites datuma:  "+projection.getDate()+" ; Terem: "+projection.getHall().getName()+" ; Film Cime: "+projection.getFilm().getTitle());
        }
    }

    // Terem ID alapjan kiiratas szabad/foglalt helyek
    public static void hallListing(HallController Hcontroller, int ID){
        Hall temp = Hcontroller.getHallbyID(ID);
        System.out.println(ANSI_WHITE+"Terem kodja: "+temp.getID()+" - Neve: "+temp.getName()+" :");
        for(Seat seat: temp.getSeats()){
            if(seat.getUserName()=="null") System.out.println(ANSI_GREEN+"Szek szama: "+seat.getSeatNumber() + "- Szabad");
            if(seat.getUserName()!="null") System.out.println(ANSI_RED+"Szek szama: "+seat.getSeatNumber() + " - Foglalt: "+seat.getUserName());
         }
    }



}
