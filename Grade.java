package chapter4;

public class Grade {
	int math, science, english;
	int sum=0;
	
	public Grade(int math, int science, int english) {
		this.math=math;
		this.science=science;
		this.english=english;
	}
	public double average() {
		sum=math+science+english;
		return (double)sum/3;
	}
}
