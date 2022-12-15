package inheritance;

public class HierrchicallINheritance {

	public static void main(String[] args)
	{
		A a=new A();
		B b=new B();
		C c=new C();
		
		a.testA();
		
		b.testA();
		b.testB();
		 c.testA();
		 c.testC();
		
		c.testD();

	}
	

}
