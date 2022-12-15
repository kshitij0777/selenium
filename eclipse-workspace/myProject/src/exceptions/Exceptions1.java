package exceptions;

public class Exceptions1 {

	public static void main(String[] args) 
	{
		String a="good";
		int a1=10;
		int b1=0;
	try 
	{
		System.out.println(a.charAt(1));
		System.out.println(a1/b1);
	} 
	catch (StringIndexOutOfBoundsException e)
	{
		System.out.println("try index value is betwen 0-1");
		
	}
	catch (NullPointerException e)
	{
		System.out.println("strig value should be not null ");
	}
	catch (ArithmeticException e)
	{
		System.out.println("we canot be divide zero");
	}
	catch (Exception e) 
	{
		System.out.println("excetion occureed");
	
	}
	System.out.println("Thank you");
	}

}
