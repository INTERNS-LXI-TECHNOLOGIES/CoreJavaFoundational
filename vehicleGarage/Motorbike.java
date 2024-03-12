public class Motorbike extends Vehicle{
	private boolean isgeared;
	
	public void setIsgeared(boolean isgeared){
		this.isgeared=isgeared;
	}
	public boolean getIsgeared(){
		return isgeared;
	}
	
		public void bikeMethod(){
			int x= (int)(Math.random()*10);
			if(x% 2==0){
				this.isgeared=true;
				//System.out.println(" is geared");
			}
			else{
				this.isgeared=false;
				//System.out.println(" is not geared");
			}
		}
	public String toString(){
		return "\n VEHICLE NAME: "+getName()+"\n"+" REGISTRATION PLATE: "+getRegplate()+isgeared;
	}	

}