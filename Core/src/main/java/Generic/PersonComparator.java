package Generic;

public class PersonComparator {
	public static <T extends Person> T greater(T a, T b) {

		if (a.getAge() > b.getAge()) {
			return a;
		}else	if (a.getAge() < b.getAge()) {
			return b;
		}

		return null;
	}
	
	
	public static <T extends Person> T greater() {

		

		return null;
	}
}
