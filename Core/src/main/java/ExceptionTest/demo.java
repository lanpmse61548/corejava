package ExceptionTest;

import java.io.FileInputStream;
import java.io.IOException;

public class demo  {
	public static void main(String args[]) throws IOException{ // throws IOException{ 
		  ThrowExample obj2=new ThrowExample(); 
		// obj2.mymethod(3); 
	/*	
		try{ 
		     ThrowExample obj=new ThrowExample(); 
		     obj.mymethod(1); 
		     System.out.println("lllllllkkk ");
		   }catch(Exception ex){
		     System.out.println("lllllll "+ex);
		    } 
		
		
		*/
		try{
			
			
		FileInputStream fis = null;
	      fis = new FileInputStream("B:/myfile.txt"); 
	      int k; 
	    
	      while(( k = fis.read() ) != -1) 
	      { 
		   System.out.print((char)k); 
	      } 
	      fis.close(); 	
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		System.out.println("lllllllkkk ");
		
		
		try{
		FileInputStream fis1 = null;
		  fis1.read();
	}catch(Exception e){
		//e.printStackTrace();
		
	}
	
	
	}
	
}
