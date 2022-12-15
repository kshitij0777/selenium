package logical;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{
//		int a=20;
//		int b=20;
//		int c=a+b;
//		System.out.println(c);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter vaue of a");
		
		int a=sc.nextInt();
		
		System.out.println("enter value of b");
		
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("addition is"+c);
		
		System.out.println("============================================================");
		
		System.out.println("plz enter your name");
		String name = sc.next();
		System.out.println("Your name is"+ name);
		

	}

}
