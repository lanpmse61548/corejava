package WaitNotify;

public class Test {
	public static void main(String args[]){  
		final Customer c=new Customer();  
		
		new Thread(){  
		public void run(){c.withdraw(15000);}  
		}.start();  
		
		
		new Thread(){  
		public void run(){try {
			c.deposit(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}  
		}.start();  
		  
		}
}
