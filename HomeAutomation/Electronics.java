public class Electronics {
    private String itemName;
    private double energyRequired;
    private int warranty;

    public Electronics(String itemName, double energyRequired, int warranty) {
        this.itemName = itemName;
        this.energyRequired = energyRequired;
        this.warranty = warranty;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getEnergyRequired() {
        return energyRequired;
    }

    public void setEnergyRequired(double energyRequired) {
        this.energyRequired = energyRequired;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}

