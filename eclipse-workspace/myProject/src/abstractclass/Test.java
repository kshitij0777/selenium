package abstractclass;

public abstract class Test {

	public static void main(String[] args) 
	{
		// Test t=new Test();can not create a objectof abstract of class
		//t.demo1();

	}
	
	public abstract void demo1();//incomplete method will be completed in concrete class
	
	public void demo2()
	{
		System.out.println("Demo 2 is compalted i abstract class");
	}

}
