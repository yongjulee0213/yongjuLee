package chapter3;
/*
 * 과목과 점수가 짝을 이루도록 2개의 배열을 작성하라.
 * 과목이름>>JABA
 * 없는 과목입니다.
 * 과목이름>>안드로이드
 * 안드로이드의 점수는 55
 * 과목이름>>그만
 * 
 */
import java.util.Scanner;

public class pro14 {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		String course[]= {"JAVA","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[]= {95,88,76,62,55};
		boolean keep=true;
		boolean correct=true;
		
	while(keep) {
		System.out.print("과목이름>>");
		String subject=scanner.next();
		
			if(subject.equals("그만")) {
				keep=false; break;
			}
			
			else {
				for(int j=0;j<course.length;j++) {
					if(course[j].equals(subject)) {
						System.out.println(course[j]+"과목의 점수는 "+score[j]); 
						correct=true;
						break;
					}
					else { 
						correct=false;
					}
				}
			}
			
			if(correct==false) {
				System.out.println("없는 과목입니다.");
			}
	}
	}
}


