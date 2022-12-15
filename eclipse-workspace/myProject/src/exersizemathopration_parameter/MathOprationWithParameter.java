package exersizemathopration_parameter;

public class MathOprationWithParameter{
	
	{
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addition(50,50);//calling static method from same class
		addition(40,50);//calling static method from same class
		addition(70,50);//calling static method from same class
		
		
		MathOprationWithParameter mwp=new MathOprationWithParameter();//object of same classs
		
		mwp.addition1(70,30); 
		mwp.subtraction(70,30);		
		mwp.subtraction(750,30);	
		mwp.subtraction(760,30);	
		
		MyClass mc=new MyClass();
		
		 mc.multiplication(70,2);//calling static method from same class
		mc.multiplication(60,2);//calling static method from same class
		
		mc.division(50,10);
		mc.division(70,10);
	
	}

	public static   void addition(int a, int b) //static method
	{// TODO Auto-generated method stub
		int sum= a+b;
		System.out.println("sum is"+sum);
	}
	public  void subtraction(int a, int b) 
	{    // TODO Auto-generated method stub
		int sub=a-b;
		System.out.println("sub is"+sub);
		
	}
	public void addition1(int a1,int b1)
	{
		int sum= a1+b1;
		System.out.println("sum is"+sum);
	}

	
		
	}
	

