package controlStatements;

public class NestedIFStudy {

	public static void main(String[] args)
	{
		// if user ID correct then ---->password is correct
		//if password is correct ----->welcome to home page
		//else---> plz enter correct the password
		//else incorrect user id
		
		
		String UserID="velocity";
		String Password="velocity@123";
		
		if(UserID=="velocity")
		{ 
			System.out.println("Enter your password");
			if(Password=="velocity")
			{
				System.out.println("wellcome to home page");
			
			}
			else
			{
				System.out.println("plz enter the correct password");
			}
		}
				
		else
		{
			System.out.println("incorect user id");
		}
		
		//======================================================================================
	}

}
