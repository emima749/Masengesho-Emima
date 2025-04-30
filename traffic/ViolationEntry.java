package traffic;

public class ViolationEntry extends TrafficRecord {

    public ViolationEntry(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void recordViolation() {
        if (!isValidViolation(violationType)) {
            System.out.println("Error: Invalid violation type.");
            return;
        }

        System.out.println("\nViolation Recorded:");
        System.out.println("Driver ID: " + driverId);
        System.out.println("Name: " + driverName);
        System.out.println("Vehicle Plate: " + vehiclePlate);
        System.out.println("Violation: " + violationType);
        System.out.println("Status: " + paymentStatus);
    }

    private boolean isValidViolation(String type) {
        return type.equalsIgnoreCase("SPEEDING") ||
                type.equalsIgnoreCase("RED_LIGHT") ||
                type.equalsIgnoreCase("NO_HELMET") ||
                type.equalsIgnoreCase("DUI");
    }

    @Override
    public void assessFine() {}
    @Override
    public void processPayment() {}
}


