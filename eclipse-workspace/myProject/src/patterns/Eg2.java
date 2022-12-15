package patterns;

public class Eg2 {

	public static void main(String[] args) {
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		
		// rows--->4 columns--->5
		//outer for loops-->rows---->4 for loop
		for(int i=1;i<=4;i++)
		{
			// single row-->i want 5 star to be printed
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
