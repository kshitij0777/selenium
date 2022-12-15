package collection;

import java.util.LinkedList;

public class LInkedListUse {

	public static void main(String[] args)
	{
		LinkedList<Object> ll=new LinkedList<>();
		
	ll.add("kshitij");
	ll.add('m');
	ll.add(77);
	ll.add(null);
	ll.add(788.77f);
	ll.add(true);
	ll.add(null);
	
	System.out.println(ll);
	
	ll.size();
	System.out.println(ll.size());
	
	ll.peek();
	System.out.println(ll);


	}

}
