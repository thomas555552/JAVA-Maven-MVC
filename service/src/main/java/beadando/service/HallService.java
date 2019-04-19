package beadando.service;

import beadando.modell.Hall;
import beadando.modell.User;

import java.util.*;


public class HallService implements HallServiceInterface {

    List<Hall> halls = new ArrayList<Hall>();

    @Override
    public List<Hall> getAllHall() {
        return halls;
    }

    @Override
    public Hall getHallbyName(String name) {
        Iterator<Hall> iterator = halls.iterator();
        while (iterator.hasNext()){
            Hall hall = iterator.next();
            if (hall.getName().equals(name)) return hall;
        }
        return null;
    }

    @Override
    public void deleteHallByName(String name) {
        Iterator<Hall> iterator = halls.iterator();
        while (iterator.hasNext()){
            Hall hall = iterator.next();
            if(hall.getName().equals(name)) halls.remove(hall);
        }
    }


    @Override
    public void addHall(String name, int seatperrows, int rowsnumber)  {
        Hall hall= new Hall(name, seatperrows,rowsnumber);
        halls.add(hall);
    }

    @Override
    public int[] getFreeSeats(Hall hall) {

        Iterator<Hall> iterator = halls.iterator();
        while (iterator.hasNext()){
            Hall hallTemp = iterator.next();
            if (hallTemp.equals(hall)){
                int temp2 = 0;
                int[] IntArray= new int[hallTemp.getSeatperrows()*hallTemp.getRowsnumber()];
                for(int i=1;i<=hallTemp.getRowsnumber();i++){
                    for(int j=1;j<=hallTemp.getSeatperrows();j++){
                        int temp=(i*100)+j;
                        if(hallTemp.getSeats().get(temp)==null){
                            IntArray[temp2]=temp;
                            temp2++;
                        }

                    }
                }
                return IntArray;
            }
        }
        return null;
    }

    @Override
    public void setUserToOneSeat(Hall hall, int seatNumber, User user) {
        int temp=halls.indexOf(hall);

  }

    @Override
    public void setUserToMoreSeat(Hall hall, String seatNumbers, User user) {
            String[] separateSeats = seatNumbers.split(",");
            int[] intSeats= new int[separateSeats.length];
            int temp=0;
            for(String seat: separateSeats){
               intSeats[temp]=Integer.parseInt(seat);
               temp++;
            }

            int hallindextemp=halls.indexOf(hall);
            for (int seat: intSeats){

            }


    }

}
