package constructor;

public class CC 
{
	int a;//global varible declaraton
	int b;//global varible declaraton
	
	public CC()// user define constructor  with zero parameter
	
	{
		System.out.println("hi am constructor");
		a=10;//use constructor value
		b=20;
	}
	
	//publicCC()//defalut costructor---->compiler at time of compilation time
	
	 //      { System.out.println("hi am constructor");     
      //}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC c=new CC();//create objecto of class
		c.test();

	}
	public void test()
	{
		int sum = a+b;
		System.out.println("sum is"+sum);
	}
}
