package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy2 {

	public static void main(String[] args)
	{
		ArrayList<Integer> al= new ArrayList<>();
		
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.set(6, 17);
		System.out.println(al);
		
		al.remove(6);
		System.out.println(al);
		//al.capacity();
		//System.out.println(al);
		al.add(6, 16);
		System.out.println(al);
		
		al.remove(5);
		System.out.println(al);
		al.add(5, 15);
		System.out.println(al);
		
		al.set(0, 9);
		System.out.println(al);
		
		al.set(0, 10);
		System.out.println(al);
		
		//al.clear();
		
	//	System.out.println(al);
		
		System.out.println("==================for loop==========================");
		for (int i=0;i<=5;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("==================for Each==========================");
		
		for(Object a:al)
		{ 
			System.out.println(a);
			
		}
		System.out.println("==================itreter==========================");
		
		 Iterator it = al.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
			System.out.println("==================list itreter==========================");
			ListIterator li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
    	}
		


		

			
		
		
		
		
		
		
		
	
	

	}

}
