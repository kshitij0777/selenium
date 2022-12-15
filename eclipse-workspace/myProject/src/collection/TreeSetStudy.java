package collection;

import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) 
	{
		TreeSet<Object> ts= new TreeSet<>();
		
		ts.add(7);
		ts.add(4);
		ts.add(6);
		ts.add(1);
		ts.add(3);
		ts.add(2);
		ts.add(5);
		
		System.out.println(ts);
		
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		System.out.println(ts.floor(8));
		System.out.println(ts.lower(6));
		System.out.println(ts.lower(1)); 
		System.out.println(ts.higher(5));
		System.out.println(ts.higher(7));
		
		
		
		
		
		
		
		
	

	}

}
