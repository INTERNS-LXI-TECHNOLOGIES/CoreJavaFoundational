public class Car extends Vehicle{
	private boolean istaxi;
	
	public void setIstaxi(boolean istaxi){
		this.istaxi=istaxi;
	}
	public boolean getIstaxi(){
		return istaxi;
	}
		public void carMethod(){
			int x= (int)(Math.random()*10);
			if(x% 2==0){
				this.istaxi=true;
				//System.out.println(" is a taxi");
			}
			else{
				this.istaxi=false;
				//System.out.println(" is not a taxi");
			}
		}
	
	public String toString(){
		return "\n VEHICLE NAME: "+getName()+"\n"+" REGISTRATION PLATE: "+getRegplate()+istaxi;
	}
}