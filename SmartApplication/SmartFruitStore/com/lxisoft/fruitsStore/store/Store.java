package com.lxisoft.fruitsStore.store;

import java.util.*;

import com.lxisoft.fruitsStore.entity.Fruit;
import com.lxisoft.fruitsStore.fruits.Apple;
import com.lxisoft.fruitsStore.fruits.Grapes;
import com.lxisoft.fruitsStore.fruits.Mango;
import com.lxisoft.fruitsStore.fruits.Orange;


public class Store {

    private String storeName;
    private String storeLocation;

    
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public String getStoreLocation() {
        return storeLocation;
    }
    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }


    public Store(String storeName, String storeLocation) {
        this.storeName = storeName;
        this.storeLocation = storeLocation;
    }

    Scanner sc = new Scanner(System.in);

    List <Fruit>  fruits = new ArrayList<Fruit> ();
    

    public void addApple() {

        System.out.println("\t  You Selected MultiSeed \n");

        System.out.println("\t  ----- Add Fruit Details ----- \n");

        //System.out.println("\t  ----- Number Of Apples ----- \n");

        //int appleNo = sc.nextInt();
        //sc.nextLine();

        //for(int i = 1; i<=appleNo; i++){

            Apple apple = new Apple();

            System.out.println("\t  ----- Add Fruit Name ----- \n");
            apple.setFruitName(sc.nextLine());
   
            

            System.out.println("\t  ----- Add Fruit Price ----- \n");
            apple.setPrice(sc.nextInt());
            sc.nextLine();

            System.out.println("\t  ----- Add Fruit Quantity ----- \n");
            apple.setQuantity(sc.nextInt());
            sc.nextLine();
            

            fruits.add(apple);
            
            System.out.println("\n");


        }
    //}

        public void addGrape() {

            System.out.println("\t  You Selected SeedLess \n");
           
        //System.out.println("\t  ----- Number Of Grapes ----- \n");

        //int grapesNo = sc.nextInt();
        //sc.nextLine();

        //for(int i = 1; i<=grapesNo; i++){

            Grapes grapes = new Grapes();
            System.out.println("\t  ----- Add Fruit Name ----- \n");
            grapes.setFruitName(sc.nextLine());

            System.out.println("\t  ----- Add Fruit Price ----- \n");
            grapes.setPrice(sc.nextInt());
            sc.nextLine();

            System.out.println("\t  ----- Add Fruit Quantity ----- \n");
            grapes.setQuantity(sc.nextInt());
            sc.nextLine();
            

            fruits.add(grapes);
            System.out.println("\n");


        }
    //}

        public void addMango() {

            System.out.println("\t  You Selected SingleSeed \n");

        //System.out.println("\t  ----- Number Of Mangos ----- \n");

        //int mangoNo = sc.nextInt();
        //sc.nextLine();

        //for(int i = 1; i<=mangoNo; i++){

            Mango mango = new Mango();

            System.out.println("\t  ----- Add Fruit Name ----- \n");
            mango.setFruitName(sc.nextLine());

            System.out.println("\t  ----- Add Fruit Price ----- \n");
            mango.setPrice(sc.nextInt());
            sc.nextLine();

            System.out.println("\t  ----- Add Fruit Quantity ----- \n");
            mango.setQuantity(sc.nextInt());
            sc.nextLine();
            

            fruits.add(mango);

            System.out.println("\n");

        
    }
//}

    public void addOrange() {

        System.out.println("\t  You Selected Juicy \n");

    //System.out.println("\t  ----- Number Of Orange ----- \n");

        //int orangeNo = sc.nextInt();
        //sc.nextLine();

        //for(int i = 1; i<=orangeNo; i++){

            Orange orange = new Orange();

            System.out.println("\t  ----- Add Fruit Name ----- \n");
            orange.setFruitName(sc.nextLine());

            System.out.println("\t  ----- Add Fruit Price ----- \n");
            orange.setPrice(sc.nextInt());
            sc.nextLine();

            System.out.println("\t  ----- Add Fruit Quantity ----- \n");
            orange.setQuantity(sc.nextInt());
            sc.nextLine();
            

            fruits.add(orange);

            System.out.println("\n");

        }
    //}


        public void viewMultiSeedFruits() {

            System.out.println(fruits);
            
        }
    

    @Override
    public String toString() {
        return "Store Name : " + storeName +"\n" +  "Store Location : " + storeLocation +"\n" ;
    }

    
    
}
