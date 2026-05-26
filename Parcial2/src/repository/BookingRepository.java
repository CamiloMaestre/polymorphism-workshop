package repository;

import entities.Booking;
import entities.Flies;
import entities.Passengers;

import java.util.ArrayList;

public class BookingRepository {
    private ArrayList<Booking> list= new ArrayList<>();

    public void BookingSave(Booking b){

        list.add(b);

    }

    public ArrayList<Booking> listAll(){
        return list;
    }
    public Booking GetBooking(String id){
        for (Booking b: list){
            if(b.getCodeBooking().equals(id)){
                return b;
            }
        }
        return null;
    }
    public void updateBooking(Booking b){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getCodeBooking().equals(b.getCodeBooking())){
                list.set(i, b);
                break;
            }
        }
    }
}
