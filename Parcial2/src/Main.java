import entities.Booking;
import entities.Flies;
import entities.Passengers;
import entities.domesticFlight;
import entities.internationalFlight;
import repository.BookingRepository;
import repository.FliesRepository;
import repository.PassengerRepository;
import service.BookingService;
import service.FliesService;
import service.PassangerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PassengerRepository repoP = new PassengerRepository();
        FliesRepository repoF = new FliesRepository();
        BookingRepository repoB = new BookingRepository();


        PassangerService serviP = new PassangerService(repoP);
        FliesService serviF = new FliesService(repoF);
        BookingService serviB = new BookingService(repoB, repoP, repoF);

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n===== FLUXIOAIR =====");
            System.out.println("1. Registrar de pasajero");
            System.out.println("2. crear vuelo");
            System.out.println("3. realizar reserva");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    regisPassenger(sc, serviP);
                    break;
                case 2:
                    regisFlies(sc, serviF);
                    break;
                case 3:
                    regisBooking(sc, serviB);
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (option != 0);

        sc.close();
    }

    static void regisPassenger(Scanner sc, PassangerService serviP){
        System.out.println("ingrese la cedula:");
        long id = sc.nextLong();
        sc.nextLine(); // Limpiar buffer
        System.out.println("ingrese nombre:");
        String name = sc.nextLine();
        System.out.println("ingrese apellido:");
        String lastname = sc.nextLine();
        System.out.println("ingrese la edad:");
        int age = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        System.out.println("ingrese el correo:");
        String email = sc.nextLine();
        System.out.println("ingrese el numero de contacto:");
        long numberContact = sc.nextLong();
        System.out.println("ingrese el numero de pasaporte:");
        long passNumber = sc.nextLong();
        sc.nextLine(); // Limpiar buffer
        System.out.println("ingrese la nacionalidad:");
        String nacionality = sc.nextLine();

        Passengers p = new Passengers(id, name, lastname, age, email, numberContact, passNumber, nacionality);
        serviP.saveData(p);
    }

    static void regisFlies(Scanner sc, FliesService serviF){
        System.out.println("ingrese codigo de vuelo:");
        String codeFly = sc.nextLine();
        System.out.println("ingrese la ciudad de origen:");
        String cityOrigin = sc.nextLine();
        System.out.println("ingrese la ciudad de destino:");
        String cityDestination = sc.nextLine();
        System.out.println("ingrese la fecha de vuelo:");
        String dateFly = sc.nextLine();
        System.out.println("ingrese la hora de salida:");
        String hourDeparture = sc.nextLine();
        System.out.println("ingrese la hora de llegada:");
        String hourArrive = sc.nextLine();
        System.out.println("ingrese la capacidad del vuelo:");
        int capacity = sc.nextInt();
        System.out.println("ingrese el precio del tiquete:");
        double priceticket = sc.nextDouble();
        System.out.println("¿Es un vuelo Internacional? (true = Internacional / false = Nacional):");
        boolean isInternational = sc.nextBoolean();
        sc.nextLine();

        String status = "Disponible";
        Flies f;


        if (isInternational) {
            System.out.println("ingrese el país de destino:");
            String countryDest = sc.nextLine();
            System.out.println("¿Requiere visa? (true/false):");
            boolean visa = sc.nextBoolean();
            System.out.println("ingrese el cargo internacional (impuesto):");
            double charge = sc.nextDouble();
            sc.nextLine();
            f = new internationalFlight(codeFly, cityOrigin, cityDestination, dateFly, hourDeparture, hourArrive, priceticket, status, countryDest, visa, charge);
        } else {
            System.out.println("ingrese duración estimada en horas:");
            double duration = sc.nextDouble();
            sc.nextLine();
            System.out.println("¿Incluye comida en cabina? (Sí/No):");
            String food = sc.nextLine();
            f = new domesticFlight(codeFly, cityOrigin, cityDestination, dateFly, hourDeparture, hourArrive, priceticket, status, duration, food);
        }

        f.setCapacity(capacity);
        f.setSeatsAvailable(capacity);
    }

    static void regisBooking(Scanner sc, BookingService serviB){
        System.out.println("ingrese la cedula del pasajero: ");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("ingrese un codigo de reserva:");
        String bookingCode = sc.nextLine();
        System.out.println("escoga tipo de vuelo (0. Nacional / 1. Internacional):");
        int tipeFlies = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese el codigo del vuelo a reservar:");
        String codeFly = sc.nextLine();
        System.out.println("ingrese la cantidad de asientos a reservar (min 1, max 5):");
        int amountSeat = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese la fecha de reservacion:");
        String dateBooking = sc.nextLine();

        long flightCodeLong = 0;
        try {
            flightCodeLong = Long.parseLong(codeFly);
        } catch (NumberFormatException e) {
        }

        Booking b = new Booking(bookingCode, id, amountSeat, dateBooking, "confirmado", tipeFlies);
        b.setCodeBookedFlight(flightCodeLong);
        serviB.saveData(b);
    }
    static void cancelBooking(Scanner sc, BookingService serviB){
        System.out.println("ingrese el codigo de la reserva a cancelar:");
        String cancelB = sc.nextLine();

        Booking b = serviB.cancel(cancelB);

        if(b != null){
            b.setStatusBooking("Cancelado");
            serviB.updateBooking(b);
            System.out.println("Reserva cancelada exitosamente");
        } else {
            System.out.println("No se encontró la reserva");
        }
    }
}