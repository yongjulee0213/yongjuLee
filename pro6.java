package chapter2;
/*
 * 369게임을 간단히 작성해보자.
 * 1~99까지의 정수를 입력받고 정수에 3,6,9 중 하나가 있는 경우에 "박수짝"을 출력하고
 * 두개 있는 경우 "박수 짝짝"을 출력하는 프로그램을 작성하라.
 * 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면된다.
 * 1~99 사이의 정수를 입력하시오>>36
 * 박수짝짝
 */
import java.util.Scanner;

public class pro6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num=scanner.nextInt();
		char num1=Integer.toString(num).charAt(0);
		char num2=Integer.toString(num).charAt(1);

		if(num1=='3' || num1=='6' ||num1=='9') {
			if(num2=='3'||num2=='6'||num2=='9') {
				System.out.println("박수짝짝");
			}
			else {
				System.out.println("박수 짝");
			}
		}
		
		else if(num2=='3' || num2=='6' ||num2=='9') {
			if(num1=='3'||num1=='6'||num1=='9') {
				System.out.println("박수짝짝");
			}
			else {
				System.out.println("박수 짝");
			}
		}
		
		
	}
}
