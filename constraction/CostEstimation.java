package constraction;
public class CostEstimation extends ConstructionMaterial {

    public CostEstimation(String contractorId, String contractorName, double materialQuantity) {
        super(contractorId, contractorName, materialQuantity);
    }

    @Override
    public void estimateCost() {
        double costPerTon = (materialQuantity > 15) ? 180000 : 200000;
        double totalCost = costPerTon * materialQuantity;

        System.out.println("----- Cost Estimation -----");
        System.out.println("Contractor ID: " + contractorId);
        System.out.println("Contractor Name: " + contractorName);
        System.out.println("Quantity Used: " + materialQuantity + " tons");
        System.out.printf("Total Cost: %, .2f UGX%n", totalCost);
    }

    @Override
    public void receiveMaterial() { /* Not used in this class */ }

    @Override
    public void useMaterial() { /* Not used in this class */ }
}

