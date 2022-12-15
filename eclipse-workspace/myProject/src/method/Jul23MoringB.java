package method;

public class Jul23MoringB {

	public static void main(String[] args ) 
	{	// TODO Auto-generated method stub
		
		Jul23MoringB jb= new Jul23MoringB();//create object class
		jb.studentInfo();
		jb.studentInfo();
		
		jb.studentInfo("Mahesh",26.3f,'m', 7);
		

	}	
 

     //name,age,gender,rollnumber
	public void studentInfo()
	{
	String name= "mahesh";
	float age=26.3f;
	char gender='m';
	int rollnumber=7; 
	
	System.out.println("name is"+name);
	System.out.println("age is"+age);
	System.out.println("gender is"+gender);
	System.out.println("roll number is"+rollnumber);
	
	
	}
	//method with parameter
	//name age gender rollnumber
	 public void studentInfo(String name,float age ,char gender,int rollnumber)
	 { 
	 System.out.println("student name is"+ name);
	 System.out.println("student age is"+age);
	 System.out.println("studentgender is"+gender);
	 System.out.println("student rollnumber is"+rollnumber);
	
	
	 }
}
