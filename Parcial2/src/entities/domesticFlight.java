package entities;

public class domesticFlight extends Flies{

    private double estimatedDuration;
    private String includesFood;

    public domesticFlight(String codeFly, String cityOrigin, String cityDestination, String dateFly, String hourDeparture, String hourArrive, int seatsAvailable, double basePrice, String statusFly, double estimatedDuration, String includesFood) {
        super(codeFly, cityOrigin, cityDestination, dateFly, hourDeparture, hourArrive, basePrice, statusFly);
        this.estimatedDuration = estimatedDuration;
        this.includesFood = includesFood;
    }

    public double getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(double estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public String getIncludesFood() {
        return includesFood;
    }

    public void setIncludesFood(String includesFood) {
        this.includesFood = includesFood;
    }
}
