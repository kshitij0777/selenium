package stringStudy;

public class Split_use {

	public static void main(String[] args)
	{
		String k="Evrething is possible";
		String k1=" ";
		String s= "I : LOVE : MY : INDIA";
		String sk=":";
	   String [] required=s.split(sk);
	   String[] myString1=k.split(k1);

		System.out.println(required[0]);
	System.out.println(required[1]);
		System.out.println(required[2]);
		System.out.println(required[3]);
		
		System.out.println(myString1[0]);
		System.out.println(myString1[1]);
		System.out.println(myString1[2]);
		
		String mystring="Good Morning";
		String s1=" ";
		String[] output=mystring.split(s);
		System.out.println(output[0]);
		
		for(int i=0;i>=1;i++)
		{
			System.out.println(output[i]);
		}


	}

}
