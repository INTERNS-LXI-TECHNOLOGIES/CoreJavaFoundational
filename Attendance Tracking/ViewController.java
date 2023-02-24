import java.util.Scanner;

public class ViewController
{
	
	 private boolean flag=true;
	 
	 
	 int i =0;
	 Scanner s = new Scanner(System.in);
	
	  public boolean getFlag()
       {
       return this.flag;
       }
       public void setFlag(boolean flag)
       {
	    this.flag = flag;
       }
	   
	
		
        School school = new School();
		
		boolean programContinue = true;
		
		public void viewThing(){
			
				 while (programContinue)
		{

			System.out.println("\n-----WELCOME TO YOUR ATTENDANCE TRACKING SYSTEM---2023--\n");
			System.out.println("\n........MODEL CENTRAL SCHOOL PALAKKAD..........\n");
			
			
			    System.out.println("Enter 1 :Student Details");
		        System.out.println("Enter 2 :Attendance Report");
		        System.out.println("Enter 3 :Print Attendance Register");
		        System.out.println("Enter 4 :Quit");

		         String attendance  = s.nextLine();
				 
				
			    switch (attendance)
			     {
				case ("1"):
					studentDetails();
					break;
					
				case ("2"):
					attendanceReport();
					break;
					

				case ("3"):
					printAttendence();
					
					break;
					
			     case ("4"):
                    System.out.print("Quit");			
					programContinue = false;
                      break;
				default:
					System.out.println("Invalid Expression");		
			}
		}
			
		}	
            public void studentDetails()
			  {
	              
	
	      
	              while(i<20)
				  {

                    System.out.println("Enter student name");
                    school.getClassRoom().getStudents()[i].setName(s.nextLine());
   
                    System.out.println("Enter student class and division");
                    school.getClassRoom().setDivision(s.nextLine());
   
                    System.out.println("Enter student ID card number");
                    school.getClassRoom().getStudents()[i].setIdStudent(Integer.parseInt(s.nextLine()));
   
                    System.out.println("Enter yes to continue no to quit");
                    String response = s.nextLine();
				    i++;
                    if(response.equals("no"))
		              {
                          break;
                      }
					  
	             }
	          }
   
              void attendanceReport(){
				   int id;
	               int monthNum;
	               int dayNum;
	          flag=true;
	          String report;
	        
	          while(flag){
	  
			   System.out.println("Enter student id");
               id = Integer.parseInt(s.nextLine());
			   
			   System.out.println("Enter month as the numeral");
               monthNum= Integer.parseInt(s.nextLine());
			   
			   System.out.println("Enter day as the numeral");
               dayNum=Integer.parseInt(s.nextLine());
			   
	           System.out.println("Enter yes to continue no to quit");
	           report = s.nextLine();
			   
	           if(report.equals("no")){
		       flag=false;
	        }
		  
		  
		   school.getClassRoom().getStudents()[id].getMonth()[monthNum].getDay()[dayNum].setcheckAttendance(true); 
		   }
		   }
		
		       void printAttendence(){
				   int id = 0;
	               int monthNum = 0;
	               
			   System.out.println("Enter student id");
               id = (s.nextInt());
			   System.out.println("Enter month as the numeral");
               monthNum= (s.nextInt());
			   System.out.println("Enter yes to continue no to quit");
               String react = s.nextLine();
			   
			  
			   System.out.println("Student Name:" + school);

			   System.out.println(" You Are Present");
			
			
			}
			
		}




