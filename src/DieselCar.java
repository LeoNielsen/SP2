public class DieselCar extends Car {

    private boolean hasParticulateFilter;
    private double kmPrL;
    private int greenTax;

    public DieselCar(String regNr, String brand, String model, int regYear, int numOfDoors, boolean hasParticulateFilter, double kmPrL) {
        super(regNr, brand, model, regYear, numOfDoors);
        this.hasParticulateFilter = hasParticulateFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    public double calculateGreenTax() {

        if (kmPrL < 5) {
            greenTax = 10470;
            if (!hasParticulateFilter) {
                greenTax = greenTax + 15260;
            }
        } else if (kmPrL < 10) {
            greenTax = 5500;
            if (!hasParticulateFilter) {
                greenTax = greenTax + 2770;
            }
        } else if (kmPrL < 15) {
            greenTax = 2340;
            if (!hasParticulateFilter) {
                greenTax = greenTax + 1850;
            }
        } else if (kmPrL < 20) {
            greenTax = 1050;
            if (!hasParticulateFilter) {
                greenTax = greenTax + 1390;
            }
        } else {
            greenTax = 330;
            if (!hasParticulateFilter) {
                greenTax = greenTax + 130;
            }
        }

        return greenTax;
    }

    @Override
    public String toString() {
        return "RegNr: " + regNr + '\n' +
                "Brand: " + brand + '\n' +
                "Model: " + model + '\n' +
                "RegYear: " + regYear + '\n' +
                "Doors: " + numOfDoors + '\n' +
                "Particulate Filter: " + hasParticulateFilter + '\n' +
                "km/l: " + kmPrL + '\n';
    }
}
