public class Tdd{

public static void main(String[]args){

System.out.println("HOSPITAL DETAILS"); 

Hospital h = new Hospital();
h.name = "Hospital name :- JUBILY MISSION MEDICAL COLLEGE";
h.address = "Address :-"+"Private Hospital, THRISSUR, KERALA";
h.phonenumber = "phonenumber :-" + "8075710318";

System.out.println("\n"+h.name);
System.out.println(h.address);
System.out.println(h.phonenumber);

System.out.println("\n"+"ICU IN HOSPITAL");
System.out.println("\n"+"ICU 1");

h.icu1 = new Icu();
h.icu1.doctor = "Doctor1";
h.icu1.patient = "Patient1";
h.icu1.nurse = "Nurse1";

System.out.println("\n"+h.icu1.doctor);
System.out.println(h.icu1.patient);
System.out.println(h.icu1.nurse);

System.out.println("\n"+"ICU 2");

h.icu2 = new Icu();
h.icu2.doctor = "Doctor2";
h.icu2.patient = "Patient2";
h.icu2.nurse = "Nurce2";

System.out.println("\n"+h.icu2.doctor);
System.out.println(h.icu2.patient);
System.out.println(h.icu2.nurse);

System.out.println("\n"+"ELITE SWEETS");

h.canteen = new Canteen();
h.canteen.cashier = "CASHIER NAME :-"+"ARJUN";
h.canteen.supplier = "SUPPLIER NAME :-"+"VISHNU";
h.canteen.customer = "CUSTOMER NAME :-"+"SREEJA";

System.out.println("\n"+h.canteen.cashier);
System.out.println(h.canteen.supplier);
System.out.println(h.canteen.customer);

System.out.println("\n"+"ELITE MENUS");

System.out.println("\n"+"MENU 1");


h.canteen.menu1 = new Menu();
h.canteen.menu1.food1 = new Food();
h.canteen.menu1.food1.name = "food1:-VEG BIRIYANI";

h.canteen.menu1.food2 = new Food();
h.canteen.menu1.food2.name = "food2:-CHICKEN BIRIYANI";

h.canteen.menu1.food3  = new Food();
h.canteen.menu1.food3.name = "food3:-"+"BEEF BIRIYANI";

h.canteen.menu1.food4  = new Food();
h.canteen.menu1.food4.name = "food4:-"+"KUZHI MANDHI";

System.out.println("\n"+h.canteen.menu1.food1.name);
System.out.println(h.canteen.menu1.food2.name);
System.out.println(h.canteen.menu1.food3.name);
System.out.println(h.canteen.menu1.food4.name);

System.out.println("\n"+"MENU 2");


h.canteen.menu2 = new Menu();

h.canteen.menu2.food5  = new Food();
h.canteen.menu2.food5.name = "ITEM ONE :- POROTA";

h.canteen.menu2.food6  = new Food();
h.canteen.menu2.food6.name = "ITEM TWO :- KIZHI POROTA";

h.canteen.menu2.food7 = new Food();
h.canteen.menu2.food7.name = "ITME THREE :- NOOL POROTA";

h.canteen.menu2.food8  = new Food();
h.canteen.menu2.food8.name = "ITEM FOUR:- PAAL POROTA";

System.out.println("\n"+h.canteen.menu2.food5.name);
System.out.println(h.canteen.menu2.food6.name);
System.out.println(h.canteen.menu2.food7.name);
System.out.println(h.canteen.menu2.food8.name);

}
}