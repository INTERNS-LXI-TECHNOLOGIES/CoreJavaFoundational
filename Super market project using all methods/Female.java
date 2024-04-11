public class Female extends Staff{
boolean Ispresent;

public void setIspresent(boolean Ispresent){
	this.Ispresent=Ispresent;
}
public boolean getIspresent(){
	return Ispresent;
}
public void females(){
	int x = (int)(Math.random()*5);
	
	if (x%2==0){
		Ispresent=true;
	}
	else if(x%2!=0){
		Ispresent=false;
	}
}
public String toString(){
	return ""+super.getName()+"\t"+super.getRole()+"\t"+(Ispresent ? "This Lady is Present":"This Lady is Absent")+"\n";
}

}