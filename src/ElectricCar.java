public class ElectricCar extends Car {

    int batteryCapacityKWh;
    int maxKm;
    double whPrKm;
    int greenTax;
    public ElectricCar(String regNr, String brand, String model, int regYear, int numOfDoors, int batteryCapacityKWh, int maxKm, double whPrKm) {
        super(regNr, brand, model, regYear, numOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }



    @Override
    public double calculateGreenTax() {
        double kmPrL = 100 / (whPrKm / 91.25);

        if (kmPrL < 5) {
            greenTax = 10470;
        } else if (kmPrL < 10) {
            greenTax = 5500;
        } else if (kmPrL < 15) {
            greenTax = 2340;
        } else if (kmPrL < 20) {
            greenTax = 1050;
        } else {
            greenTax = 330;
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
                "Battery Capacity: " + batteryCapacityKWh + " KWh" + '\n' +
                "Max Distance: " + maxKm + '\n' +
                "Wh/km: " + whPrKm + '\n';
    }

}
