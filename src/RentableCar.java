public class RentableCar extends Car implements Rentable {
    private Person rentingPerson;

    public RentableCar(Car car) {
        super(car.getName(), car.getProductionYear(), car.getSeatsAmount());
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        this.rentingPerson = new Person(firstName, lastName, id);
    }

    @Override
    public void handOver() {
        rentingPerson = null;
    }

    @Override
    public boolean isRent() {
        return (rentingPerson != null);
    }

    @Override
    public String toString() {
        return "RentableCar{" +
                "rentingPerson=" + rentingPerson +
                ", Car{" +
                "Name: " + getName() +
                ", Production year: " + getProductionYear() +
                ", Seats amount: " + getSeatsAmount() +
                '}';
    }
}
