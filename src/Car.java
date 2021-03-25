public abstract class Car {

    String regNr;
    String brand;
    String model;
    int regYear;
    int numOfDoors;

    public Car(String regNr, String brand, String model, int regYear, int numOfDoors) {
        this.regNr = regNr;
        this.brand = brand;
        this.model = model;
        this.regYear = regYear;
        this.numOfDoors = numOfDoors;
    }

    public abstract double calculateGreenTax();

}
