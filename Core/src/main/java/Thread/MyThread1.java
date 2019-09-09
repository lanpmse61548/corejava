package Thread;

class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){  
  
   System.out.println("thread1 run");  
	//t.printTable(5);  
	t.printtmp();
}  
  
}  
