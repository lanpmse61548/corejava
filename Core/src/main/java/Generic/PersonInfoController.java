package Generic;

import java.util.ArrayList;
import java.util.List;

//A type variable with multiple bounds is a subtype of all the types listed in the bound. If one of the bounds is a class, it must be specified first. For example:
//
//Class A { /* ... */ }
//interface B { /* ... */ }
//interface C { /* ... */ }
//
//class D <T extends A & B & C> { /* ... */ }
//If bound A is not specified first, you get a compile-time error:
//
//class D <T extends B & A & C> { /* ... */ }  // compile-time error

public class PersonInfoController<T extends Person & Greeting> {
	private List<T> persons = new ArrayList<T>();

	

	public List<T> getPersons() {
		return persons;
	}



	public void setPersons(List<T> persons) {
		this.persons = persons;
	}



	public void printBasicInfo(){
		for (T person : persons) {
			System.out.println(person.getId() + "---- " +person.getName());
			person.greet();
		}
	}
	
	
	
}
