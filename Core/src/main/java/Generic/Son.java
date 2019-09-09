package Generic;

public class Son extends Person {
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Son(int a, String b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void greet() {
		System.out.println("I'm son");
		
	}
}
