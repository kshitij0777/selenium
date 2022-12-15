package exceptions;

public class TryCatch {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		 try 
		 {
			System.out.println(a/b);//Risky code
		}
		 catch (ArithmeticException e)
		 {
			 System.out.println("we canot be divided zero");
			
		}
		 
			 
		 System.out.println(" I did divison");

	}

}
