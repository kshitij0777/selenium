package thisandsuperkeyword;

public class B extends A//inheritance
{
	int x=22;//global value of x from class b
	int y=120;//global value of y from class b
	

	public static void main(String[] args) {
		B b=new B();
		b.test();

	}
	public void test()
	{
		int x=33;
		System.out.println("local value of x is"+x);
		System.out.println("globle value  of x from b class"+this.x);
		System.out.println("globle value  of x from a class"+super.x);
		System.out.println(super.y);
		System.out.println("globle value  of y1 from a class"+super.y1);
		
	}

}
