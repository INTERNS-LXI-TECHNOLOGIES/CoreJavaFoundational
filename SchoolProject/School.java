class School{
String name;
String place;
Classroom[] classrooms;
public School(String name,String place, Classroom[] classrooms)
{
this.name = name;
this.place =place;
this.classrooms = classrooms;
}
public String toString(){
String text1= "name: "+name+"\nplace  :   "+place+ "\n";
for(Classroom c:classrooms){
text1=text1+c+"\n";
}
return text1;
}
}

