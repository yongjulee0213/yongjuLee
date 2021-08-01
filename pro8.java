package chapter2;
/*
 * 2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다.
 * 키보드로부터 직사각형을 구성하는 두 점(x1,y1),(x2,y2)를 입력받아 (100,100),(200,200)의 두점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하라
 * 
 */
import java.util.Scanner;
public class pro8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("점(x1,y1)의 좌표를 입력하시오>>");
		int x1=scanner.nextInt();
		int y1=scanner.nextInt();
		
		System.out.print("점(x2,y2)의 좌표를 입력하시오>>");
		int x2=scanner.nextInt();
		int y2=scanner.nextInt();
		
		if((x1<100 ||x1>200)&&(y1<100 ||y1>200)) {
			if((x2<100 ||x2>200)&&(x2<100 ||x2>200)) {
						System.out.println("사각형안에 없음.");
					}
				}
		
		else {
			System.out.println("사각형 안에 있음.");
		}
	}
}
