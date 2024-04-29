public  class School{
	 private String name;
	 private String location;
	 Teacher teacher;
	 Student student;
	  public String toString(){
		  return "school name:"+name+ "\n" +"school location:"+location;
	  }
	 
	 public String getName(){
		 return name;
	 }
	 public void setName(String name){
	 this.name=name;
	 }
	 public String getLocation(){
		 return location;
	 }
	 public void setLocation(String location){
	 this.location=location;
	 }
		 
}
