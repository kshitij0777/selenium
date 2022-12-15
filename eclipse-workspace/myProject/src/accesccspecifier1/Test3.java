package accesccspecifier1;

import accessSpecifiers.Test;

public class Test3 extends Test

{
	
	public static void main(String[] args) 
	{
		Test t=new Test();//create object from test class
		
		//t.m1();//can not calling private method from another class
				//t.m2();// can not calling default method from another class
				//t.m3();//can not calling protected method from another class till we use  concept
				t.m4();//  calling public method from another class
				//create a object of sub class to access protected variable or method
				Test3 t3=new Test3();
				t3.m3();//calling protected method from super  class using object of sub class
				t.m4();////calling public method from super  class using object of sub class
				
				
				System.out.println("calling protected method from super  class using object of sub class"+t3.c);
				System.out.println("calling public method from super  class using object of sub class"+t3.d);
		



	}

}
