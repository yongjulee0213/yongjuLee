package chapter4;
/*
 * 직사각형을 표현하는 클래스
 * int타입의 x,y,width, hegith필드 : 사각형 구성 점과 크기 정보
 * int square() : 사각형 넓이 리턴
 * void show() : 사각형의 좌표와 넓이 화면 출력
 * boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true리턴
 * 
 */
public class pro4 {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(2,2,8,7);
		Rectangle s=new Rectangle(5,5,6,6);
		Rectangle t=new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s면적은 "+s.square());
		
		if(t.contains(r)) System.out.println("t는 r에 겹친다.");
		if(t.contains(s)) System.out.println("t는 s에 겹친다.");
	}
}
