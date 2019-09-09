package WaitNotify;

public class Customer {
	int amount=10000;  
	  
	synchronized void withdraw(int amount){  
	System.out.println("going to withdraw...");  
	  
	if(this.amount<amount){  
	System.out.println("Less balance; waiting for deposit...");  
	try{
		
		System.out.println("wait..");  
		wait();
	
	   }catch(Exception e){}  
	}  
	
	
	
	   this.amount-=amount;  
	   System.out.println("withdraw completed...");  
	}  
	  
	synchronized void deposit(int amount) throws InterruptedException{  
	System.out.println("going to deposit...");  
	Thread.sleep(4000);
	this.amount+=amount;  
	System.out.println("deposit completed... ");  
	notify();  
	}  
}
