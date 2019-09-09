package RotateArray;

public class FirstRepeatingElementArray {

	public static void main(String[] args) {
	     int rs = -1;
		int a [] = new int[6];
	    a[0]=6;
	    a[1]=1;
	    a[2]=7;
	    a[3]=5;
	    a[4]=7;
	    a[5]=0;
	    
	    for (int i = 0; i < a.length; i++) {
	    	if(checkRe(a[i],a,i)){
	    		
	    		rs = a[i];
	    		break;
	    	};
	    
		}
	    
	    System.out.print(rs);
	}
	
	
	
	public static boolean  checkRe(int j,int arr[],int o) {
		
     for (int i = o+1; i < arr.length; i++) {
			if(j==arr[i])
			{
				
				 System.out.print(j);
				return true;
				
				
			}
			
     
     }
		
		
		
		return false;
		
	}

}
