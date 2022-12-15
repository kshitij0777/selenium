package arrayStudy;

public class MultiDimentionalArrays1 {

	

	public static void main(String[] args) 
	{
		String name[][]= {{"sachin","virendra","saurabh"}, {"yuvraj","virat","rohit"}};//2*3
		System.out.println(name.length);
		
		System.out.println("==========================================================================");
	
	
		char test[][]= {{'a','b'},{'c','d'},{'e','f'} };//3*2
		//outer loop-----> columns
		System.out.println(name[0][1]);
		System.out.println(name[1][0]);
		System.out.println(name[1][0]);
		System.out.println(name[1][1]);
		//System.out.println(name[2][0]);
		//System.out.println(name[2][1]);
		
		for(int i=0;i<=name.length-1;i++)
		{
			//inner for loop---->columns--->3 columns-->0-->1--->2
			for(int j=0;j<=2;j++)
			{
				System.out.println(name[i][j]+"   ");
			}
			
			System.out.println();
			System.out.println("======================================================================================");
		}
		
		for(char i=0;i<=2;i++)
	{	
		for(char j=0;j<=1;j++)
	{
			System.out.print(test[i][j]+"  ");
	    }
		
	
		System.out.println();
	}
	
	}
}








	
	
	
	

	
