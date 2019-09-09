package Thread;

public class Table {
	public int tmp;
	
	public Table(){
		
		tmp=0; 
	}
	
	synchronized void printtmp(){
		
		 for (int i = 0; i < 10; i++) {
				this.tmp =this.tmp+5;
				System.out.println("thread "+Thread.currentThread().getName()+"  "+ this.tmp); 
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			}
		
		
	}
	
	synchronized void printTable(int n){//method not synchronized  
		tmp=1; 
		for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     System.out.println(tmp*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 }  
}
