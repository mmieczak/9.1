public class Car extends Vehicle {
    private final int seatsAmount;

    public Car(String name, int productionYear, int seatsAmount) {
        super(name, productionYear);
        this.seatsAmount = seatsAmount;
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + super.getName() + '\'' +
                ", currentDirection='" + super.getCurrentDirection() + '\'' +
                ", productionYear=" + super.getProductionYear() + '\'' +
                ", seatsAmount=" + seatsAmount +
                '}';
    }
}

