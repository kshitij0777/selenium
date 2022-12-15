package loops;

public class DoWhileLoop {

	public static void main(String[] args)
	{
		// i want print india 8 time
		//start--->1 condition----> i<=8 updation i++
		
		int i=1;
		do 
		{
			System.out.println("india");
			i++;//2,3,4,,5,6,7,8
		
		}
		while(i<=8);
		System.out.println("==========================================================");
		// i want print kshitij 18 time
				//start--->18 condition----> i>=8 updation i--
		
		int j=18;
		do 
		{
			
			System.out.println("kshitij");
			j--;
			
		}
		while(j>8)	;
		System.out.println("completed");
	}

}
