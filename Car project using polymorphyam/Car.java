public class Car{

String brandname;




Part[]part = new Part[9];
public String toString(){
	
	String kl="";
	kl=kl+brandname+"";
	for(int i=0;i<part.length;i++){
		
		kl=kl +part[i];
	}
	
	
	return kl;
}





}