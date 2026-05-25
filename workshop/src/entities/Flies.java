package entities;

public class Flies {

    private String codeFly;
    private String cityOrigin;
    private String cityDestination;
    private String dateFly;
    private String hourDeparture;
    private String hourArrive;
    private long capacity;
    private double priceticket;
    private boolean visa;
    private long InternacionalCharge;
    private String statusFly;
    private long capacitySeats;


    public Flies(String codeFly, long capacitySeats, String statusFly, boolean visa, double priceticket, long capacity, String hourArrive, String hourDeparture, String dateFly, String cityDestination, String cityOrigin) {
        this.codeFly = codeFly;
        this.capacitySeats = capacitySeats;
        this.statusFly = statusFly;
        this.visa = visa;
        this.priceticket = priceticket;
        this.capacity = capacity;
        this.hourArrive = hourArrive;
        this.hourDeparture = hourDeparture;
        this.dateFly = dateFly;
        this.cityDestination = cityDestination;
        this.cityOrigin = cityOrigin;
    }

    public String getCodeFly() {
        return codeFly;
    }

    public void setCodeFly(String codeFly) {
        this.codeFly = codeFly;
    }

    public long getCapacitySeats() {
        return capacitySeats;
    }

    public void setCapacitySeats(long capacitySeats) {
        this.capacitySeats = capacitySeats;
    }

    public String getStatusFly() {
        return statusFly;
    }

    public void setStatusFly(String statusFly) {
        this.statusFly = statusFly;
    }

    public boolean isVisa() {
        return visa;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }

    public double getPriceticket() {
        return priceticket;
    }

    public void setPriceticket(double priceticket) {
        this.priceticket = priceticket;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public String getHourArrive() {
        return hourArrive;
    }

    public void setHourArrive(String hourArrive) {
        this.hourArrive = hourArrive;
    }

    public String getHourDeparture() {
        return hourDeparture;
    }

    public void setHourDeparture(String hourDeparture) {
        this.hourDeparture = hourDeparture;
    }

    public String getDateFly() {
        return dateFly;
    }

    public void setDateFly(String dateFly) {
        this.dateFly = dateFly;
    }

    public String getCityDestination() {
        return cityDestination;
    }

    public void setCityDestination(String cityDestination) {
        this.cityDestination = cityDestination;
    }

    public String getCityOrigin() {
        return cityOrigin;
    }

    public void setCityOrigin(String cityOrigin) {
        this.cityOrigin = cityOrigin;
    }

    public long getInternacionalCharge() {
        return InternacionalCharge;
    }

    public void setInternacionalCharge(long internacionalCharge) {
        InternacionalCharge = internacionalCharge;
    }



    @Override
    public String toString() {
        return "Flies{" +
                "codeFly='" + codeFly + '\'' +
                ", cityOrigin='" + cityOrigin + '\'' +
                ", cityDestination='" + cityDestination + '\'' +
                ", dateFly='" + dateFly + '\'' +
                ", hourDeparture='" + hourDeparture + '\'' +
                ", hourArrive='" + hourArrive + '\'' +
                ", capacity=" + capacity +
                ", priceticket=" + priceticket +
                ", visa=" + visa +
                ", statusFly='" + statusFly + '\'' +
                ", capacitySeats=" + capacitySeats +
                '}';
    }
}
