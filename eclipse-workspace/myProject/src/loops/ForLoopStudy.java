package loops;



public class ForLoopStudy {

	public static void main(String[] args) {
		//I want print Bombay 10 time
		// Start--> condition----- <=10 update---->++
		
		//for ( initialization;condition;updation)
		//{
		//    //statement  to be executed
		//}
		
		
		for(int i= 1; i<10;i++)//1,2,3---10
		{
			System.out.println("bombay");
			 
		}
		{
			System.out.println("=======================================");
		}
			
		
         // i want table 
	     //start--10 condition----<=100 update----i=i+10
	
	     for(int i=10;i<=100;i=i+10)
	     {
	    	 System.out.println(i);
	     }	 

	     // i want  reverse table 
	     //start--100 condition---->=10 update----i=i-10
	     
	     for(int i=100;i>=10;i=i-10)
	     {
	    	 System.out.println(i); 
	     }
	     System.out.println("======================================================");
	     
	     
	}

}
