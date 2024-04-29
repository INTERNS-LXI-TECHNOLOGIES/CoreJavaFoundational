public class Tdd
{
	public static void main(String []ar)
	{
		Movie movie=new Movie();
		
		movie.setName("Kilukkam");
		
		movie.setYear(1991);
		
		System.out.println("\n\t"+"       MOVIE DETAILS");
		
		System.out.println("\n\t"+"MOVIE NAME    : "+movie.getName());
		
		System.out.println("\n\t"+"RELEASE YEAR  : "+movie.getYear());
		
		movie.getActors()[0]=new Hero();
		
		movie.getActors()[0].setName("Mohanlal");
		
		movie.getActors()[0].setAge(40);
		
		movie.getActors()[0].setGender("Male");
		
		
		movie.getActors()[0].getDailoge()[0]=new Dailoge();
		
		movie.getActors()[0].getDailoge()[0].setDailoge("ഒരു  തരത്തിലും  എന്നെ  ജീവിക്കാൻ  സമ്മതിക്കില്ലെന്ന്  ഉറപ്പിച്ചു  തീരുമാനിച്ചു   ഇറങ്ങിയിരിക്കാനല്ലേ?");
		
		movie.getActors()[0].getDailoge()[1]=new Dailoge();
		
		movie.getActors()[0].getDailoge()[1].setDailoge("വട്ടാണല്ലേ");
		
		movie.getActors()[0].getDailoge()[2]=new Dailoge();
		
		movie.getActors()[0].getDailoge()[2].setDailoge("അങ്കമാലിയിലെ അമ്മാവൻ ആരാന്നാ പറഞ്ഞെ ");
		
		movie.getActors()[0].getDailoge()[3]=new Dailoge();
		
		movie.getActors()[0].getDailoge()[3].setDailoge("എടാ ..നീ രാജയോഗം രാജയോഗം എന്ന് കേട്ടിട്ടുണ്ടോ ?");
		
		System.out.println("\n\n\t\t"+"HERO DETAILS ");
		
		System.out.println(" \nHERO NAME :"+movie.getActors()[0].getName());
		
		System.out.println(" \nAge :"+movie.getActors()[0].getAge());
		
		System.out.println(" \nGENDER : "+movie.getActors()[0].getGender());
		
		movie.getActors()[0].pickDailoge();
		
		
		
		movie.getActors()[1]=new Heroine();
		
		movie.getActors()[1].setName("Revathi");
		
		movie.getActors()[1].setAge(38);
		
		movie.getActors()[1].setGender("Female");
		
		
		movie.getActors()[1].getDailoge()[0]=new Dailoge();
		
		movie.getActors()[1].getDailoge()[0].setDailoge("ജ്യോതിയും വന്നില്ല തീയും വന്നില്ല ");
		
		movie.getActors()[1].getDailoge()[1]=new Dailoge();
		
		movie.getActors()[1].getDailoge()[1].setDailoge("പ്രധാനമന്ത്രി ");
		
		movie.getActors()[1].getDailoge()[2]=new Dailoge();
		
		movie.getActors()[1].getDailoge()[2].setDailoge("വെച്ച കൊഴിടെ മണം");
		
		movie.getActors()[1].getDailoge()[3]=new Dailoge();
		
		movie.getActors()[1].getDailoge()[3].setDailoge("കൊരങ്ങാ എനിക്കു വിശക്കുന്നു ");
		
		
		System.out.println("\n\n\t\t"+"HEROINE DETAILS ");
		
		System.out.println(" \nHEROINE NAME : "+movie.getActors()[1].getName());
		
		System.out.println(" \nAGE :"+movie.getActors()[1].getAge());
		
		System.out.println(" \nGENDER : "+movie.getActors()[1].getGender());
		
		movie.getActors()[1].pickDailoge();
		
		
		
		movie.getActors()[2]=new Villain();
		
		movie.getActors()[2].setName("Sharat saxena");
		
		movie.getActors()[2].setAge(43);
		
		movie.getActors()[2].setGender("Male");
		
		
		
		movie.getActors()[2].getDailoge()[0]=new Dailoge();
		
		movie.getActors()[2].getDailoge()[0].setDailoge("ഒരു  തരത്തിലും  എന്നെ  ജീവിക്കാൻ  സമ്മതിക്കില്ലെന്ന്  ഉറപ്പിച്ചു  തീരുമാനിച്ചു   ഇറങ്ങിയിരിക്കാനല്ലേ?");
		
		movie.getActors()[2].getDailoge()[1]=new Dailoge();
		
		movie.getActors()[2].getDailoge()[1].setDailoge("വട്ടാണല്ലേ");
		
		movie.getActors()[2].getDailoge()[2]=new Dailoge();
		
		movie.getActors()[2].getDailoge()[2].setDailoge("അങ്കമാലിയിലെ അമ്മാവൻ ആരാന്നാ പറഞ്ഞെ ");
		
		movie.getActors()[2].getDailoge()[3]=new Dailoge();
		
		movie.getActors()[2].getDailoge()[3].setDailoge("എടാ ..നീ രാജയോഗം രാജയോഗം എന്ന് കേട്ടിട്ടുണ്ടോ ?");
		
		System.out.println("\n\n\t\t"+"VILLAIN DETAILS ");
		
		System.out.println(" \nVILLAIN NAME : "+movie.getActors()[2].getName());
		
		System.out.println(" \nAGE :"+movie.getActors()[2].getAge());
		
		System.out.println(" \nGENDER : "+movie.getActors()[2].getGender());
		
		movie.getActors()[2].pickDailoge();
		
		
		
		movie.getActors()[3]=new Comedian();
		
		movie.getActors()[3].setName("Jagathi Sreekumar");
		
		movie.getActors()[3].setAge(41);
		
		movie.getActors()[3].setGender("Male");
		
		
		movie.getActors()[3].getDailoge()[0]=new Dailoge();
		
		movie.getActors()[3].getDailoge()[0].setDailoge("പോയി കിടന്നു ഉറങ്ങു പെണ്ണെ !");
		
		movie.getActors()[3].getDailoge()[1]=new Dailoge();
		
		movie.getActors()[3].getDailoge()[1].setDailoge("കിളവനു നല്ല ഉന്നമില്ലാത്തതുകൊണ്ട് ചത്തില്ല ");
		
		movie.getActors()[3].getDailoge()[2]=new Dailoge();
		
		movie.getActors()[3].getDailoge()[2].setDailoge("ഒരു വെടിയും മിന്നലും മാത്രമേ എനിക്കു ഓര്മയുള്ളു ");
		
		movie.getActors()[3].getDailoge()[3]=new Dailoge();
		
		movie.getActors()[3].getDailoge()[3].setDailoge("5 ബുള്ളറ്റാ ഓപ്പറേറ്റ് ചെയ്ത് എടുത്തത്");
		
		System.out.println("\n\n\t\t"+"COMEDIAN DETAILS ");
		
		System.out.println(" \nCOMEDIAN NAME : "+movie.getActors()[3].getName());
		
		System.out.println(" \nAGE :"+movie.getActors()[3].getAge());
		
		System.out.println(" \nGENDER : "+movie.getActors()[3].getGender());
		
		movie.getActors()[3].pickDailoge();

		
		
		
		
				
	}
	
}
		
		
		
		
		
		
		
	