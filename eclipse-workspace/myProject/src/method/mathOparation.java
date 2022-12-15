package method;

public class mathOparation {

	public static void main(String[]arg) {

		// TODO Auto-generated method stub

		// calling method same class
		addition();
		
		
		
		
		//call non static method for same class
		//need to createobject from same class//
		mathOparation mo= new mathOparation();//create a object of another class
		
		
		//call static method from another class
		//ClassName.methodName();
		MyClass.subtraction();
		MyClass.multiplication();
		MyClass.division();
		
		
		//call non staticmethod from another class
		//need create to objectfrom another clas
		MyClass mc= new MyClass();
		mc.division();
		mc.addiction();
		mc.multiplication();
		
		
		
	
		
		MyClass mc1=new MyClass();//create object other class
		//call non static
							
}
	
			
			private static void addition() {
		// TODO Auto-generated method stub
			

		
	}




	public void addiction()
	{
		
		int a=10;
		int b=30;
		int sum=a+b;
		System.out.println("addition is"+sum);
		
	}
	//non static regullar complate method
	public static void subtraction()
	{ 
		int a=30;
		int b=20;
		int sub=a-b;
		System.out.println("substraction is"+sub);
			
	}		
public void division() //method declarartion
	
	{
		// TODO Auto-generated method stub
		//body
		int a=50;
		int b=5;
		int div =50/5;
		System.out.println("division is"+div);
	}
	public  static void multiplication()// method declaration
	
	{ 
		int a=90;
		int b=10;
		int mul=a*b;
		System.out.println("multiplication is"+mul);
	}	
	}


