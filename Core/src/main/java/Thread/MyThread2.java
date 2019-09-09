package Thread;

class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public  void run(){  
	
	System.out.println("thread2 run"); 
//t.printTable(100);  
	  
	t.printtmp();
	
	   
	   
}  
}  