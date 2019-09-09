package ReverseString;

public class main {
	static String finalStr= "";
	public static void main(String[] args) {
		
           try{
        	  
        	   reverS("fuck this      you   shit");
        		
           }catch(Exception e){
        	   
        	   e.printStackTrace();
           }finally{
        	   
        	   System.out.println ("lll "+ finalStr);
           }
          //  System.out.print( finalStr);
	}

	static	void  reverS(String pa){
		String tmp= "";
		
		char[] ca = pa.toCharArray();
        int n = pa.length()-1;
        
        int k =0;
   
        
        try{
     	   
        	  while(n>0){
              	
              	
              	
          		 System.out.println("dmmm "+n);
              	
              	
              	
              	
      	
              	
              			if(ca[n]== ' '){
          					
          					
          					n = getBlak(n,ca);
                              
          				}else{
          					
          					n = getWord(n,ca);
                               
          					
          				}
          				
              		 
              	 }
              //	System.out.println ( finalStr);
      			
      			
      			 
      			
      		
     	   
        }catch(Exception e){
     	   e.printStackTrace();
     	   
        }finally{
     	   
     	   System.out.print( "lllllllll "+ n); 
        }
        
        
        
      
		
		
		
		
		
	}
	
	
	public static int getWord(int tmp,char[] a){
		
		
	
		int o = tmp;
	
		
	
		while(a[tmp] !=' ' && tmp >0){
			// finalStr = finalStr + a[tmp];
			 tmp--;
			 System.out.print( tmp + "   ");	
			
			
		}
		int tmp2;
		
			
			 tmp2 = tmp+1;
			 System.out.print( "tmp2 "+ tmp2 + "   " );	
			 if(tmp==0){
				 System.out.print( "000000"+ tmp + "   "+o);	
				 tmp2 = tmp2-1;
				 
			 }
		
		
		
		 
		while( tmp2 <= o){
		
			finalStr = finalStr + a[tmp2];
				tmp2++;
				
		}
				
				
			
     

         return tmp;	 
		
	

	}
	
	
	
	public static int getBlak(int tmp,char[] a){
		
		
	//	 System.out.print( tmp + "   ");	
		

		while(a[tmp] ==' '){
			if(tmp>0){
				
				
				finalStr = finalStr + a[tmp];
				tmp--;
			}
			
			
		}
		
		
      //  System.out.print( tmp + "   ");
    
     return tmp;		
			
			
			
			
	}

	


}