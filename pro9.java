package chapter2;
/*
 * 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라.
 * 그리고 실수 값으로 다른 점(x,y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
 * 원의 중심과 반지름을 입력>> 10 10 6.5
 * 점 입력>> 13 13
 * 점 (13.0,13.0)은 원 안에 있다.
 */
import java.util.Scanner;
public class pro9 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름을 입력>>");
		double pointX1= scanner.nextDouble();
		double pointY1=scanner.nextDouble();
		double radius=scanner.nextDouble();
		
		System.out.print("점 입력>>");
		double pointX2=scanner.nextDouble();
		double pointY2=scanner.nextDouble();
		
	
		if((pointX2>(pointX1+radius))||(pointX2<(pointX1-radius))) {//13<16.5   13<3.5
			if((pointY2>(pointY1+radius))||(pointY2<(pointY1-radius))){
				System.out.println("점 ("+pointX2+","+pointY2+")은 원 안에 없다.");
			}
			
		}
		else{
			System.out.println("점 ("+pointX2+","+pointY2+")은 원 안에 있다.");
		}
		
	}
}
