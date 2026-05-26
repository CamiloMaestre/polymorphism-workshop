package service;

import entities.Booking;
import entities.Flies;
import entities.Passengers;
import repository.BookingRepository;
import repository.FliesRepository;
import repository.PassengerRepository;

public class BookingService {
    private BookingRepository repo;
    private PassengerRepository repoP;
    private FliesRepository repoF;


    public BookingService(BookingRepository repo, PassengerRepository repoP, FliesRepository repoF) {
        this.repo = repo;
        this.repoP = repoP;
        this.repoF = repoF;
    }

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
        if(b.getSeatsNumberBooked()<1 || b.getSeatsNumberBooked()>5) {
            System.out.println("opcion incorrecta... fuera de rango");
            return;
        }
        Flies flight = repoF.Getflies(String.valueOf(b.getCodeBookedFlight()));

        double pricePerSeat = flight.calculatefinalPrice();
        double totalPrice = pricePerSeat * b.getSeatsNumberBooked();
        System.out.println("\n=========================================");
        System.out.println("       ¡RESERVA PROCESADA CON ÉXITO!     ");
        System.out.println("=========================================");
        System.out.println("Código de Reserva: " + b.getCodeBooking());
        System.out.println("Precio por asiento: $" + pricePerSeat);
        System.out.println("Asientos reservados: " + b.getSeatsNumberBooked());
        System.out.println("Monto total a pagar: $" + totalPrice);
        System.out.println("=========================================\n");


        repo.BookingSave(b);
    }
    public Booking cancel(String codeB){
        Booking b = repo.GetBooking(codeB);
        return b;
    }
    public void updateBooking(Booking b){
        repo.updateBooking(b);
    }

}
