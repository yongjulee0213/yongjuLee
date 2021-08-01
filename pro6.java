package chapter3;
/*
 * 배열과 반복문을 이용하여 프로그램을 작성해보자.
 * 키보드에서 정수로된 돈의 액수를 입력받아 오만원권, 만원구너, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전이 각 몇개로 변환되는지 예시와같이 출력
 * 금액을 입력하시오>65123
 * 50000원짜리 : 1개
 * 10000원 짜리 : 1개
 * 1000원짜리 : 5개
 * 100원짜리 : 1개
 * 10원짜리 : 2개
 * 1원짜리 : 3개
 */
import java.util.Scanner;
public class pro6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("금액을 입력하시오>");
		int money=scanner.nextInt();
		int balance=0;

		int []unit= {50000,10000,1000,500,100,50,10,1};
		
		for(int i=0;i<unit.length;i++) {
			
			int cnt=money/unit[i];
			balance=money-cnt*unit[i];
			money=balance;
			System.out.println(unit[i]+"원 짜리 : "+cnt+"개");
		}
	}
}
