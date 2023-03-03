package com.lxisoft.fruitsStore.entity;

public class Fruit {

    private String fruitName;
    private int price;
    private int quantity;
    
    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fruit Name : " + fruitName + "\n" +  "Fruit Price : " + price + "rs" + "\n" +  "Quantity : " + quantity + "kg" + "\n";
    }
    
}
