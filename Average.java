package chapter3;
/*
 *다음과 같이 작동하는 Average.java.를 작성하라. 명령행 인자는 모두 정수만 사용되며 정수들의 평균을 출력한다.

 */
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		int sum=0;
		double average=0;
		
		for(int i=0;i<args.length;i++) {
			sum+=Integer.parseInt(args[i]);
		}
		average=sum/args.length;
		System.out.println(average);

	}
}
