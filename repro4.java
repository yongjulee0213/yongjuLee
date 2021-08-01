package chapter3;
import java.util.Scanner;
/*
 *  i   j
 *  0 a
 *     
 */
public class repro4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		char ch=scanner.next().charAt(0);
		
		for(char i=0;i<=ch-'a';i++) {//i=0
			for(char j='a';j<=ch-i;j++) {//j=e
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
