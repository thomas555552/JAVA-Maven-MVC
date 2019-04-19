package beadando.service;

import beadando.modell.Hall;
import beadando.modell.Seat;
import beadando.modell.User;

import java.util.*;


public class HallService implements HallServiceInterface {

    List<Hall> halls = new ArrayList<Hall>();

    @Override
    public List<Hall> getAllHall() {
        return halls;
    }

    @Override
    public Hall getHallbyID(int ID) {
        Iterator<Hall> iterator = halls.iterator();
        while (iterator.hasNext()){
            Hall hall = iterator.next();
            if (hall.getID()==ID) return hall;
        }
        return null;
    }

    @Override
    public void deleteHallByID(int ID) {
        Iterator<Hall> iterator = halls.iterator();
        while (iterator.hasNext()){
            Hall hall = iterator.next();
            if(hall.getID()==ID) halls.remove(hall);
        }
    }


    @Override
    public void addHall(int ID,String name, int seatperrows, int rowsnumber)  {
        Hall hall= new Hall(ID, name, seatperrows,rowsnumber);
        halls.add(hall);
    }



    @Override
    public int[] getFreeSeats(Hall hall) {

        Iterator<Hall> iterator = halls.iterator();
        while (iterator.hasNext()){
            Hall hallTemp = iterator.next();
            if (hallTemp.equals(hall)){
                int temp2 = 0;
                int temp3=0;
                int[] IntArray= new int[hallTemp.getSeatperrows()*hallTemp.getRowsnumber()];
                for(int i=1;i<=hallTemp.getRowsnumber();i++){
                    for(int j=1;j<=hallTemp.getSeatperrows();j++){
                        int temp=(i*100)+j;
                        if(hallTemp.getSeats().get(temp3).getSeatNumber()==temp && hallTemp.getSeats().get(temp3).getUserName()=="null"){
                            IntArray[temp2]=temp;
                            temp2++;
                        }
                        temp3++;
                        }
                    }
                return IntArray;
                }
            }
        return null;
    }


    @Override
    public void setUserToOneSeat(Hall hall, int seatNumber, String user) {
        int temp=halls.indexOf(hall);
        int seatRowsNUMB = halls.get(temp).getSeatperrows();
        int rowsNUMB = (int) (seatNumber / 100);
        int seatNUMB = (int) (seatNumber % 100);
        int tempINDEX=0;
        if(rowsNUMB==1){ tempINDEX= seatNUMB-1; };
        if (rowsNUMB>1){ tempINDEX= ((rowsNUMB-1)*seatRowsNUMB)+seatNUMB-1 ; };
        halls.get(temp).getSeats().get(tempINDEX).setUserName(user);


  }


    @Override
    public void setUserToMoreSeat(Hall hall, String seatNumbers, String user) {
            String[] separateSeats = seatNumbers.split(",");
            int[] intSeats= new int[separateSeats.length];
            int temp=0;
            int hallindextemp=halls.indexOf(hall);

            int i=0;
            for (String str : separateSeats)
            intSeats[i++] = Integer.parseInt(str);

            for (i=0; i<intSeats.length;i++){

                setUserToOneSeat(halls.get(hallindextemp), intSeats[i], user);

            }



    }

}
