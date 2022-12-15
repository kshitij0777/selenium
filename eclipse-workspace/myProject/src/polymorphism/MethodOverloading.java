package polymorphism;

public class MethodOverloading {
	
	public static void main(String[] args)
	{
		MethodOverloading m=new MethodOverloading();
		m.add();
		m.add(22, 33);
		m.add1(20,30);
		 int a1=20;
		 int b1=30;
	}
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("addition is"+sum);
		
		
	}
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("addition is"+sum);
	}
	
	public void add1( int a1,int b1)
	{
		int sum1=a1+b1;
		System.out.println("addition is "+sum1);
	}
	
	


	
		

	}


