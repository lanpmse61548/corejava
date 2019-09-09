package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
/*
 * 
 * http://www.java67.com/2012/07/difference-between-arraylist-hashset-in-java.html
 * both synchronized collection
 * 
 * Generally, you should use the right tool for the job. 
 * If you don't want duplicates, use Set (or SortedSet if you want ordering, or LinkedHashSet if you want to maintain insertion order). 
 * If you want to allow duplicates, use List, and so on.
 * 
 * set has a better performance 
 * 
 * 
 * HashSet ensures there are no duplicates, gives you an O(1) contains() method but doesn't preserve order.
   ArrayList doesn't ensure there are no duplicates, contains() is O(n) but you can control the order of the entries.
 * 
 * HashSet consumes about 5.5 times more memory than ArrayList for the same number of elements 
 * (although they're both still linear), and has significantly slower iteration (albeit with the same asymptotics);
 *  
 *  Finding an element by value in a HashSet is O(1). In an ArrayList, it's O(n).

If you are only using the container to store a bunch of unique objects, and iterate over them at the end (in any order), 
  then arguably ArrayList is a better choice since it's simpler and more economical.
 * 
 * 
 * 
 * */
public class MainClass {

	public static void main(String[] args) {
		System.out.println("list");
		
		Father a[]  = new Father[8];
		
		
		
		
		 int count[] = {11, 22, 33, 44, 55};
		
		
		List<Integer> Intlist = new ArrayList<Integer>();
		List<Integer> IntLinkedlist = new LinkedList<>();
		 Stack<Integer> Stacklist  = new  Stack<Integer>();
		List<Integer> VectorList = new   Vector<Integer>();
		Queue<Integer> intQue = new LinkedList<Integer>();

		
		for(int i = 0; i<4; i++){
			Intlist.add(count[i]);
			IntLinkedlist.add(count[i]);
			Stacklist.add(count[i]);
			VectorList.add(count[i]);
	      }
		
		System.out.println(Intlist);	
		System.out.println(IntLinkedlist);	
		System.out.println(Stacklist);	
		System.out.println(VectorList);
		
		
		Stacklist.push(6);
		
		//sort comparable
		
		
		
		
		
		
		System.out.println("------------------");
		
		 
		    Set<Integer> hset = new HashSet<Integer>();
		    try{
		      for(int i = 0; i<4; i++){
		         hset.add(count[i]);
		         System.out.println(hset.contains( new Integer(i)));
		      }
		      
		      
		      System.out.println(hset);
		       
		      TreeSet<Integer> treeset = new TreeSet<Integer>(hset);
		      System.out.println("The sorted list is:");
		      System.out.println(treeset);
		      
		      Integer i = new Integer(12);
		      hset.add(i);
		      System.out.println(hset.contains( new Integer(12)));
		      
		    }
		    catch(Exception e){
		        e.printStackTrace();
		    }
		    
		    
		    
		    //https://dzone.com/articles/arraylist-vs-linkedlist-vs
		    
		    
			System.out.println("------------------");

		  /*  
		    
		    ArrayList arrayList = new ArrayList();
		    LinkedList linkedList = new LinkedList();

		    // ArrayList add
		    long startTime = System.nanoTime();

		    for (int i = 0; i < 100000; i++) {
		    arrayList.add(i);
		    }
		    long endTime = System.nanoTime();
		    long duration = endTime - startTime;
		    System.out.println("ArrayList add:  " + duration);

		    // LinkedList add
		    startTime = System.nanoTime();

		    for (int i = 0; i < 100000; i++) {
		    linkedList.add(i);
		    }
		    endTime = System.nanoTime();
		    duration = endTime - startTime;
		    System.out.println("LinkedList add: " + duration);

		    // ArrayList get
		    startTime = System.nanoTime();

		    for (int i = 0; i < 10000; i++) {
		    arrayList.get(i);
		    }
		    endTime = System.nanoTime();
		    duration = endTime - startTime;
		    System.out.println("ArrayList get:  " + duration);

		    // LinkedList get
		    startTime = System.nanoTime();

		    for (int i = 0; i < 10000; i++) {
		    linkedList.get(i);
		    }
		    endTime = System.nanoTime();
		    duration = endTime - startTime;
		    System.out.println("LinkedList get: " + duration);


		    // ArrayList remove
		    startTime = System.nanoTime();

		    for (int i = 9999; i >=0; i--) {
		    arrayList.remove(i);
		    }
		    endTime = System.nanoTime();
		    duration = endTime - startTime;
		    System.out.println("ArrayList remove:  " + duration);

		    // LinkedList remove
		    startTime = System.nanoTime();

		    for (int i = 9999; i >=0; i--) {
		    linkedList.remove(i);
		    }
		    endTime = System.nanoTime();
		    duration = endTime - startTime;
		    System.out.println("LinkedList remove: " + duration);
		    
		    */
		    
		    //hash set
		   

		    HashSet<Integer> intset = new HashSet<Integer>();
		    
		    
		    
		    
	}

}
