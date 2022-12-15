package constructor;

public class CC3 {
	
	int num1;
	int num2;
	int num3;
	
	public CC3()
	{  
		num1=10;
		num2=20;
		num3=30;
	}
	   
	public CC3(int a)
	
	{ 
		num1=a;
		
	}
	public CC3(int a,int b)
	{
		num1=a;
		num2=b;
	}
	public CC3(int a,int b,int c)
	
	{
		num1=a;
		num2=b;
		num3=c;
	}
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{ 
		CC3 c1=new CC3();
		c1.addition();
		
		CC3 c2=new CC3(100);
		c2.addition();
		
		CC3 c3=new CC3(80,90);
		c3.addition();
		
		CC3 c4=new CC3(20,30,40);
		c4.addition();
	}
     
	public void addition() 
	{
		int sum=num1+num2+num3;
		System.out.println("additin is"+sum);
				
	}

	
	}

