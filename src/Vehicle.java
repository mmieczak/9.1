public abstract class Vehicle implements Movable {
    private final String name;
    private String currentDirection;
    private final int productionYear;

    public Vehicle(String name, int productionYear) {
        this.name = name;
        this.currentDirection = "";
        this.productionYear = productionYear;
    }

    public String getName() {
        return name;
    }

    public String getCurrentDirection() {
        return currentDirection;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public void turnLeft() {
        currentDirection = "left";
    }

    @Override
    public void turnRight() {
        currentDirection = "right";
    }

    @Override
    public void goForward() {
        currentDirection = "forward";
    }

    @Override
    public void goBack() {
        currentDirection = "back";
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", productionYear=" + productionYear + '}';
    }
}
