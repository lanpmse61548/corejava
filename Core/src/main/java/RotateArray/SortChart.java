package RotateArray;

public class SortChart {

	public static void main(String[] args) {
		String a1 = "bbwacvdaasd";
        char a[] = a1.toCharArray();
        System.out.println(a); 
       // selectionSort(a);
        bubbleSort(a);
        System.out.println(a); 

	}
    
	
	public static void selectionSort(char a[]){
	
		
	for (int j = 0; j < a.length; j++) {
		int min =j;
		for (int i = j; i < a.length; i++) {
		   if(a[min]>= a[i]){
			  
			   
			   min = i;
			 
		   } 	  
		}
		  System.out.println("min " +min  + "  "+ a[min]);  
		char tmp = a[j];
		a[j] = a[min];
	    a[min]=tmp;	
	   // System.out.print(a[j]); 
     }
	
	
		
	}
	
	
	public static void bubbleSort(char a[]){
		
		
		for (int i = a.length; i >0; i--) {
			int start= 0;
			int end = 1;		
			while(end<i){
				
				if(a[start]>a[end]){
					
					char tmp = a[start];
					a[start] = a[end];
				    a[end]=tmp;	
					
				}
				start++;
				end++;
			}
		}
		
		
	}
	
}
