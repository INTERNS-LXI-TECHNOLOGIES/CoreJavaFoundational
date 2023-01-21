package car;

import java.util.ArrayList;
import tDetails.TireDetails;
import audio.AudioSystem;

public class Car {
    private String company;
    private String model;
    private String color;
    private String manufacturer;
    private AudioSystem audioSystem;
    private ArrayList<TireDetails> tyreDetails;

    public Car(String company, String model, String color, String manufacturer) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public AudioSystem getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(AudioSystem audioSystem) {
        this.audioSystem = audioSystem;
    }

    public ArrayList<TireDetails> getTyreDetails() {
        return tyreDetails;
    }

    public void setTyreDetails(ArrayList<TireDetails> tyreDetails) {
        this.tyreDetails = tyreDetails;
    }

    public void startCar() {
        System.out.println("Car has started.\n\n");
    }

    public void playMusic() {
        if(audioSystem != null){
            audioSystem.playMusic();
        }else{
            System.out.println("Audio System not set");
        }
    }

    public void printTyreDetails() {
        System.out.println("Tyre Details:");
        for (TireDetails tyre : tyreDetails) {
            System.out.println(tyre.toString());
        }
    }

    public String toString() {
        return "details of Car \n company=" + company + ", model=" + model + ", color=" + color + ", manufacturer=" + manufacturer
                + "\n\n";
    }
}


