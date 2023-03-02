package com.diviso.launch;
import com.diviso.production.*;
import java.util.ArrayList;
import java.util.List;

public class Adidas
{
    private List<Item> sportsItems = new ArrayList<>();
    private List<Sport> sports = new ArrayList<>();
    private int price;

    public List<Item> getSportsItems() { return sportsItems;}
    public void setSportsItems(List<Item> sportsItems) { this.sportsItems = sportsItems;}

    public List<Sport> getSports() { return sports;}
    public void setSports(List<Sport> sports) { this.sports = sports;}

    public int getPrice() { return price;}
    public void setPrice(int price) { this.price = price;}

    public static void main(String[] args)
    {
        ViewController vController = new ViewController();
        vController.viewInfo();
        vController.viewControl();
    }

    @Override
    public String toString() {
        return "Adidas{" +
                "sportsItems=" + sportsItems +
                ", sports=" + sports +
                ", price=" + price +
                '}';
    }
}
