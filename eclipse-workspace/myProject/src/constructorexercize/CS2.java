package constructorexercize;


public class CS2 
{ 
	
	String city="pune";
	String name;
	
	public  CS2()
	{
		name = "velocity";
	}

	public static void main(String[] args) {
		
		
	        display1();
		
		CS2 c2=new CS2();
		c2.display();
	}
        public  void display()
        {
        	System.out.println("iam non static method display method");
        	System.out.println("my city name is"+city);  
        	System.out.println("my name is"+name);
        
	}
     public static void display1()
     { 
    	 System.out.println("i am static display 1 method");
     }
}
