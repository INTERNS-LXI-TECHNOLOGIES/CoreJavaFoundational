public class Furniture implements Comfy {
    private String itemName;
    private int capacityOfSeating;
    private String objectMadeOf;

    public Furniture(String itemName, int capacityOfSeating, String objectMadeOf) {
        this.itemName = itemName;
        this.capacityOfSeating = capacityOfSeating;
        this.objectMadeOf = objectMadeOf;
    }

    public String getItemName() {
        return itemName;
    }

    public int getCapacityOfSeating() {
        return capacityOfSeating;
    }

    public String getObjectMadeOf() {
        return objectMadeOf;
    }

    @Override
    public void sitOn() {
        System.out.println("You are now sitting on the " + itemName);
    }

    @Override
    public void layOn() {
        System.out.println("You are now lying on the " + itemName);
    }

    @Override
    public String getDescription() {
        return "This is a " + objectMadeOf + " " + itemName + " that can seat " + capacityOfSeating + " people.";
    }
}

