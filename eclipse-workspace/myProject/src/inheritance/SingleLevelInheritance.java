package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) 
	{
	Mother m=new Mother();//created the object  of mother class
	m.look();//using object of mother class call mother property
	
	Daughter d=new Daughter();//created the object  of daughter class
	d.mobile();//using object of daughter class call daughter property
	d.look();//using object of daughter class call mother property
	
	Mother.recipe();//mother class calling its own static method
	Daughter.scooty(); //daughter class calling its own static method
	Daughter.recipe();//daughter class calling mother static method
	

	}

}
