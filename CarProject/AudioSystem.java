package audio;

public class AudioSystem {
    private String brand;
    private int noOfSpeakers;

    public AudioSystem(String brand, int noOfSpeakers) {
        this.brand = brand;
        this.noOfSpeakers = noOfSpeakers;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoOfSpeakers() {
        return noOfSpeakers;
    }

    public void setNoOfSpeakers(int noOfSpeakers) {
        this.noOfSpeakers = noOfSpeakers;
    }

    public void playMusic() {
        System.out.println("Music is playing through " + this.noOfSpeakers + " speakers of brand " + this.brand +"\n\n");
    }
    
    public String toString() {
        return "AudioSystem [brand=" + brand + ", noOfSpeakers=" + noOfSpeakers + "]";
    }
}

