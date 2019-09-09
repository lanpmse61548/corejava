package shift;

public class shiftmain {

	public static void main(String[] args) {
		int a = 45; //00101101     step 1 :  0000101101
		System.out.println(a>>2); //00001011 = 11
		System.out.println(a<<2); // 10110100
		
		int i = 0;
		int k = i++;
		System.out.println(k);  //When wiriting i++, the increment happens after returning
        
		int j = 0;
		System.out.println(++j); //When wiriting ++i, i will first be incremented, then returned 
	
		System.out.println(16/10);
		System.out.println(16%10);
	
	}

}
