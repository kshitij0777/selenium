package CastingStudy;

public class UpcastingTest {

	public static void main(String[] args) 
	{
		
		Son s=new Son();
		s.bike();
		s.car();
		s.degree();
		
		
		father fs1=new father();//creating object of sub class & giving  superclass reference 
		fs1.bike();//eligible for casting
		fs1.car();//eligible for casting
		//fs1.degree;// not eligible for casting as not common/super class method
	



	}

}
