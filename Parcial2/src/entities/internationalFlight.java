package entities;

public class internationalFlight extends Flies {
    private String countryDestination;
    private boolean includesVisa;
    private double internationalCharge;

    public internationalFlight(String codeFly, String cityOrigin, String cityDestination, String dateFly, String hourDeparture, String hourArrive, double basePrice, String statusFly, String countryDestination, boolean includesVisa, double internationalCharge) {
        super(codeFly, cityOrigin, cityDestination, dateFly, hourDeparture, hourArrive, basePrice, statusFly);
        this.countryDestination = countryDestination;
        this.includesVisa = includesVisa;
        this.internationalCharge = internationalCharge;
    }

    public String getCountryDestination() {
        return countryDestination;
    }

    public void setCountryDestination(String countryDestination) {
        this.countryDestination = countryDestination;
    }

    public boolean isIncludesVisa() {
        return includesVisa;
    }

    public void setIncludesVisa(boolean includesVisa) {
        this.includesVisa = includesVisa;
    }

    public double getInternationalCharge() {
        return internationalCharge;
    }

    public void setInternationalCharge(double internationalCharge) {
        this.internationalCharge = internationalCharge;
    }

    @Override
    public double calculatefinalPrice() {
        return getBasePrice() + internationalCharge;
    }
}
