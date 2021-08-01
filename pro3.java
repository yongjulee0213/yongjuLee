package chapter2;
/*
 * Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 도전 각 몇개로 변환되는지 출력하라.
 * 금액을 입력하시오>>65376
 * 오만원권 1매
 * 만원권 1매
 * 천원권 5매
 * 백원 3개
 * 오십원 1개
 * 십원 2개 
 * 일원 6개
 */
import java.util.Scanner;
public class pro3 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money=scanner.nextInt();
		
		int fivemillion= money/50000;
		money=money-fivemillion*50000;

		int million=money/10000;
		money=money-million*10000;
		
		int fivethousand=money/5000;
		money=money-fivethousand*5000;

		int thousand=money/1000;
		money=money-thousand*1000;

		int fivehundred=money/500;
		money=money-fivehundred*500;

		int hundred=money/100;
		money=money-hundred*100;

		int fifty=money/50;
		money=money-fifty*50;

		int ten=money/10;
		money=money-ten*10;

		int one=money/1;
		
		System.out.println("오만원권 "+fivemillion+"매");
		System.out.println("만원권 "+million+"매");
		System.out.println("오천원권 "+fivethousand+"매");
		System.out.println("천원권 "+thousand+"매");
		System.out.println("오백원 "+fivehundred+"원");
		System.out.println("백원 "+hundred+"원");
		System.out.println("오십원"+fifty+"원");
		System.out.println("십원 "+ten+"원");
		System.out.println("일원 "+one+"원");
		
		
	}
}
