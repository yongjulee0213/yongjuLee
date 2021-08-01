package chapter3;
/*
 * 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.그리고 배열에 든 숫자들과 평균을 출력하라.
 * 랜덤한 정수들 : 10 5 2 9 1 4 1 5 1 5
 * 평균은 4.3
 */
import java.util.Scanner;
public class pro7 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int []n=new int[10];
		int sum=0;
	
		
		System.out.print("랜덤한 정수들: ");
		for(int i=0;i<n.length;i++) {
			n[i]=scanner.nextInt();
			sum+=n[i];
		}
		double avg=(double)sum/(n.length);
		System.out.println("평균은 " +avg);
		
	}
}
