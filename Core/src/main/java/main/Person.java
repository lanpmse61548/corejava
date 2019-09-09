package main;

public class Person {
   public int id;
 public  String value;
   public Person(int a,String b){
	   this.id = a;
	   this.value = b;
	   
   }
   
   @Override
   public int hashCode() {
      
       return this.id + 17;
   }
   
   
   @Override
   public boolean equals(Object obj) {
       Person tmp = (Person)obj;
       if(tmp.id == this.id){
       return true;
       
       }
       else{
    	   return false;
    	   
       }
   }
   
   
   
   
}
