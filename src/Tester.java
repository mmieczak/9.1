public class Tester {
    public static void main(String[] args) {

        //Cars table
        Car[] cars = new Car[2];
        cars[0] = new Car("Ford Mustang", 1965, 4);
        cars[1] = new Car("Porsche Panamera", 2019, 4);

        //Renting registry
        RentableCar[] rentRegistry = new RentableCar[10];
        //Rent car 1
        rentRegistry[0] = new RentableCar(cars[0]);
        rentRegistry[0].rent("John", "Snow", "123456789");
        System.out.println("Renting a car...");

        runReturnCarScenario(rentRegistry[0]);

        //Rent car 2
        rentRegistry[1] = new RentableCar(cars[1]);
        rentRegistry[1].rent("Mike", "Tyson", "666666666");
        System.out.println("Renting a car...");
        runReturnCarScenario(rentRegistry[1]);
    }

    public static void runReturnCarScenario(RentableCar rentCar) {
        System.out.println("\t>" + rentCar.toString());
        System.out.println("Is car rent currently: " + rentCar.isRent());
        System.out.println("\t>Car has returned");
        rentCar.handOver();
        System.out.println("Is car rent currently: " + rentCar.isRent());
    }
}
