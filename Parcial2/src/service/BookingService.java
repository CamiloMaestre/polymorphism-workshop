package service;

import entities.Booking;
import entities.Flies;
import entities.Passengers;
import repository.BookingRepository;
import repository.FliesRepository;
import repository.PassengerRepository;

public class BookingService {
    private BookingRepository repo= new BookingRepository();
    PassengerRepository repoP = new PassengerRepository();

    public void saveData(Booking b){

        if(b.getPassengerBooking() <0){
            System.out.println("la cedula no puede ser negativa.");
            return;
        }
        if(repoP.Getpassangers(b.getPassengerBooking()) == null){
            System.out.println("el pasajero no existe");
            return;
        }
        if(b.getTipeFly()<0 || b.getTipeFly()>1){
            System.out.println("opcion invalida");
            return;
        }
        if(b.getSeatsNumberBooked()<1 || b.getSeatsNumberBooked()>5){
            System.out.println("opcion incorrecta... fuera de rango");
            return;
        }


        repo.BookingSave(b);
    }


}
