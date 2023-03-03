package com.diviso.production;
import java.util.List;
import java.util.*;

public class Item implements AirFillable,Airlessable
{
    private String itemName;
    private int itemPrice;
    private String itemOffer;

    private List<Item> sportsItems = new ArrayList<>();

    public String getName() { return itemName;}
    public void setName(String itemName) {this.itemName = itemName;}

    public int getPrice() { return itemPrice;}
    public void setPrice(int itemPrice) { this.itemPrice = itemPrice;}

    public String getOffer() { return itemOffer;}
    public void setOffer(String itemOffer) { this.itemOffer = itemOffer;}

    public List<Item> getSportsItems() { return sportsItems;}
    public void setSportsItems(List<Item> sportsItems) { this.sportsItems = sportsItems;}

    Scanner sc = new Scanner(System.in);

    public void addSportsItems()
    {
        SoccerBall soccerBall = new SoccerBall();
        SoccerCleats soccerCleats = new SoccerCleats();
        SoccerUniform soccerUniform = new SoccerUniform();

        BadmintonShoes badmintonShoes = new BadmintonShoes();
        BadmintonShuttleCock badmintonShuttleCock = new BadmintonShuttleCock();
        BadmintonRacket badmintonRacket = new BadmintonRacket();

        CricketBag cricketBag = new CricketBag();
        CricketBall cricketBall = new CricketBall();
        CricketBat cricketBat = new CricketBat();

        //--------------FootballDetails-----------------

        System.out.println("Enter Soccer Ball Name : ");
        soccerBall.setName(sc.nextLine());

        System.out.println("Enter Soccer Ball Price : ");
        soccerBall.setPrice(sc.nextInt());

        System.out.println("Enter Soccer Ball Offer Details : ");
        soccerBall.setOffer(sc.next());

        System.out.println("Enter Soccer Cleats Model Name : ");
        soccerCleats.setName(sc.nextLine());

        System.out.println("Enter Soccer Cleats Price : ");
        soccerCleats.setPrice(sc.nextInt());

        System.out.println("Enter Soccer Cleats Offer Details : ");
        soccerCleats.setOffer(sc.nextLine());

        System.out.println("Enter Soccer Uniform Model Name : ");
        soccerUniform.setName(sc.nextLine());

        System.out.println("Enter Soccer Uniform Price : ");
        soccerUniform.setPrice(sc.nextInt());

        System.out.println("Enter Soccer Uniform Offer Details : ");
        soccerUniform.setOffer(sc.nextLine());

        //--------------BadmintonDetails-----------------

        System.out.println("Enter Badminton Shoes Model Name : ");
        badmintonShoes.setName(sc.nextLine());

        System.out.println("Enter Badminton Shoes Price : ");
        badmintonShoes.setPrice(sc.nextInt());

        System.out.println("Enter Badminton Shoes Offer Details : ");
        badmintonShoes.setOffer(sc.nextLine());

        System.out.println("Enter Badminton Shuttlecock Model Name : ");
        badmintonShuttleCock.setName(sc.nextLine());

        System.out.println("Enter Badminton Shuttlecock Price : ");
        badmintonShuttleCock.setPrice(sc.nextInt());

        System.out.println("Enter Badminton Shuttlecock Offer Details : ");
        badmintonShuttleCock.setOffer(sc.nextLine());

        System.out.println("Enter Badminton Racket Model Name : ");
        badmintonRacket.setName(sc.nextLine());

        System.out.println("Enter Badminton Racket Price : ");
        badmintonRacket.setPrice(sc.nextInt());

        System.out.println("Enter Badminton Racket Offer Details : ");
        badmintonRacket.setOffer(sc.nextLine());

        //--------------CricketDetails-----------------

        System.out.println("Enter Cricket Bag Model Name : ");
        cricketBag.setName(sc.nextLine());

        System.out.println("Enter Cricket Bag Price : ");
        cricketBag.setPrice(sc.nextInt());

        System.out.println("Enter Cricket Bag Offer Details : ");
        cricketBag.setOffer(sc.nextLine());

        System.out.println("Enter Cricket Ball Model Name : ");
        cricketBall.setName(sc.nextLine());

        System.out.println("Enter Cricket Ball Price : ");
        cricketBall.setPrice(sc.nextInt());

        System.out.println("Enter Cricket Ball Offer Details : ");
        cricketBall.setOffer(sc.nextLine());

        System.out.println("Enter Cricket Bat Model Name : ");
        cricketBat.setName(sc.nextLine());

        System.out.println("Enter Cricket Bat Price : ");
        cricketBat.setPrice(sc.nextInt());

        System.out.println("Enter Cricket Bat Offer Details : ");
        cricketBat.setOffer(sc.nextLine());

        sportsItems.add(soccerBall);
        sportsItems.add(soccerCleats);
        sportsItems.add(soccerUniform);

        sportsItems.add(badmintonShoes);
        sportsItems.add(badmintonShuttleCock);
        sportsItems.add(badmintonRacket);

        sportsItems.add(cricketBag);
        sportsItems.add(cricketBall);
        sportsItems.add(cricketBat);
    }

    public void showSportsItems()
    {

    }

    @Override
    public void airFillableBallDetails() {
        System.out.println("AIR Fillable Balls Lists : ");
        System.out.println("1.Football \n 2.VolleyBall \n 3.Rugby \n 4.BasketBall");
    }

    @Override
    public void airlessableBallDetails() {
        System.out.println("AIRLESS Balls Lists : ");
        System.out.println("1.Cricket \n 2.Hokey \n 3.American Football");
    }

    @Override
    public String toString() {
        return  "Enter Item Name : " + itemName + "\n"+
                "Enter Item Price : " + itemPrice + "\n"+
                "Enter Item Offer : " + itemOffer + "\n";

        //toString in child child details
        //ball details
        //object connectivity
        //super UI
        //Read Code One More Time!
    }
}
