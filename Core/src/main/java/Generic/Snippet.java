package Generic;

public class Snippet {
	public static void main(String[] args) {
		PersonInfoController<Person> controller = new PersonInfoController<Person>();
		
		Father fa = new Father(1, "father");
		
		Son son = new Son(2, "son");
		
		controller.getPersons().add(son);
		controller.getPersons().add(fa);
		controller.printBasicInfo();
		
		fa.setAge(50);
		son.setAge(17);
		
		Person elder = PersonComparator.greater(fa, son);
		
		System.out.println("the older is " +elder.getName());
		
		 elder =PersonComparator.greater();
		
	}
}

