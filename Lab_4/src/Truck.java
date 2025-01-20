class Truck extends Vehicle implements Fuelable {
    int fuelLevel;

    public Truck(String brand, String model) {
        super(brand, model);
        this.fuelLevel = 0;
    }

    @Override
    public void start() {
        System.out.println("Truck " + this + " starting.");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + this + " stopping.");
    }

    @Override
    public void refuel(int liters) {
        fuelLevel += liters;
        System.out.println("Truck " + this + " refueled with " + liters + " liters. Fuel level: " + fuelLevel);
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}