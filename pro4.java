package chapter2;
/*
 * Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하시오. 평균값을 구하느 것이 아님에 주의하라
 * 정수 3개 입력>> 20 100 33
 * 중간 값은 33
 */
import java.util.Scanner;
public class pro4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int midnum=0;
		
		//a가 중간값인 경우 b a c/ c a b
		if(b<=a && a<=c) {
			midnum=a;
		}
		else if(c<=a && a<=b) {
			midnum=a;
		}
		//b가 중간값인 경우 a b c/ c b a
		else if(c<=b&&b<=a) {
			midnum=b;
		}
		else if(a<=b&&b<=c) {
			midnum=b;
		}
		//c가 중간값인 경우 a c b/ b c a
		else if(a<=c&&c<=b) {
			midnum=c;
		}
		else if(b<=c&&c<=a) {
			midnum=c;
		}
		
		System.out.println("중간 값은 "+midnum);
	}
	
}
