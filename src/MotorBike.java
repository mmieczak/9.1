public class MotorBike extends Vehicle {
    private final int speedLimit;

    public MotorBike(String name, int productionYear, int speedLimit) {
        super(name, productionYear);
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "name='" + super.getName() + '\'' +
                ", currentDirection='" + super.getCurrentDirection() + '\'' +
                ", productionYear=" + super.getProductionYear() + '\'' +
                ", speedLimit=" + speedLimit +
                '}';
    }
}
