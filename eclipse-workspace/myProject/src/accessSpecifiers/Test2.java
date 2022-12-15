package accessSpecifiers;

public class Test2 {

	public static void main(String[] args) {
		// i want call variable or method from another class
		Test t=new Test();//create object from test class
		//t.m1();//can not calling private method from another class
		t.m2();//calling default method from another class
		t.m3();//calling protected method from another class
		t.m4();//calling public method from another class
		
		//System.out.println("calling a default method of another class"+t.a);
		//can not call private method from another class
		System.out.println("calling a deffault method of another class"+t.b);
		System.out.println("calling a protected method of another class"+t.c);
		System.out.println("calling a public method of another class"+t.d);
	}

	}



