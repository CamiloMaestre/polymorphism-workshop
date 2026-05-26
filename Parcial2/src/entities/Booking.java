package entities;

public class Booking {
    private String codeBooking;
    private long passengerBooking;
    private String codeBookedFlight;
    private int SeatsNumberBooked;
    private String dateBooking;
    private String statusBooking;
    private int tipeFly;


    public Booking(String codeBooking, long passengerBooking, int seatsNumberBooked, String dateBooking, String statusBooking, int tipeFly) {
        this.codeBooking = codeBooking;
        this.passengerBooking = passengerBooking;
        SeatsNumberBooked = seatsNumberBooked;
        this.dateBooking = dateBooking;
        this.statusBooking = statusBooking;
        this.tipeFly = tipeFly;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public int getTipeFly() {
        return tipeFly;
    }

    public void setTipeFly(int tipeFly) {
        this.tipeFly = tipeFly;
    }

    public String getStatusBooking() {
        return statusBooking;
    }

    public void setStatusBooking(String statusBooking) {
        this.statusBooking = statusBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public int getSeatsNumberBooked() {
        return SeatsNumberBooked;
    }

    public void setSeatsNumberBooked(int seatsNumberBooked) {
        SeatsNumberBooked = seatsNumberBooked;
    }

    public String getCodeBookedFlight() {
        return codeBookedFlight;
    }

    public void setCodeBookedFlight(String codeBookedFlight) {
        this.codeBookedFlight = codeBookedFlight;
    }

    public long getPassengerBooking() {
        return passengerBooking;
    }

    public void setPassengerBooking(long passengerBooking) {
        this.passengerBooking = passengerBooking;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking='" + codeBooking + '\'' +
                ", passengerBooking=" + passengerBooking +
                ", codeBookedFlight=" + codeBookedFlight +
                ", SeatsNumberBooked=" + SeatsNumberBooked +
                ", dateBooking='" + dateBooking + '\'' +
                ", statusBooking='" + statusBooking + '\'' +
                ", tipeFly=" + tipeFly +
                '}';
    }
}
