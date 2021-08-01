package chapter3;
/*
 * 양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램 작성
 * 양의정수 10개 입력하시오>>
 * 3의 배수는 
 */
import java.util.Scanner;
public class pro5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] n=new int[10];

		
		System.out.print("양의 정수 10개 입력하시오>>");
		for(int i=0;i<n.length;i++) {
			n[i]=scanner.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for(int i=0;i<n.length;i++) {
			if(n[i]%3==0) {
			System.out.print(n[i]+" ");
			}
		}

	}
}
