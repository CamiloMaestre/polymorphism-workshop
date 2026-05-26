import entities.Booking;
import entities.Flies;
import entities.Passengers;
import repository.PassengerRepository;
import service.BookingService;
import service.FliesService;
import service.PassangerService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PassangerService serviP = new PassangerService();
        FliesService serviF = new FliesService();
        BookingService serviB = new BookingService();


        Scanner sc= new Scanner(System.in);
        int option;

        do {
            System.out.println("\n===== FLUXIOAIR =====");
            System.out.println("1. Registrar de pasajero");
            System.out.println("2. crear vuelo");
            System.out.println("3. realizar reserva");
            System.out.println("4. cancelar reserva");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    regisPassenger(sc,serviP);
                    break;

                case 2:
                    regisFlies(sc,serviF);
                    break;

                case 3:
                    regisBooking(sc,serviB,serviF);
                    break;

                case 4:

                    break;

                case 5:

                    break;
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
        System.out.println("ingrese la cedula");
        long id = sc.nextLong();
        System.out.println("ingrese nombre");
        String name= sc.nextLine();
        System.out.println("ingrese apellido");
        String lastname= sc.nextLine();
        System.out.println("ingrese la edad");
        int age = sc.nextInt();
        System.out.println("ingrese el correo");
        String email= sc.nextLine();
        System.out.println("ingrese el numero de contacto");
        long numberContact = sc.nextLong();
        System.out.println("ingrese el numero de pasaporte");
        long passNumber = sc.nextLong();
        System.out.println("ingrese la nacionalidad");
        String nacionality =sc.nextLine();

        Passengers p = new Passengers(id,name,lastname,age,email,numberContact,passNumber,nacionality);
        serviP.saveData(p);


    }
    static void regisFlies(Scanner sc, FliesService serviF){
        System.out.println("ingrese codigo de vuelo");
        String codeFly = sc.nextLine();
        System.out.println("ingrese la ciudad de origen");
        String cityOrigin= sc.nextLine();
        System.out.println("ingrese la ciudad de destino");
        String cityDestination= sc.nextLine();
        System.out.println("ingrese la fecha de vuelo");
        String dateFly= sc.nextLine();
        System.out.println("ingrese la hora de salida");
        String hourDeperature= sc.nextLine();
        System.out.println("ingrese la hora de llegada");
        String hourArrive= sc.nextLine();
        System.out.println("ingrese la capacidad del vuelo");
        long capacity = sc.nextLong();
        System.out.println("ingrese el precio del tiquete ");
        double priceticket= sc.nextDouble();
        System.out.println("requiere visa ?(true/false)");
        boolean visa = sc.nextBoolean();
        String status = "Disponible ";


        Flies f= new Flies(codeFly,cityOrigin,cityDestination,dateFly,hourDeperature,hourArrive,priceticket,status);
        serviF.saveData(f);
    }
    static void regisBooking(Scanner sc, BookingService serviB, FliesService serviF){
        System.out.println("ingrese la cedula del pasajero: ");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("ingrese un codigo de reserva");
        String bookingCode = sc.nextLine();
        System.out.println("escoga tipo de vuelo:");
        System.out.println("0.nacional");
        System.out.println("1.internacional");
        int tipeFlies = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese el codigo del vuelo a reservar:");
        String codeFly = sc.nextLine();
        Flies fly = serviF.findByCode(codeFly);
        double priceticket = fly.getBasePrice();
        System.out.println("ingrese la cantidad de asientos a reservar: min 1, max 5");
        int amountSeat = sc.nextInt();
        sc.nextLine();
        double totalPrice = priceticket * amountSeat;
        System.out.println("ingrese la fecha de reservacion");
        String dateBooking = sc.nextLine();
        System.out.println("Precio total: " + totalPrice);
        String statusBooking= "confirmado";
        Booking b = new Booking(bookingCode,id,amountSeat,dateBooking,statusBooking,tipeFlies);
        serviB.saveData(b);
    }



}