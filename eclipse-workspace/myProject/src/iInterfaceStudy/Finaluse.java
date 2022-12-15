package iInterfaceStudy;

public final class  Finaluse {

	public static void main(String[] args) 
	{
		 int a=10;
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		
	 final int b=80;
	 //if we make any variable as a final
	 //then that  variable can t be assigned
	
	
	System.out.println(b);
	
	//b=b-10;//--------> re assignis not possible because b variable is finalkk
	
		
	}
	//if any method is final class
	//then we cant override the method in any sub classs
	public final void test1()
	{
		System.out.println("hi");
	}
		
	


	



	}


