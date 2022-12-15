package patterns;

public class Eg5 {

	public static void main(String[] args) 
	{
		// *****
        // ****
		// ***
		// **
		// *
		//rows---->5star--->5space----->0
		int  star=5;
		int space=0;
		for (int i=1;i<=5;i++)//1,2
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
		    for (int k=1;k<=star;k++)
		   {
			System.out.print("*");
		   }
		System.out.println();
		space++;
		star--;   
	}

}
