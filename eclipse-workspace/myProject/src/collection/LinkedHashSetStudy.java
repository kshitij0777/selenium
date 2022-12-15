package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args)
	{
		LinkedHashSet<Object> lh1=new LinkedHashSet<>();
		System.out.println(lh1.add("Ajit"));
		lh1.add("Ajit");
		lh1.add(12345);
		lh1.add('M');
		lh1.add("Ajit");
		lh1.add(null);
		lh1.add(true);
		lh1.add(77.55f);
		
		
		System.out.println(lh1);
		System.out.println(lh1.add("Ajit"));
		
		System.out.println(lh1.size());
		System.out.println(lh1.contains("Ajit"));
		System.out.println(lh1.remove('M'));
		
		System.out.println(lh1.isEmpty());
		
		lh1.clear();
		System.out.println(lh1);
		
		System.out.println("==================================iterator===========================================");
		
	     Iterator<Object> it1=lh1.iterator();
	 
	     while(it1.hasNext())
	     {
	    	 System.out.println(it1.next());
	     }
	     
	     System.out.println("====================================each loop===============================================");
	      for(Object Kj:lh1)
	      {
	    	  System.out.println(Kj);
	      }
	     
	     
	   
		
		
		
		
		
		
		
	}

}
