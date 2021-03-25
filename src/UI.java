import java.util.Scanner;

public class UI {


    public static String getUserInput(String message) {
        System.out.println(message);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public Car createCar() {
        String input;

        input = getUserInput("""
                Select Car Type:
                1: Petrol Car
                2: Diesel Car
                3: Electric Car""");

        if (Integer.parseInt(input) >= 1 && Integer.parseInt(input) <= 3) {
            Car car = carBuilder(Integer.parseInt(input));
            return car;
        } else {
            System.out.println("no match");
        }
        return createCar();
    }


    private Car carBuilder(int carType) {
        String regNr, brand, model;
        int regYear, numOfDoors, octaneNum, maxKm, batteryCapacityKWh;
        double kmPrL, whPrKm;
        boolean hasParticulateFilter;
        String input;

        Car car = null;

        input = getUserInput("Registration Number: ");
        regNr = input;

        input = getUserInput("Car Brand: ");
        brand = input;

        input = getUserInput("Car Model: ");
        model = input;

        input = getUserInput("regYear: ");

        regYear = Integer.parseInt(input);

        input = getUserInput("Number Of Doors: ");
        numOfDoors = Integer.parseInt(input);

        switch (carType) {
            case 1 -> {
                input = getUserInput("Octane Value: ");
                octaneNum = Integer.parseInt(input);

                input = getUserInput("km/l: ");
                kmPrL = Double.parseDouble(input);

               car = new PetrolCar(regNr, brand, model, regYear, numOfDoors, octaneNum, kmPrL);
            }
                case 2 -> {
                    input = getUserInput("""
                            Does The Car Have Particulate Filter:
                            1: yes
                            2: no""");

                    if (input.equals("1")) {
                        input = "true";
                    } else {
                        input = "false";
                    }

                    hasParticulateFilter = Boolean.parseBoolean(input);
                    input = getUserInput("km/l: ");

                    kmPrL = Double.parseDouble(input);
                    car = new DieselCar(regNr, brand, model, regYear, numOfDoors, hasParticulateFilter, kmPrL);
                }
                case 3 -> {
                    input = getUserInput("battery Capacity KWh: ");
                    batteryCapacityKWh = Integer.parseInt(input);

                    input = getUserInput("Max Distance: ");
                    maxKm = Integer.parseInt(input);

                    input = getUserInput("Wh/km: ");
                    whPrKm = Double.parseDouble(input);

                    car = new ElectricCar(regNr, brand, model, regYear, numOfDoors, batteryCapacityKWh, maxKm, whPrKm);
                }

        }
        return car;
    }


}