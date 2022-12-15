package practice;

public class Arrays {

	public static void main(String[] args) 
	{
		char[] grade=new char[7];
		
		grade[0]='a';
		grade[1]='b';
		grade[2]='c';
		grade[3]='d';
		grade[4]='e';
		grade[5]='f';
		grade[6]='g';
		
		
		

		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println(grade[4]);
		System.out.println(grade[5]);
		System.out.println(grade[6]);
		
		System.out.println("======================================================");
		
		for(int i=0;i<=6;i++)
		{
			System.out.println(grade[i]);
		}

		for(int i=0;i>=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		System.out.println("======================================================");
		for(int i=grade.length-1;i>=0;i--)
		{
			System.out.println(grade[i]);
		}


	}

}
