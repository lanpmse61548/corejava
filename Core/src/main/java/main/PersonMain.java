package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PersonMain<T> {

	
	
	
	 
	public static void main(String[] args) {
		
	  Person a = new Person(1,"keke");
	  Set<Person> per = new HashSet<Person>();
	  per.add(a);
	  Person b = new Person(1,"keke");
	  System.out.println(per.contains(b));
	 
	  System.out.println(a.hashCode());
	  System.out.println(b.hashCode());
	  
	  
	 
	  /*

Because HashSet.contains uses containsKey that uses getEntry.
 It tries to find the key-value pair in the hash and both methods are needed
  (one for choosing the bucket, other for looking in the internal bucket list).
*/
	  
	  
	  
	  
	  List<Person> lp = new ArrayList<Person>();
	  lp.add(new Person(2,"a"));
	  lp.add(new Person(3,"dsd"));
	  lp.add(new Person(4,"dadsasdsa"));
	  lp.add(new Person(5,"dasddddsa"));
	  System.out.println("\n==> Iterator Example...");
		Iterator<Person> ite = lp.iterator();
		
		
		for (Person person : lp) {
			System.out.println(person.value);
		}
		
		System.out.println("----------");
		/*
		while (ite.hasNext()) {
			Person tmp = (Person)ite.next();
			//System.out.println(tmp.value);
			if(tmp.value.equals("dsd")){
			
			ite.remove();
			
			}
			
			if(tmp.value.equals("a")){
				
				tmp.value = "kkk";
				
			}
		}
     */
		System.out.println("----------");
		
		//d�ng for each x�a element
		
		for (Person person : lp) {
			
          if(person.value.equals("a")){
				
    	    //  lp.remove(person);  //java.util.ConcurrentModificationException
        	  person.value = "oooo";
				
	     }
			
			//person.value = "ooo";
		//	System.out.println(person.value);
			
			
		}
		
		
		for (Person person : lp) {
			System.out.println(person.value);
		}
		
		System.out.println("----------");
		
		
		//* d�ng for x�a element
		
		
		for (int i = 0; i < lp.size(); i++) {
			if(lp.get(i).value.equals("oooo")){
				lp.remove(lp.get(i));
				
		     }
		}
		
		
		for (Person person : lp) {
			System.out.println(person.value);
		}
		
		/*
		 * 
		 * http://stackoverflow.com/questions/2113216/which-is-more-efficient-a-for-each-loop-or-an-iterator
		 * 
		 * 
In for-each loop, we can�t modify collection, it will throw a ConcurrentModificationException ,on the other hand with iterator we can modify collection.
Modifying a collection simply means removing an element or changing content of an item stored in the collection. This occurs because for-each loop implicitly creates an iterator but it is not exposed to the user thus we can�t modify the items in the collections.

When to use which traversal?

If we have to modify collection, we must use an Iterator.
While using nested for loops it is better to use for-each loop, consider the below code for better understanding.

*/
	  
	}

}
