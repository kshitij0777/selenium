package arrayStudy;

import java.util.Arrays;

public class ArraysEg2 {

	public static void main(String[] args)
	{
		//String name[]=new String[8];
		String name[]= { "Sachin", "Virendra","Rahul","Virat","Yuvraj" };
		
		int rollNum[]= {10,30,40,20,50,60};
		
		// i want to print array
		
		System.out.println("============================================================");
		System.out.println("orignal order");
		
		for(int k=0;k<=rollNum.length-1;k++)
		{
			System.out.println(rollNum[k]);
			
		}
		System.out.println("============================================================");
		// sorted arrey 
		//ascending order
		System.out.println("SORTED ARREY----->asending order");
		
		Arrays.sort(rollNum);
		for(int k=0;k<=rollNum.length-1;k++) 
		{
			System.out.println(rollNum[k]);
		}
		System.out.println("SORTED ARREY----->asending order");
		
		
		for(int k=0;k<=rollNum.length-1;k++) 
		{
			System.out.println(rollNum[k]);
			
		}
		//descending order
		System.out.println("SORTED ARREY----->decending order");
		
		for(int k=rollNum.length-1;k>=0;k--)
		{
			System.out.println(rollNum[k]);
		}
		System.out.println("============================================================");
		
	}
	

}
