package stringStudy;

public class StringUse {

	public static void main(String[] args)
	{
		String s ="pune";//constant pool area --->duplicate are not allowed
		String s2=new String("pune");//non-constant pool area --->duplicate are  allowed
		
		//================================================================================================
		
		
		//use of length () method
		String a="velocity";
		a.length();
		System.out.println(a.length());// printing only
		
		int lengthOfString = a.length();// stored in referance variable
		System.out.println(lengthOfString); //we can resue the length value
		
		
		String a1="kshitij ramkisan jadhv";
		Object newLength = a1.length(); // stored in referance variable
		
		System.out.println("length is "+newLength);
		System.out.println(a1.length()); 
		System.out.println("====================================================");
		//=====================================================
		
		//String a2="velocity";
		String a2=new String("velocity");
		System.out.println(a2.toUpperCase());// just printing upper case 
		
		String capitalString=a2.toUpperCase();// stored in referance variable
		System.out.println("to upeercass string is"+capitalString);
		
		
		System.out.println(capitalString.toLowerCase());
		//=======================================================================================================
		
		//equal() method study
		
		String b="Pune";
		String b1="Pune";
		String b2=new String("Pune");
		String b3=new String("Pune");
		String b4=new String("Pune1");
		String b5=new String("pune1");
		
		System.out.println(b==b1);
		System.out.println(b2==b1);
		System.out.println(b2==b3);
		System.out.println("==================================================================");
		System.out.println(b.equals(b1));
		System.out.println(b.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println(b2.equals(b2));
		System.out.println(b3.equals(b4));
		System.out.println(b4.equals(b5));
		
		//================================================================================
		
		System.out.println(b4.equalsIgnoreCase(b5));
		System.out.println("===============================================================");
		
		//===========================================================================
		//contain()method study
		
		String c= "Velocity";
		c.contains(c);
		System.out.println(c.contains(c));
		System.out.println(c.contains("test"));
		System.out.println(c.contains("Vel"));
		System.out.println(c.contains("city"));
		
		boolean result = c.contains("cmct");
		System.out.println("result is"+ result);
		 boolean result1 = c.contains("city");
		 System.out.println("result1 is"+ result1);
		 
		 //===================================================================================
		 System.out.println("===========================================================================");
		 
		 //is empty () method() method study
		 
		
		String d="Testing";
		d.isEmpty();
		
		System.out.println(d.isEmpty());
		
		String d1="    ";// space is nothing but string element,lengcccth is non zero
		System.out.println(d1.isEmpty()); 
		
		String d3="";
		System.out.println(d3.isEmpty());
		
		String d4=null;
		//System.out.println(d4.isBlank());
		 //===================================================================================
		// isBlanck()method 
		 String e ="Pune";
		e.isBlank();
		 System.out.println(e.isBlank());
		
		String e1="   ";
		System.out.println(e1.isBlank());// return true until some character are here
		 boolean kshitij = e1.isBlank();
		
		String e2="";
		System.out.println(e2.isBlank());
		System.out.println(e2.isBlank());
		
		String e3=null;
		//System.out.println(e3.isBlank())
		//==================================================
	 System.out.println("===========================================================================");
		 
		 //charAt() method study
	 String f ="Software";
	 f.chars();
	 System.out.println(f.charAt(5));
	   char myResult = f.charAt(2);
	   System.out.println(myResult);
	  // System.out.println(f.charAt(28));
	 //  System.out.println(f.charAt(-5));
	   String f1 =null;
	   //System.out.println(f1.charAt(2));
	   String f2="   ";
	   System.out.println(f.charAt(2));
		//==================================================
		 System.out.println("===========================================================================");
	   
		 //endWith 
		 //startsWith method use
		 String g="India";
		 System.out.println(g.endsWith("ia"));
		 System.out.println(g.endsWith("Ia"));
		 System.out.println(g.endsWith("In"));
		 System.out.println(g.endsWith("Da"));
		 System.out.println(g.endsWith("India"));
		 
		 
		 System.out.println(g.startsWith("In"));
		 System.out.println(g.startsWith("IN"));
		 System.out.println(g.startsWith("ia"));
		 System.out.println(g.startsWith("India"));
		 System.out.println(g.startsWith("dia",1));
		
		//==================================================
		 System.out.println("===========================================================================");
		 //Substring () method use
		 
		 String h= "I love my India";
		 h.substring(10);
		 System.out.println(h.substring(10));
		 System.out.println(h.substring(7));
		 System.out.println(h.substring(7, 9));
		 System.out.println(h.substring(2, 6));
		 String testing = h.substring(1);
		 System.out.println("sub string is"+testing);
		 String testing1 = h.substring(7, 9);
		 System.out.println("sub string is"+testing1);
		 
		//==================================================
		 System.out.println("===========================================================================");
		 //Concat() method use
		 
		 String i="Good ";
		 String i1="Morning";
		 i.concat(i1);
		 System.out.println(i.concat(i1));
		 System.out.println(i.concat(i1).concat(" student"));
		 System.out.println(i.concat("night"));
		 
		//==================================================
		 System.out.println("===========================================================================");
		 //IndexOf method use
		 
		 String j="Planning";
		 j.indexOf(j);
		 System.out.println( j.indexOf('a'));
		 System.out.println(j.indexOf('n'));
		 System.out.println(j.indexOf('n',5 ));
		 //==========================================
		 System.out.println(j.lastIndexOf('n'));
		 
		//==================================================
		 System.out.println("===========================================================================");
		 //replace() method use
		 String k="Good bye";
		 String k1="Evening me";
		 
		 System.out.println(k.replace("bye", "morning"));
		 
		 System.out.println(k1.replace("me", "all"));
		 
		 System.out.println(k.replace("", ""));
		 
		 System.out.println(k1.replace("me", "frd"));
		 
		 
		 
		 
		 
		 
		 
	
	 
		
		
		
	}

}
