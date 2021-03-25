import java.util.ArrayList;


public class Garage {
    private final String name = "First Lease";
    private ArrayList<Car> cars = new ArrayList<>();


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
