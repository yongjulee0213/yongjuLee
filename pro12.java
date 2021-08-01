package chapter2;
/*
 * 사칙 연산을 입력받아 계산하는 프로그램 작성
 * 연산자 : +=/*
 * 피연산자: 실수
 * 0으로 나누기 시 0으로 나눌 수 없습니다. 출력하고 종료
 * 빈칸으로 나눠서 입력받음
 * 연산>>2 + 4
 * 2+4의계산결과는 6
 */
import java.util.Scanner;
public class pro12 {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("연산>>");
		double a=scanner.nextDouble();
		char b=scanner.next().charAt(0);
		double c=scanner.nextDouble();
		double res=0;

		
		switch(b) {
		case '+':
			res=a+c;
			break;
			
		case '-':
			res=a-c; break;
		case'*':
			res=a*c; break;
		case'/':
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			}
			else {
			res=a/c; break;
			}
		}
		System.out.printf("%.2f %c %.2f의 계산 결과는 %.2f",a,b,c,res);
	}
}
