package traffic;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Driver ID (16 digits): ");
            String driverId = scanner.nextLine();
            if (!driverId.matches("\\d{16}")) {
                System.out.println("Invalid National ID. Must be 16 digits.");
                return;
            }

            System.out.print("Enter Driver Name: ");
            String driverName = scanner.nextLine();

            System.out.print("Enter Vehicle Plate (e.g., RAB123D): ");
            String vehiclePlate = scanner.nextLine();
            if (!vehiclePlate.matches("R[A-Z]{2}\\d{3}[A-Z]")) {
                System.out.println("Invalid vehicle plate format.");
                return;
            }

            System.out.print("Enter Violation Type (SPEEDING, RED_LIGHT, NO_HELMET, DUI): ");
            String violationType = scanner.nextLine();

            // Step 1: Record Violation
            ViolationEntry entry = new ViolationEntry(driverId, driverName, vehiclePlate, violationType);
            entry.recordViolation();

            // Step 2: Assess Fine
            FineAssessment assessment = new FineAssessment(driverId, driverName, vehiclePlate, violationType);
            assessment.assessFine();

            // Step 3: Process Payment
            System.out.print("\nDo you want to pay the fine now? (yes/no): ");
            String payNow = scanner.nextLine();

            if (payNow.equalsIgnoreCase("yes")) {
                FinePayment payment = new FinePayment(driverId, driverName, vehiclePlate, violationType, assessment.getFineAmount(), assessment.getPaymentStatus());
                payment.processPayment();
            } else {
                System.out.println("Fine remains unpaid.");
            }
        }
    }


