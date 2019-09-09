package ClassObject;

public class Person {
   private int id;
   private  String name;
   
   public Person(int a,String b){
	   this.id = a;
	   this.name = b;
	   
   }
   
   
   
   public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
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