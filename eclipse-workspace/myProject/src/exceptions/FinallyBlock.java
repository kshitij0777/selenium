package exceptions;

public class FinallyBlock {

	public static void main(String[] args)
	{
		String s=null;
		try
		{
			System.out.println(s.length());
			
		}
	finally
		{
		System.out.println("Exuecutting Finnaly block");
			
		}

	}

}
