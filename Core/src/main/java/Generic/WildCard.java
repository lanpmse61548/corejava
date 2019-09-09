package Generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
//https://stackoverflow.com/questions/16707340/when-to-use-wildcards-in-java-generics
	//https://viblo.asia/p/su-dung-bounded-wildcard-hieu-qua-trong-java-6J3ZgkaRZmB
public static void main(String[] args) 
    { 
          List<Number> numbers = new ArrayList<Number>();
          numbers.add(new Integer(19));
          numbers.add(new Double(12.1));
          numbers.add(new Long(10000));


          List<Integer> ints = new ArrayList<Integer>();
          ints.add(new Integer(19));
          ints.add(new Integer(11));
          
          List<Long> longs = new ArrayList<Long>();
          longs.add(new Long(19));
          longs.add(new Long(11));
          
          sumGeneric(numbers,numbers);
         // sumGeneric(numbers,ints); fail
          sumWildCard(numbers,ints);
          
          sumWildCardArray(numbers,longs,ints);
          
         // printList(ints); fail
          printListGeneric(ints);
          printListWildCard(ints);
    } 
	

	
	public static <T extends Number> void sumGeneric(List<T> dest, List<T> src){
		dest.addAll(src);
		float a = 0;
		 for (Number number : src) {
			   a += number.floatValue();
		   }
		   for (Number number : dest) {
			   a += number.floatValue();
		   }
		   System.out.println("sumGeneric "+ a);
		
	}

	public static void sumWildCard(List<? extends Number> dest, List<? extends Number> src){
		//dest.addAll(src); fail 
		float a = 0;
	   for (Number number : src) {
		   a += number.floatValue();
	   }
	   for (Number number : dest) {
		   a += number.floatValue();
	   }
	   System.out.println("sumWildCard "+ a);
	}
	
	public static void sumWildCardArray(List<? extends Number>... dest) {
		// dest.addAll(src); fail
		float a = 0;
		for (List<? extends Number> list : dest) {
			for (Number number : list) {
				a += number.floatValue();
			}
		}
		System.out.println("sumWildCard " + a);
	}
	
	public static void printList(List<Object> list) {
	    for (Object elem : list)
	        System.out.println(elem + " ");
	    System.out.println();
	}
	
	public static void printListWildCard(List<?> list) {
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}
	
	public static <T extends Object> void printListGeneric(List<T> list) {
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}
}
