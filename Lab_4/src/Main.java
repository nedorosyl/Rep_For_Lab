
public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Car("Lada", "2107"),
                new Truck("Peterbilt", "389"),
                new ElectricCar("Tesla", "Model 3")
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            ((Fuelable) vehicle).refuel(50);
            ((Fuelable) vehicle).refuel(2.5);
            System.out.println("Fuel level: " + ((Fuelable) vehicle).getFuelLevel());
            System.out.println("---------");
        }
    }
}