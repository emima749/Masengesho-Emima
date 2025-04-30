package constraction;
    public class MaterialDelivery extends ConstructionMaterial {

        public MaterialDelivery(String contractorId, String contractorName, double materialQuantity) {
            super(contractorId, contractorName, materialQuantity);
        }

        @Override
        public void receiveMaterial() {
            if (materialQuantity >= 1 && materialQuantity <= 10) {
                materialBalance += materialQuantity;
                System.out.println("Material Delivered Successfully! Current Balance: " + materialBalance + " tons.");
            } else {
                System.out.println("Error: Delivery quantity must be between 1 and 10 tons.");
            }
        }

        @Override
        public void useMaterial() { /* Not used in this class */ }

        @Override
        public void estimateCost() { /* Not used in this class */ }
    }

