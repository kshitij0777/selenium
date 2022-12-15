package method;

public class NonstaticRegularmethodcall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object
		//method call from other class
		//classname objectname=new class
		
		NonstaticRegularmethodcall nrm = new NonstaticRegularmethodcall();
		
		//methodcall nonstatic rerular method  from same class
		//objectname.methodname();
		
		nrm.method();
		nrm.method();
		nrm.method1();
		nrm.method2();
		nrm.method();

	}

	public void method() {
		// TODO Auto-generated method stub
		System.out.println(" hi i am nonstatic regular method from same class");
	}
	
      public void method1()
      
      {
    	  System.out.println("the task is completed");
      }
      
      public void method2()
      {
    	  System.out.println("the task is very risky");
      }
      
      
      
      
}
