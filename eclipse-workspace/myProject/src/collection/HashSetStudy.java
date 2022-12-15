package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
	HashSet< Object> hs=new HashSet<>();
	
	System.out.println(hs.add("Kshitij"));
	System.out.println(hs.add("Kshitij"));
	
	hs.add("Kshitij");
	hs.add("Kshitij");
	hs.add(1234);
	hs.add('m');
	hs.add(12.13f);
	hs.add(true);
	hs.add(null);
	hs.add(null);
	
	System.out.println(hs);
	System.out.println(hs.add("Kshitij"));
	System.out.println(hs.add("Kshitij"));
	
	
	System.out.println(hs.contains(1234));
	
	System.out.println(hs.isEmpty());
	
	System.out.println(hs.remove('m'));
	System.out.println(hs);
	
	System.out.println(hs.size());
	
	
	//hs.clear();
	//System.out.println(hs);
	
	//Object hs1 = hs.clone();
	//System.out.println(hs1);
	System.out.println(hs);
	
	//for loop can't be use in set
	
	System.out.println("================================ for each loop======================================");
	 for(Object kj:hs)
	 
	 {
		 System.out.println(kj);
	 }
	 
	 System.out.println("==================================itretor====================================================");
	  Iterator<Object> it1= hs.iterator();
	  
	  while(it1.hasNext())
	  {
		  System.out.println(it1.next());
	  }
	
	  hs.spliterator();
	  System.out.println(hs.spliterator());
		   
	 
	


	}

}
