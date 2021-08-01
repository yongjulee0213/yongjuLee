package chapter2;
/*
 * Scanner 클래스를 이용하여 원화를 입력받아 달러로 바ㄱ꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라.
 * $1=1100원으로 가정하고 계산하라.
 * 원화를 입력하세요(단위 원)>>3300
 * 3300원은  $3.0입니다.
 */
import java.util.Scanner;
public class pro1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int kor=scanner.nextInt();
		double usa=(double)kor/1100;
		System.out.printf("%d원은 $%.1f입니다.",kor, usa);
	}
}

