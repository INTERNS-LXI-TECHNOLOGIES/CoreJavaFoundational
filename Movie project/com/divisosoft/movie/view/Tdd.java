package com.divisosoft.movie.view;
import com.divisosoft.movie.movie.*;
import com.divisosoft.movie.actors.*;
public class Tdd{

public static void main(String[]args){

 Movie mov = new Movie();

 mov.moviename ="Narasimham";
 
//System.out.println("Movie name :\t"+mov.moviename);




 mov.hro = new Hero();
 

 
 mov.hro.charactorName ="Induchoodan";
   
 mov.hro.Age =32;
 
 //System.out.println("\n"+mov.hro);
 

 
 mov.hro.Dia[0]= new Dialogue()	;
 
 mov.hro.Dia[0].dialogue="Athimoham aanu mone Athimoham";
 
 //System.out.println("Hero  Dialogue1 :\n"+mov.hro.Dia[0].dialogue);
 
 
 mov.hro.Dia[1]=new Dialogue();
 
 mov.hro.Dia[1].dialogue="Nee poo mone dineshaa...";
 // System.out.println("Hero Dialogue2 :\n"+mov.hro.Dia[1].dialogue);


mov.hro.Dia[2]= new Dialogue();

mov.hro.Dia[2].dialogue="Madhava vakasthe";
//System.out.println("Hero Dialogue3 :\t"+mov.hro.Dia[2].dialogue);


mov.hro.Dia[3]=new Dialogue();

mov.hro.Dia[3].dialogue="Pavithramaya ee nadhiyil veezharuthu";

//System.out.println("Hero Dialogue4 :\t"+mov.hro.Dia[3].dialogue);

mov.hro.Dia[4]= new Dialogue();

mov.hro.Dia[4].dialogue= "Enthaa mole anuradhe...";
//System.out.println("Hero Dialogue5 :\t"+mov.hro.Dia[4].dialogue);


mov.he= new Heroin();

mov.he.Charactorname= "Anuradha";

mov.he.Age =28;

System.out.println(mov.he);



mov.he.dia[0]=new Dialogue();

mov.he.dia[0].dialogue= "Poda patti";

//System.out.println("Heroin Dialogue"+mov.he.dia[0].dialogue);



mov.he.dia[1] = new Dialogue();

mov.he.dia[1].dialogue= "Da mone induchooda";

//System.out.println("Heroin Dialogue:\t"+mov.he.dia[1].dialogue);


mov.he.dia[2]= new Dialogue();

mov.he.dia[2].dialogue ="wait cheythal?";

//System.out.println("Heroin dialogue: \t"+mov.he.dia[2].dialogue);



mov.he.dia[3]= new Dialogue();

mov.he.dia[3].dialogue ="dfshhfs";

//System.out.println("Heroin Dialogue:\t"+mov.he.dia[3].dialogue);



mov.he.dia[4]= new Dialogue();

mov.he.dia[4].dialogue ="jjjjoiio";

//System.out.println("Heroin Dialogue:\t"+mov.he.dia[3].dialogue);




mov.vil = new Villan();

mov.vil.Charactorname = "Madhavan";

mov.vil.age =40;

//System.out.println(mov.vil.Charactorname);
//System.out.println(mov.vil.age);




mov.vil.di[0]= new Dialogue();

mov.vil.di[0].dialogue= "Ninakum undallo janmam thannoral ?";

//System.out.println("Villan dialogue:\t"+mov.vil.di[0].dialogue);



mov.vil.di[1]= new Dialogue();

mov.vil.di[1].dialogue= "Orunal maranam Ayalkkum sambavikkum";

//System.out.println(mov.vil.di[1].dialogue);




mov.vil.di[2]= new Dialogue();

mov.vil.di[2].dialogue= "Ithukond onnum theernnu ennu nee Vicharikanda";

//System.out.println("Villan dialogue:\t"+ mov.vil.di[2].dialogue);


mov.vil.di[3]= new Dialogue();

mov.vil.di[3].dialogue= "Manasilayoda?";

//System.out.println("Villan dialogue:\t"+ mov.vil.di[3].dialogue);


mov.vil.di[4]= new Dialogue();

mov.vil.di[4].dialogue= "onnum ividamkondu theerunnilla";

//System.out.println("Villan dialogue:\t"+ mov.vil.di[4].dialogue);




mov.com = new Comedian();

mov.com.Charactorname = "Chandrabanu";

mov.com.age =52;

//System.out.println(mov.com);

//System.out.println("comedian name: \t"+mov.com.Charactorname);

//System.out.println("comedian age is: \t"+mov.com.age);



mov.com.comedian[0]= new Dialogue();

mov.com.comedian[0].dialogue = "അടുത്ത ദിവസ്സം തന്റെ വേലക്കാരനുമൊത്ത് അദ്ദേഹം ഇന്ദുലേഖയെ ചെന്ന് കാണുകയും മകളെ സാന്ത്വനിപ്പിക്കുകയും ചെയ്യുന്നു.";

//System.out.println("comedian dialogue 1:\t"+mov.com.comedian[0].dialogue);


mov.com.comedian[1]= new Dialogue();

mov.com.comedian[1].dialogue = "മാധവൻ നമ്പ്യാർ മരണപ്പെടുന്നു. നമ്പ്യാരുടെ ചിതാഭസ്മം ഭാരതപ്പുഴയിൽ നിബഞ്ചനം ചെയ്യുന്നതിൽ നിന്ന് അദ്ദേഹത്തിൻറെ മക്കളെ ഇന്ദുചൂഢൻ സുഹൃത്തുക്കളുമൊത്ത്  തടയുന്നു. ";

//System.out.println("comedian dialogue 2:\t"+mov.com.comedian[1].dialogue);


mov.com.comedian[2]= new Dialogue();

mov.com.comedian[2].dialogue = "ഞാന്‍ ഇപ്പോഴും ഓര്‍ക്കും .. ഓരോ മുഖം കാണുമ്പോഴും ഓര്‍ക്കും.";

//System.out.println("comedian dialogue3:\t"+mov.com.comedian[2].dialogue);

mov.com.comedian[3]= new Dialogue();

mov.com.comedian[3].dialogue = "പക്ഷേ, എനിക്ക് വീട്ടിലിരുന്നിട്ട് ഇരിക്കാനും നിക്കാനും പറ്റണില്ല. ഇരിക്കുമ്പോ ശര്‍ദ്ദിക്കാന്‍ തോന്നുന്നു. നിക്കുമ്പോ കൈയ്യും കാലും വെറക്കും.";

//System.out.println("comedian dialogue4:\t"+mov.com.comedian[3].dialogue);



mov.com.comedian[4]= new Dialogue();

mov.com.comedian[4].dialogue= "ഒന്നു വിളിക്കാരുന്നില്ലേ, എന്നെക്കൂടെ. ആരും ഇല്ലെന്ന് വീണ്ടും വീണ്ടും പറഞ്ഞതല്ലേ. വാല്യക്കാരിയായിട്ടെങ്കിലും നിക്കാരുന്നല്ലോ... അല്ലെങ്കിലും എന്നെയെന്തിനാ വിളിക്കുന്നത്.";

//System.out.println("Comedian dialogue 5:\t"+mov.com.comedian[4].dialogue);


System.out.println(mov);

}


}