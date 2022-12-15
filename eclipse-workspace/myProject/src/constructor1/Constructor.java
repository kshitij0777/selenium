package constructor1;

public class Constructor 
{ 
	
	String a;
	String b;
	int c;
	int d;
	
	public Constructor()
	{
		a = "kshitij ";
		b="jadhav";
		c=8;
		d=2;
	}

	
	
	public static void main(String[] args) 
	{
		Constructor cs7=new Constructor();
		cs7.add();
		cs7.mul();
		Constructor2 c=new Constructor2();
		c.display(); 
		c.display1();

	}
	public void add()
	{ 
		String name=a+b;
		System.out.println("name is"+name);
	}
	public void mul()
	{ 
		int mul=c/d;
		System.out.println("multiplication  is"+mul);
	}

}
