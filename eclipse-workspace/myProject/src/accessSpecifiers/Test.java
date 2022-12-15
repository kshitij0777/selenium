package accessSpecifiers;

public class Test
{
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;

	public static void main(String[] args)
	{
		Test t=new Test();
		t.m1();//calling a private method of same class
		t.m2();//calling a default method of same class
		t.m3();//calling a protected method of same class
		t.m4();//calling a public method of same class
		
		System.out.println("calling a private method of same class"+t.a);
		System.out.println("calling a default method of same class"+t.b);
		System.out.println("calling a protected method of same class"+t.c);
		System.out.println("calling a public method of same class"+t.d);
	}
	private void m1()
	{
		System.out.println("private method m1 from same class");
	}
	
	void m2()
	{
		System.out.println("dafult method m2 from same class");
	}
	protected  void m3()
	{
		System.out.println("protected method m3 from same class");
	}
	public void m4()
	{
		System.out.println("public method m4 from same class");
	}
	

}
