package collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudyUse {

	public static void main(String[] args)
	{
	
		Vector<Object> v= new Vector<>();
		v.add(100);//0
		v.add("Velocity");//1
		v.add(88.2f);//2
		v.add(100);//3
		v.add(null);//4
		v.add(null);//5
		
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains(0));
		System.out.println(v.indexOf("Velocity"));
		System.out.println(v.get(4));
		System.out.println(v);
		v.add(1, "Pune");// right shift
		System.out.println(v);
		v.remove(3);//left shift
		System.out.println(v);
		
		for(Object o:v) // for each loop
			{
			System.out.println(o);
			}
			
		java.util.Iterator<Object> i= v.iterator();// universal ietrator
		
			while (i.hasNext()) 
			{
			System.out.println(i.next());
			
		}
			
			ListIterator<Object> li= v.listIterator();// listIterator--> Applicable for all classes implements list interface
		while (li.hasNext()) {
			
			System.out.println(li.next());
		}

		

		
	
		Enumeration<Object> en=v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		System.out.println(v.get(4));
		
		
		
	

		

	}

}

