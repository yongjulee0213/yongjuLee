package chapter4;

public class Day {
	private String work;

	public void set(String work) {
		this.work=work;
		System.out.println("저장되었습니다.");
	}
	
	public String get() {
			return work;
	}
	public void show() {
		if(work==null) {
			System.out.println("없습니다.");
		}
		else System.out.println(work+"입니다.");
	}
}
