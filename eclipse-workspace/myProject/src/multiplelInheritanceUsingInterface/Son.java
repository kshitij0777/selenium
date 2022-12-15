package multiplelInheritanceUsingInterface;

public class Son implements Mother,Father


{

	public static void main(String[] args)
	{
		Son s=new Son();
		s.care();
		s.nature();
		s.look();
		s.experience();
		s.love();
		s.care();
		
		Father.knowldge();
		Mother.knowldge();
		
		
		
		
		
	

	}
	@Override
	public void experience()
	{
		System.out.println("experince method from Father");
		
	}
	@Override
	public void nature()
	{
		System.out.println("nature method from Mother");
	}
	@Override
	public void care()
	{
		System.out.println("care method from Mother");
		
	}
	@Override
	public void look() 
	{
		System.out.println("look method from Mother");
		
	}
	public void love()
	{
		Mother.super.love();
		Father.super.Love();
	}

}
