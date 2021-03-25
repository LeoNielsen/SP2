public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();

       Car car = new DieselCar("ab 12 312", "Volkswagen", "Golf", 2015, 5, true, 18.7);
       Car car1 = new PetrolCar("dd 15 666", "kia", "pincanto", 2016, 5, 95, 22.1);
       Car car2 = new ElectricCar("bb 22 312", "Mercedes", "B-Electric", 2015, 5, 28, 200, 176);

        garage.addCar(car);
        garage.addCar(car1);
        garage.addCar(car2);

        System.out.println(garage);

        System.out.println(garage.calculateGreenTaxForCarPark());

    }
}
