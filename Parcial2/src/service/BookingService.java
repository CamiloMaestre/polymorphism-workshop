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
        if(repoF.Getflies(b.getCodeBookedFlight()) == null){
            System.out.println("el vuelo no existe, no se puede registrar la reserva");
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

        if (flight == null) {
            System.out.println("\n[ERROR] El código de vuelo '" + b.getCodeBookedFlight() + "' no existe en el sistema.");
            System.out.println("-> NOTA: Si usaste letras en el código del vuelo (ej: AV101), recuerda que el sistema actual");
            System.out.println("   lo convierte a número. Intenta registrar y reservar usando SOLO números (ej: 1234).");
            return;
        }

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
