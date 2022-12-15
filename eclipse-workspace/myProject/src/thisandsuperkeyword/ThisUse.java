package thisandsuperkeyword;

public class ThisUse
{

	int a=90;//global variable
	
	int b=40;
	public static void main(String[] args) 
	{
		ThisUse t=new ThisUse();
		t.test();

	}
	public void test()
	{
		int a=10;//local variable
		System.out.println("local variable of a is"+a);
		System.out.println("local variable of a is"+this.a);
		
		int sum = a+100;
		System.out.println("sum using loval value of a is"+sum);
		int sum1 = a+100;
		System.out.println("sum using loval value of a is"+sum1);
		System.out.println("sum using loval value of a is"+this.b);
	}

}
