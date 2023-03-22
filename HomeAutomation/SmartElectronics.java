public class SmartElectronics extends Electronics {
    private String connectivity;

    public SmartElectronics(String itemName, double energyRequired, int warranty, String connectivity) {
        super(itemName, energyRequired, warranty);
        this.connectivity = connectivity;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public String getDescription() {
        return getItemName() + " with " + connectivity;
    }
}

