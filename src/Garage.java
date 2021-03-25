import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
    final String name = "First Lease";
    ArrayList<Car> cars = new ArrayList<>();

//    public void addCar(){
//getUserInput("");
//
//
//    }
//    public static String getUserInput(String message) {
//        System.out.println(message);
//        Scanner scan = new Scanner(System.in);
//        return scan.nextLine();
//    }

    public void addCar(Car car) {
        cars.add(car);
    }


    public int calculateGreenTaxForCarPark() {
        int sumGreenTax = 0;

        for (Car car : cars) {
            sumGreenTax += car.calculateGreenTax();
        }
        return sumGreenTax;
    }

    @Override
    public String toString() {
        String print = name + '\n' + '\n';
        for (Car car : cars) {
            print += car;
            print += '\n';
        }
        return print;
    }
}
