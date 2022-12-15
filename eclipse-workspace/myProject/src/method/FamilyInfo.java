package method;

public class FamilyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create obect --classname obkectneme= new class
		FamilyInfo FI= new FamilyInfo();
		FI.FamilyInfo();
	
		
		// calling is object name.method name();
		FI.FamilyInfo("kshitij ramkisan jadhav",25.4f,'m');
		FI.FamilyInfo("ajit ramkisan jadhav",24,'M');
		FI.FamilyInfo("kshitij ramkisan jadhav ", 26, 'm');

	}    
	public void FamilyInfo()
	
	{
		String name= "kshitij";
		float age=42;
		char gender='m';
		
		System.out.println("my name is"+name);
		System.out.println("my age is"+age);
		System.out.println("my gender is"+gender);
	}
	// metod with parameter
    
	public void FamilyInfo(String name,float age,char gender)
	{
		System.out.println("my name is"+name);
		System.out.println("my age is"+age);
		System.out.println("my gender is"+gender);
	}
}
