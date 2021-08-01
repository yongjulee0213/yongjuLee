package chapter4;
/*
 * grade클래스 작성
 * 3과목 점수 입력받아 grade객체 생성하고 성적 평균 출력
 */
import java.util.Scanner;
public class pro2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math=scanner.nextInt();
		int science=scanner.nextInt();
		int english=scanner.nextInt();
		
		Grade me=new Grade(math, science, english);
		System.out.println("평균은 "+me.average());
		
		scanner.close();
		
	}
}
