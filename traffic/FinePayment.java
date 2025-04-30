package traffic;

    public class FinePayment extends TrafficRecord {

        public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType, double fineAmount, String paymentStatus) {
            super(driverId, driverName, vehiclePlate, violationType);
            this.fineAmount = fineAmount;
            this.paymentStatus = paymentStatus;
        }

        @Override
        public void processPayment() {
            if (paymentStatus.equalsIgnoreCase("PAID")) {
                System.out.println("Error: This fine has already been paid.");
                return;
            }

            paymentStatus = "PAID";
            System.out.println("\n--- Payment Receipt ---");
            System.out.println("Driver: " + driverName);
            System.out.println("Vehicle Plate: " + vehiclePlate);
            System.out.println("Violation: " + violationType);
            System.out.println("Amount Paid: " + fineAmount + " RWF");
            System.out.println("Payment Status: " + paymentStatus);
        }

        @Override
        public void recordViolation() {}
        @Override
        public void assessFine() {}
    }


