package enumDemo;

public enum EnumNumber {
    ONE(1),
	TWO(2);
	
	private int num;

	
	 EnumNumber(int a){
		
		num = a;
	}
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
