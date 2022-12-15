package constructor;

public class CC1 {
	int a;
	int b; 
	
  public CC1()//user define zero parameter constructor
  { 
	  a=30;
	  b=20;
  }
  
  public CC1(int a)////user define single parameter constructor
  {
	  a=50;
  }
  
  public CC1(int num1,int num2)////user define two parameter constructor
  {
	 a=num1;
	 b=num2; 
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CC1 c1=new CC1();//used zero parameter constructor while object
		c1.multiplication();
		
		CC1 c2=new CC1(70);//used single parameter constructor while object
		c2.multiplication();
		
		CC1 c3=new CC1(40,10);//used double parameter constructor while object
        c3.multiplication();
        
        CC1 c4=new CC1(200,20);
        c4.multiplication ();
	}

	private void multiplication() 
		   
  {
	  int mul=a*b;
	  System.out.println("multiplication is"+mul );
  }
  
  
	}
  

