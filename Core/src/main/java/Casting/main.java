package Casting;

public class main {

	public static void main(String[] args) {
		Father peter = new Son();
		Son mark = (Son)peter;  
		// Ok
		
//		Father john = new Father();
//		Son welyn = (Son)john;
       //Exception in thread "main" java.lang.ClassCastException:
		
		Integer a = new Integer(100);
		Long b = a.longValue();
		
		
		Long c = new Long(1000000000);
		a = c.intValue();
		System.out.println(a);
		
		
		long longa = 1000000000;
		int intb = (int)longa;
		System.out.println(intb);
	}

}
