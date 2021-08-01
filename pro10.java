package chapter2;
/*
 * 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다.
 * 두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.
 * 첫번째 원의 중심과 반지름 입력>> 10 10 3
 * 두번째 원의 중심과 반지름 입력> 12 12 2
 * 두 원은 서로 겹친다.
 */
import java.util.Scanner;

public class pro10 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		int pointx1=scanner.nextInt();
		int pointy1=scanner.nextInt();
		int radius1=scanner.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		int pointx2=scanner.nextInt();
		int pointy2=scanner.nextInt();
		int radius2=scanner.nextInt();
		
		double z=Math.sqrt((pointx2-pointx1)*(pointx2-pointx1)+(pointy2-pointy1)*(pointy2-pointy1));
		int radius=radius1+radius2;

		if(radius>z) {
			System.out.println("두 원은 서로 겹친다.");
		}
		else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		
	}
}
