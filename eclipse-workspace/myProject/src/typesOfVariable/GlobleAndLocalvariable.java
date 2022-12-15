package typesOfVariable;

public class GlobleAndLocalvariable {
	
	int a=10;
	static int b=80;

	public static void main(String[] args) {
		// call static method
		//just methodname();
		
		addition();//calling static method
		//call non-static method---->need to create object of class
		//classname obj= new classname
		GlobleAndLocalvariable gl=new GlobleAndLocalvariable();// crate a object of class
		
		//non static method call------>objectname.methdname
		gl.substraction();//calling non static method method
		
		//======================calling global variable from another class====================
		//call non-static global variable
		System.out.println("usage of non staic globle variable is"+gl.a);//calling non static globle
		//variable from same class
		
		System.out.println("usage of static globle variable"+b);//calling static globle variable from same class
		
		int mul=10*gl.a;//usage of non static global variable same class
		System.out.println(" multiplication is"+mul);
		
		
		int div=100/b;//usage of static global variable same class
		System.out.println("division is"+div);
		///=============================calling global variable from another class=======================
		//calling non static global variale from another class--->need to create a object
		
		Test t=new Test();//crate a object of another class
		System.out.println("callling non static globlevarriablefrom anothr class"+t.x);//calling nonstatic global variable from another class
		
		
		int mul1=12*t.x;//s of non static global variable is another class
		System.out.println("multipliaction1 is"+mul);
		//calling static global variable from another class---->need to using call using classname
		
		System.out.println("calling static globle varriable another class"+t.y);//calling static globle variable from another class
		int div1=200/Test.y;//usage static global veriable from another class
		System.out.println("division 1 is"+div1);
	}
	
	public static void addition()//Static method
    {
    	int a=70;//local variable
    	int b=30;
    	int sum=a+b;
    	System.out.println("addition is"+sum);
    	
    	GlobleAndLocalvariable gl=new GlobleAndLocalvariable();
    	System.out.println(" calling globle variable in the method "+gl.a);
    	
    	
    	}
    public void substraction ()
    {
    	int c=80;
    	int d=90;
    	int sub=c-d;
    	System.out.println("subtraction is"+sub);
    	System.out.println(" calling globle variable in the method"+this.a);//practice
    }
    }
