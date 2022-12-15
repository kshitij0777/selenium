package exceptions;

public class StringTesting {

	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("Testing");
		s.append("  selenium");
		System.out.println(s);
		
		//System.out.println(s.reverse());
		
		System.out.println(s.insert(0, false));

	}

}
