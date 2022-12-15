package multiplelInheritanceUsingInterface;

public interface Mother
{
	 void nature();
	 void look();
	 
	 default void love()
	    {
	    	System.out.println("Father love");
	    	
	    }
	     static void knowldge()
	    {
	    	System.out.println("Mothers kwonldge");
	    }
	    

}
