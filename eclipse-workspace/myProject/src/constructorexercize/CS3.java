package constructorexercize;

public class CS3 {
	int num1, num2; //declaration globle variabel
	
	 
	public  CS3()// constructor with zero parameter
	
	{ 
		num1=20;//assign globle variable
		num2=30;
	}
	public  CS3(int a)//constructor wtih single parameter
	{
		num1 = a;
	}
	public  CS3(int a,int b)//constructor wtih two parameter
	{
		num1= a;
		num2=b;
	}
	
	public static void main(String[] args) 
	{
		CS3 c1=new CS3();//using concstrutor with zero parameter a=20,b=30
		c1.addition();
		c1.subtraction();
		c1.multiplication();
		System.out.println("--------------------");
		
		CS3 c2=new CS3(10);
		c2.addition();//using concstrutor with single parameter a=10,b=0
		c2.subtraction();
		 c2.multiplication();
		System.out.println("--------------------");
		
		CS3 c3=new CS3(15,5);
		c3.addition();//using concstrutor with 2 parameter a=15,b=5
		c3.subtraction();
		c3.multiplication();
		System.out.println("--------------------");
		
		CS3 c4=new CS3();
		c4.addition();
		
		CS3 c5=new CS3(50,30);
		c5.subtraction();
		
		CS3 c6=new CS3(20,100);
		c6.multiplication();
		
		
	}
	    public void addition()
	   
	    { 
	    	int add = num1+num2;
	     
	    	System.out.println("addiition is"+num1+"and"+num2+"is" + add); 
	   
	    }

	    public void subtraction( )
	    {
	    	int sub =num1-num2;
	    	System.out.println("subtraction is"+num1+"and"+num2+"is" +sub);
	    	
	    }
	    public void multiplication()
	    {
	    	int mul=num1*num2;
	    	System.out.println("multiplication is"+num1+"and"+num2+"is" +mul);
	    }
	  
}
