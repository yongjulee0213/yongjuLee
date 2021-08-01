package chapter2;
/*
 * Scanner클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 십의 자리와 1의 자리가 같은지 판별하여 출력하는 프로그램을 작성하라.
 * 2자리수 정수 입력(10~99)>>
 * Yes! 10의 자리와 1의자리가 같습니다.
 */
import java.util.Scanner;
public class pro2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int number=scanner.nextInt();
		
		if(number<10 && number>99) {
			System.out.println("2자리수 정수를 입력하시오.");
		}
		else {
			
			int a=number/10;
			int b=number-(10*a);
			if(a==b) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			}
			else {
				System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다");
			}
		}
		
		
		
	}
}
