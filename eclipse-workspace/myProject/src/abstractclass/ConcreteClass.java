package abstractclass;

public class ConcreteClass extends Test
 {

	public static void main(String[] args) {
		ConcreteClass c=new ConcreteClass();// create a object of concrete class
		c.demo1();
		c.demo3();
		c.demo2();
		
	}
	public void demo1()//completing incomplete method from abstrasct clas
	{
		System.out.println("Demo 1 complete in Concrete Class");
	}
	public void demo3()
	{
		System.out.println("Demo 3  in Concrete Class");
	}

}
