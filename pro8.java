package chapter3;
import java.util.Random;
/*
 * 정수를 몇개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수 배열을 생성하고,
 * 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라.
 * 배열에는 같은 수가 없도록하고 배열을 출력하라.
 * 정수 몇개?24
 * 
 */
import java.util.Scanner;


public class pro8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random rd=new Random();
		
		System.out.print("정수 몇개?");
		int cnt=scanner.nextInt();
		int[]num=new int[cnt];

		for(int i=0;i<num.length;i++) {
			num[i]=rd.nextInt(100)+1;
			System.out.print(num[i]+" ");
		}
		
	}
}
