package arrayStudy;

public class ArraysEg1 {

	public static void main(String[] args)
	{
		// I want store rollNumbers of 10 student
		
		//1. Array declaration
		
		int[]rollNumber=new int[10];
		//2 Array intilization or  value assign
		
		rollNumber[0]=10;
		rollNumber[1]=11;
		rollNumber[2]=12;
		rollNumber[3]=13;
		rollNumber[4]=14;
		rollNumber[5]=15;
		rollNumber[6]=16;
		rollNumber[7]=17;
		rollNumber[8]=18;
		rollNumber[9]=19;
		
		// Arrays use
		System.out.println(rollNumber[0]=10);
		System.out.println(rollNumber[1]=11);
		System.out.println(rollNumber[3]=12);
		System.out.println(rollNumber[4]=13);
		System.out.println(rollNumber[5]=14);
		System.out.println(rollNumber[6]=15);
		System.out.println(rollNumber[7]=16);
		//=========================================================================================================
		//// I want store team membre name 10 student
		//1. Array declaration
		
		String[]name=new String[10];
		
		//2  Array value
		// 
		name[0]="sachin";
		name[1]="virendra";
		name[2]="yuvraj";
		name[3]="dhoni";
		name[4]="kohali";
		name[5]="D kartik";
		name[6]="jadeja";
		
		
		//3 use
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		System.out.println(name[5]);
		System.out.println(name[6]);
		System.out.println("==================================================");
		// static for loop
		
		for(int i=0;i<=7;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("==============================================");
		System.out.println(name[8]);

		//========================================================
		// dynamic for loop
		for(int i=0;i>=name.length-1;i--)
		{
			System.out.println(name[i]);
		}
		
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]); 
		
		}
		}
		
	
}

	
