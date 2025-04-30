package constraction;

public class MaterialUsage extends ConstructionMaterial {

    public MaterialUsage(String contractorId, String contractorName, double materialQuantity, double currentBalance) {
        super(contractorId, contractorName, materialQuantity);
        this.materialBalance = currentBalance;
    }

    @Override
    public void useMaterial() {
        if ((materialBalance - materialQuantity) >= 2) {
            materialBalance -= materialQuantity;
            System.out.println("Material used successfully! Remaining Balance: " + materialBalance + " tons.");
        } else {
            System.out.println("Error: Cannot use material. Minimum balance of 2 tons must remain.");
        }
    }

    @Override
    public void receiveMaterial() { /* Not used in this class */ }

    @Override
    public void estimateCost() { /* Not used in this class */ }
}

