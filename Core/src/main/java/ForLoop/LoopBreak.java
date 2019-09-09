package ForLoop;

public class LoopBreak {
	public static void main(String[] args) {
		int i =0;
	
		int j = 0;
		for (j=0; j < 100; j++) {
			
			System.out.println(j);
			while(i<19){
				i++;
				if (i==3) {
					System.out.println("kkk");
					break;
				}
			}	
		}
		System.out.println(i);
		System.out.println(j);
		
		
	}
}
