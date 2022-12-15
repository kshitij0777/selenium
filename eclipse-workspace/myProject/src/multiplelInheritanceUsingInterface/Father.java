package multiplelInheritanceUsingInterface;

public interface Father
{
	void care();
	void experience();
	
    default void Love()
    {
    	System.out.println("Father love");
    	
    }
    static void knowldge()
    {
    	System.out.println("father kwonldge");
    }
	
		
	}
    
    
	
	

