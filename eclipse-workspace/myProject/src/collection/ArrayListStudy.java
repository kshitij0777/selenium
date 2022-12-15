package collection;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args)
	{
		 ArrayList<Object> al = new ArrayList<>();
		al.add("Kshitij");
		al.add(123);
		al.add('m');
		al.add("Kshitij");
		al.add(null);
		al.add(null);
		al.add(945.45f);
		al.add(true);
		
		
		System.out.println(al);
		al.add(1, "a.nagar");
		System.out.println(al);
		
		System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.remove(null));
		
		System.out.println(al.remove(1));
		System.out.println(al);
		
		System.out.println(al.indexOf("Kshitij"));
		
		System.out.println(al.contains(945.45f));
		
		System.out.println(al.get(2));
		
		System.out.println(al.indexOf(945.45f));
		System.out.println(al.indexOf(123));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.set(1, 'f'));
		System.out.println(al);
		
		System.out.println(al.size());
		
		//al.clear();
		//System.out.println(al);
		
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
			
		
		 //==============================================================
		 ArrayList<Character> alc = new ArrayList<>();
		 
		 alc.add('A');
		 alc.add('B');
		 alc.add('c');
		 alc.add('D');
		 alc.add('E');
		 alc.add('F');
			System.out.println("==================for Each==========================");
			
			for(Character ac:alc)
		{
				System.out.println(ac);
		}
			System.out.println("==================itreter==========================");
			
			Iterator<Character> it1 = alc.iterator();
			while(it1.hasNext())
			{
				System.out.println(it1.next());
			}
	     System.out.println("==================list itreter==========================");
	     
	     ListIterator<Character> li1 = alc.listIterator();
	     
	     while(li1.hasNext())
	     {
	    	 System.out.println(li1.next());
	     }

		
		

			
			
		}
		
		
		

	}


