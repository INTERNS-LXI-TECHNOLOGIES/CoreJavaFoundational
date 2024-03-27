

import java.util.Arrays;

public class Tdd{

public static void main(String[]args){
	
Contactbook[] contactbook = new Contactbook[5];

String[] names = {"Ajay","Akhil","Farseena","Sai","Vignesh"};
long[] mobNumber = {9447533989L,9995119911L,9446669993L,7025054311L,8289869894L};
String[] id = {"ajay542@yahoo.com","raj.akhil143@gmail.com","farseena654@gmail.com","sai.thalafan7@gmail.com","ambatvignesh007@gmail.com"};

for(int i=0,q=0; i<contactbook.length;i++){
	contactbook[i] = new Contactbook();
	contactbook[i].setName(names[q]);
	contactbook[i].setNumber(mobNumber[q]);
	contactbook[i].setMailId(id[q]);
}

System.out.println(Arrays.toString(contactbook));















}


}