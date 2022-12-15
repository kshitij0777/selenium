package controlStatements;

public class ElseIFstudy {

	public static void main(String[] args) {
		// if mark is greater than 66 then i am distig
		//else mark is greater than 60 then i am 1nd class
		//else mark is greater than 50 then i am 2nd class
		//else mark is greater than 40 then i am pass
		//else i am fail
		
		
		int marks=80;
		if (marks>66)
		{
			System.out.println("i am dist");
		}
		else if(marks>60)
		{
			System.out.println("i am 1st class");
			
		}
		else if(marks>50)
		{
			System.out.println("i am 2nd class");
		}
		else if (marks>40)
		{
			System.out.println("i am pass");
		}
		else if(marks<40)

		{
			System.out.println(" iam fail");
		}
		//else
		//{
		//" I am fail"
		//}
//=======================================================================================
		
	}

}
