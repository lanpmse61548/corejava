package StringPackage;

public class MainString {

	public static void main(String[] args) {
	      String s1 = new String("abc");

		 String s2 =new String("abc");
	      String s3 = "abc";
	      String s4 = "abc";
	   //   s1 = s1 +"d";
	      //String pool;
	       System.out.println("s1 == s2 " + (s1==s2));
	       System.out.println("s1 euqal s2 " + s1.equals(s2));
	       
	        System.out.println("s4 == s3 " + (s4==s3));
	        System.out.println("s4 euqal s3 " + s4.equals(s3));
	        
	        
	           System.out.println("s4 euqal s2 " + s4.equals(s2));
	           
	            System.out.println("s4 == s2 " + (s4==s2));
//StringBuffer create mutable string
	}

}
