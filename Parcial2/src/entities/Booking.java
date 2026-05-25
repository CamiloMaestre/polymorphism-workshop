package entities;

public class Booking {
    private String codeBooking;
    private String passengerBooking;
    private long codeBookedFlight;
    private int SeatsNumberBooked;
    private String dateBooking;
    private String statusBooking;


    public Booking(String codeBooking, String passengerBooking, long codeBookedFlight, int seatsNumberBooked, String dateBooking, String statusBooking) {
        this.codeBooking = codeBooking;
        this.passengerBooking = passengerBooking;
        this.codeBookedFlight = codeBookedFlight;
        SeatsNumberBooked = seatsNumberBooked;
        this.dateBooking = dateBooking;
        this.statusBooking = statusBooking;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getPassengerBooking() {
        return passengerBooking;
    }

    public void setPassengerBooking(String passengerBooking) {
        this.passengerBooking = passengerBooking;
    }

    public long getCodeBookedFlight() {
        return codeBookedFlight;
    }

    public void setCodeBookedFlight(long codeBookedFlight) {
        this.codeBookedFlight = codeBookedFlight;
    }

    public int getSeatsNumberBooked() {
        return SeatsNumberBooked;
    }

    public void setSeatsNumberBooked(int seatsNumberBooked) {
        SeatsNumberBooked = seatsNumberBooked;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getStatusBooking() {
        return statusBooking;
    }

    public void setStatusBooking(String statusBooking) {
        this.statusBooking = statusBooking;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking=" + codeBooking +
                ", passengerBooking='" + passengerBooking + '\'' +
                ", codeBookedFlight=" + codeBookedFlight +
                ", SeatsNumberBooked=" + SeatsNumberBooked +
                ", dateBooking='" + dateBooking + '\'' +
                ", statusBooking='" + statusBooking + '\'' +
                '}';
    }
}
