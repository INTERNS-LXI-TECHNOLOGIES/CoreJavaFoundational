import java.util.Random;

public class Product{

private String name;
private int price;

public void setName(String name){
	this.name=name;
} 

public String getName(){
	return this.name;
}
public void setRate(int rate){
	this.price=rate;
} 

public int getRate(){
	return this.price;
}


public String toString(){
	return getName()+"\n"+getRate()+"\n";
}



}