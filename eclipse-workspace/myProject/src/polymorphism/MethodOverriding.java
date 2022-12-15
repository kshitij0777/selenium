package polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		
		a.greetings();
		b.greetings();
		
		b.greetings();
		b.greetings();
		a.greetings();
		

	}

}
