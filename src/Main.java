public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car = new DieselCar("ab 12 312", "kia", "pincanto", 2016, 4, true, 22.1);

        garage.addCar(car);

        System.out.println(garage);

        System.out.println(garage.calculateGreenTaxForCarPark());

    }
}
