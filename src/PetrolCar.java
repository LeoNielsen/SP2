public class PetrolCar extends Car {

    private int octaneNum;
    private double kmPrL;
    private int greenTax;

    public PetrolCar(String regNr, String brand, String model, int regYear, int numOfDoors, int octaneNum, double kmPrL) {
        super(regNr, brand, model, regYear, numOfDoors);
        this.octaneNum = octaneNum;
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "RegNr: " + regNr + '\n' +
                "Brand: " + brand + '\n' +
                "Model: " + model + '\n' +
                "RegYear: " + regYear + '\n' +
                "Doors: " + numOfDoors + '\n' +
                "Octane number: " + octaneNum + '\n' +
                "km/l: " + kmPrL + '\n';
    }

    @Override
    public double calculateGreenTax() {

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
}
