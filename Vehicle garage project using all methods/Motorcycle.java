public class Motorcycle extends Vehicle{
private boolean gearless;

public boolean getGearless() {
        return gearless;
    }

    public void setGearless(boolean gearless) {
        this.gearless = gearless;
    }
	
	public void motorcyclec(){
	int x = (int) (Math.random() * 5);
	
	if (x%2==0){
		gearless=true;
	}
	else if(x%2!=0){
		gearless=false;
	}
	}
	
	public String toString(){
	return ""+super.getName()+"\t"+super.getColor()+"\t"+(gearless? "This is a gearless":"This is not gearless")+"\n";
}
	
}