public class Car extends Vehicle{
private boolean istaxi;

    public boolean getIstaxi() {
        return istaxi;
    }

    public void setIstaxi(boolean istaxi) {
        this.istaxi = istaxi;
    }

public String toString(){
	return ""+super.getName()+"\t"+super.getColor()+"\t"+istaxi+"\n";
}

}
