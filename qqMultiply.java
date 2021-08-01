package chapter3;
/*
 * 다음은 2개의 정수를 입력 받아 곱을 구하는 Multiply클래스이다.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class qqMultiply {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
		System.out.print("곱하고자 하는 두 수 입력>>");
		try {
			int n=scanner.nextInt();
			int m=scanner.nextInt();
			System.out.println(n+"x"+m+"="+n*m);
			break;
		}catch(InputMismatchException e) {
			System.out.println("실수는 입력하면 안됩니다");
			scanner.nextLine();
		}
	}
		scanner.close();
		
	}
}
