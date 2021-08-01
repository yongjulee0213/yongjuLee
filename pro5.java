package chapter2;
/*
 * Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라.
 * 삼각형이 되려면 두 변의 합이 다른 한변의 합보다 커야한다.
 * 정수 3개를 입력하시오>>4 3 5
 * 삼각형이 됩니다.
 */
import java.util.Scanner;

public class pro5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		boolean triangle=true;

		//a가 가장 긴 변일 경우 a<b+c
		if(b<=a && c<=a ) {
			
			if(b+c>a) {
				triangle=true;
			}
			else {
				triangle=false;
			}
		}
		
		//b가 가장 긴 변일 경우 b<a+c
		else if(b>=a && b>=c) {
			
			 if(a+c>b) {
				triangle=true;
			}
			 else {
				 triangle=false;
			 }
		}
		
		//c가 가장 긴 변일 경우 c<a+b
		else if(c>=a && c>=b) {
			
			if(a+b>c) {
			triangle=true;
			}
			else { 
				triangle=false;
			}

		}
		if(triangle==true) {
		System.out.println("삼각형이 됩니다");
		}
		else if(triangle==false)
			System.out.println("삼각형이 안됩니다.");
		}
}
