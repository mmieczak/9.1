public class Tester {
    public static void main(String[] args) {

        Vehicle[] vehicleCatalog = new Vehicle[5];
        vehicleCatalog[0] = new Car("Porsche Panamera", 2018, 4);
        vehicleCatalog[1] = new MotorBike("Suzuki Hayabusa", 2016, 300);
        vehicleCatalog[2] = new MotorBike("Harley FLHX Street Glide", 2007, 200);
        vehicleCatalog[3] = new Car("VW Passat", 2019, 5);
        vehicleCatalog[4] = new Car("Ford Fiesta", 2015, 5);

        vehicleCatalog[0].goForward();
        System.out.println("Direction: " + vehicleCatalog[0].getCurrentDirection());
        vehicleCatalog[0].goBack();
        System.out.println(vehicleCatalog[0].toString());

        vehicleCatalog[2].turnLeft();
        System.out.println("Direction: " + vehicleCatalog[2].getCurrentDirection());
        vehicleCatalog[2].turnRight();
        System.out.println(vehicleCatalog[2].toString());

    }
}
