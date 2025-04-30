package constraction;

import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Contractor ID: ");
            String contractorId = scanner.nextLine();

            System.out.print("Enter Contractor Name: ");
            String contractorName = scanner.nextLine();

            System.out.print("Enter material quantity to deliver (1-10 tons): ");
            double deliveryQty = scanner.nextDouble();
            MaterialDelivery delivery = new MaterialDelivery(contractorId, contractorName, deliveryQty);
            delivery.receiveMaterial();

            System.out.print("Enter material quantity to use: ");
            double usageQty = scanner.nextDouble();
            MaterialUsage usage = new MaterialUsage(contractorId, contractorName, usageQty, delivery.getMaterialBalance());
            usage.useMaterial();

            CostEstimation cost = new CostEstimation(contractorId, contractorName, usageQty);
            cost.estimateCost();
        }
    }


