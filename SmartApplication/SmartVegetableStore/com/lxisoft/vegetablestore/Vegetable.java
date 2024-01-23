package com.lxisoft.vegetablestore;

public class Vegetable {

    private String name;
    private String price;
    private String quantity;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Vegetable Name : " + name + "\n \n" + " Vegetable Price:" + price + "\n \n" + "Vegitable Quantity: " + quantity;
    }



  

    
}
