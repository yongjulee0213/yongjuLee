package chapter4;

import java.util.Scanner;

class Circle {

	private double x,y;
	private int radius;
	
	public Circle(double x, double y, int radius) {//x,y,radius 초기화
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
	
	public void show1() {
	
			System.out.println("("+x+","+y+")"+radius);
	
}
	public void show2(Circle r,Circle s) {
		if(r.radius>radius && r.radius>s.radius) {
			System.out.println("가장 면적이 큰 원은"+"("+r.x+","+r.y+")"+r.radius);
		}
		else if(r.radius<radius && radius>s.radius){ 
			System.out.println("가장 면적이 큰 원은"+"("+x+","+y+")"+radius);
		}
		else if(r.radius<s.radius && s.radius>radius){ 
			System.out.println("가장 면적이 큰 원은"+"("+s.x+","+s.y+")"+s.radius);
		}
		
}
}


