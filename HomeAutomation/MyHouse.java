public class MyHouse {
    public static void main(String[] args) {
        Furniture sofa = new Furniture("Sofa", 3, "Leather");
        Furniture table = new Furniture("Table", 4, "Wood");
        Electronics refrigerator = new Electronics("Refrigerator", 500, 2);
        Electronics television = new Electronics("Television", 150, 1);
        SmartElectronics smartTelevision = new SmartElectronics("Smart Television", 200, 2, "Wi-Fi");

        System.out.println("Furniture Details:");
        System.out.println(sofa.getDescription());
        System.out.println(table.getDescription());
        System.out.println("Electronics Details:");
        System.out.println(refrigerator.getItemName());
        System.out.println(television.getItemName());
        System.out.println("Smart Electronics Details:");
        System.out.println(smartTelevision.getItemName() + " with " + smartTelevision.getConnectivity());

        Furniture comfySofa = new Furniture("Comfy Sofa", 4, "Fabric");
        System.out.println("Comfy Sofa Details:");
        System.out.println(comfySofa.getDescription());
    }
}

