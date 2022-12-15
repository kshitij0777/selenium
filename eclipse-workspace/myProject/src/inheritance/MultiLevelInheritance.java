package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		GrandFather g=new GrandFather();
		Father f=new Father();
		Son1 s1=new Son1();
		
		g.stories();
		
		f.nature();
		f.stories();
		
		s1.bike();
		s1.mobile();
		s1.stories();
		
		GrandFather.experience();
		 Father.money();
		 Father.experience();
		 
		 Son1.mobile();
		 Son1.money();
		 Son1.experience();
		
		

	}

}
