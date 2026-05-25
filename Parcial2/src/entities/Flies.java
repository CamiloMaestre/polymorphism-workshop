package entities;

public class Flies {

    private String codeFly;
    private String cityOrigin;
    private String cityDestination;
    private String dateFly;
    private String hourDeparture;
    private String hourArrive;
    private long capacity;
    private int seatsAvailable;
    private double basePrice;
    private String statusFly;


    public Flies(String codeFly, String cityOrigin, String cityDestination, String dateFly, String hourDeparture, String hourArrive, long capacity, int seatsAvailable, double basePrice, String statusFly) {
        this.codeFly = codeFly;
        this.cityOrigin = cityOrigin;
        this.cityDestination = cityDestination;
        this.dateFly = dateFly;
        this.hourDeparture = hourDeparture;
        this.hourArrive = hourArrive;
        this.capacity = capacity;
        this.seatsAvailable = seatsAvailable;
        this.basePrice = basePrice;
        this.statusFly = statusFly;
    }

    public String getCodeFly() {
        return codeFly;
    }

    public void setCodeFly(String codeFly) {
        this.codeFly = codeFly;
    }

    public String getCityOrigin() {
        return cityOrigin;
    }

    public void setCityOrigin(String cityOrigin) {
        this.cityOrigin = cityOrigin;
    }

    public String getCityDestination() {
        return cityDestination;
    }

    public void setCityDestination(String cityDestination) {
        this.cityDestination = cityDestination;
    }

    public String getDateFly() {
        return dateFly;
    }

    public void setDateFly(String dateFly) {
        this.dateFly = dateFly;
    }

    public String getHourDeparture() {
        return hourDeparture;
    }

    public void setHourDeparture(String hourDeparture) {
        this.hourDeparture = hourDeparture;
    }

    public String getHourArrive() {
        return hourArrive;
    }

    public void setHourArrive(String hourArrive) {
        this.hourArrive = hourArrive;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getStatusFly() {
        return statusFly;
    }

    public void setStatusFly(String statusFly) {
        this.statusFly = statusFly;
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
                ", seatsAvailable=" + seatsAvailable +
                ", basePrice=" + basePrice +
                ", statusFly='" + statusFly + '\'' +
                '}';
    }
}
