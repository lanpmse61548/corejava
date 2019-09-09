package InnerClass;

public class main {
	public static void main(String args[]){  
		
		
		     Outer obj=new Outer();  
		     Outer.Inner in=obj.new Inner();  
		     in.msg();  
		  
		  
		  
		      AnynomousInnerClass p=new  AnynomousInnerClass (){  
			  void eat(){System.out.println("nice fruits");}  
			  };  
			  p.eat();  
		  
			  
			  localInner localobj=new localInner();  
			  localobj.display();  	  
			  
			  
			  
		 }  
}
