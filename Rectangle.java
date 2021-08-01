package chapter4;
/*
 * 직사각형을 표현하는 클래스
 * int타입의 x,y,width, hegith필드 : 사각형 구성 점과 크기 정보
 * int square() : 사각형 넓이 리턴
 * void show() : 사각형의 좌표와 넓이 화면 출력
 * boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true리턴
 * 
 */
public class Rectangle {
	int x, y, width, height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		
	}
	public int square() {
		return width*height;
	}
	public void show() {
		System.out.println("("+x+","+y+") 에서 크기가 "+width+","+height+"인 사각형");
	}
	public boolean contains(Rectangle r) {//포함된다.
		if (x<r.x && y<r.y) 
			if((width+x)>(r.x+r.width)&&(height+y)>(r.y+r.height)) 
				return true;
			return false;
	}

}
