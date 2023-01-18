package com.lxisoft.car;
public class Rim {
    
    String type;
    int size;


    public Rim(int size, String type){
        this.size = size;
        this.type = type;
    }

    public Rim(){
        
    }

    public String gettype(){
        return type;
    }
    public String settype(String type){
       return this.type =type;
    }
    
    public int getsize(){
        return size;
    }
     
    public int setsize(int size){
        return this.size = size;
    }
    void printdetails(){

        System.out.println("type: " + gettype() + " size: " + getsize());
    }
}
