package ch04_pro11;

public class Div {

	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		if(a!=0 && b!=0) {
		this.a=a;
		this.b=b;
		}
		else {
			System.out.println("값을 다시입력하시오.");
		}
	}
	public int calculate() {
		return a/b;
	}
}
