package Math;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		//Given two strings, write a program that efficiently finds the longest common subsequence.
		/*
		Given an array with numbers, write a program that efficiently answers queries of the form: “Which is the nearest larger value for the number at position i?”, where distance is the difference in array indices. For example in the array [1,4,3,2,5,7], the nearest larger value for 4 is 5. After linear time preprocessing you should be able to answer queries in constant time.
				Given two strings, write a program that outputs the shortest sequence of character insertions and deletions that turn one string into the other.
				
				Write a function that multiplies two matrices together. Make it as efficient as you can and compare the performance to a polished linear algebra library for your language. You might want to read about Strassen’s algorithm and the effects CPU caches have. Try out different matrix layouts and see what happens.
				Implement a van Emde Boas tree. Compare it with your previous search tree implementations.
				Given a set of d-dimensional rectangular boxes, write a program that computes the volume of their union. Start with 2D and work your way up.
		*/
		String a= "ewfffffrabcdyuilkfjehyuvkehkhkhkhk";
		String b= "khkhkhkyuilkfjehyuhhewejecabcdjfffffff";
		
		int pos=0;
		int lenght =0;
		
		//int[] posL = new int[9];
		
		
		for(int i =0; i<a.length(); i++){
			
			for(int j =0; j<a.length(); j++){
				
				if(a.charAt(i) == b.charAt(j)){
					int count =0;
					int tmpiPos= i;
					int tmpjPos = j;
					
					while( tmpiPos <a.length() && tmpjPos < b.length()){
						if(a.charAt(tmpiPos) != b.charAt(tmpjPos)){
							break;
						}
						count++;
						tmpiPos++;
						tmpjPos++;
					}
					
					if(lenght < count){
						lenght = count;
						pos = i;//mpiPos;
					}
					
				}
				
			}
			
			
		}
  
		 System.out.println("dffd");
      
		  System.out.println(pos);
		  System.out.println(lenght);
		  int tmp = pos+lenght;
		 for (int i = pos; i < tmp; i++) {
    	
	        System.out.print(a.charAt(i));
      }
		
	}

//	public static String find(){}
}
