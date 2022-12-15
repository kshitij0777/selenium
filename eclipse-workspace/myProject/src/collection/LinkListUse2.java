package collection;

import java.util.LinkedList;

public class LinkListUse2 {

	public static void main(String[] args) 
	{

		LinkedList<Object> ll=new LinkedList<>();
		ll.add("Velocity");
		ll.add(123);
		ll.add("pune");
		ll.add("null");
		ll.add("as");
		ll.add("null");
	
		System.out.println(ll);
		
		System.out.println(ll.peek());
		
		System.out.println(ll.size());
		
		
		System.out.println(ll.peekFirst());
		
		System.out.println(ll);
		
		System.out.println(ll.peekLast());
		System.out.println(ll);
		
		ll.push("Mumbai");
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		

		System.out.println(ll);
		
		ll.remove("Mumbai");

		System.out.println(ll);
		
		ll.add(1,'n');

		System.out.println(ll);
		//Object li1 = ll.clone();

		//System.out.println(li1);
		
		ll.contains("Mumbai");
		System.out.println(ll);
		

		System.out.println(ll.contains("pune"));
		System.out.println(ll.contains('n'));
		System.out.println(ll.contains(123));
		ll.poll();
		System.out.println(ll.poll());
		
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());

	}

}
