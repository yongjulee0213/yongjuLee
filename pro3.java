package chapter3;
/*
 * Scanner를 이용하여 정수를 입력받고 다음과 같이  *을 출력하는 프로그램 작성
 * *****
 * ****
 * ***
 * **
 * *
 * 
 */
import java.util.Scanner;

public class pro3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 입력>>");
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
		System.out.println();
		}

	}}
