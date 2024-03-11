public class Motorcycle extends Vehicle{
private boolean gearless;

public boolean getGearless() {
        return gearless;
    }

    public void setGearless(boolean gearless) {
        this.gearless = gearless;
    }
	public String toString(){
	return ""+super.getName()+"\t"+super.getColor()+"\t"+gearless+"\n";
}
	
}