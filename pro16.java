package chapter3;
/*
 * 가위바위보게임
 * 독자가 먼저 가위 바위 보 중 하나입력하고 엔터키 치면 프로그램은 가위바위보를 랜덤하게 하나 선택하고 컴퓨터가 낸걸로 한다.
 * 그만 입력하면 게임 끝남
 * 컴퓨터와 가위 바위 보 게임을 합니다.
 * 가위바위 보!>> 바위
 * 사용자 =바외, 컴퓨터 가위, 사용자가 이겼습니다.
 * 가위바위보!>> 그만
 * 게임을 종료합니다..
 * 문자열 배열 만들어서 가위바위보저장
 * 컴퓨터가 내는 것 랜덤하게 하려고 랜덤함수 이용
 * 비교하는거 문자열 비교
 * 
 */
import java.util.Scanner;

public class pro16 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user=scanner.next();
			String [] game= {"가위","바위","보"};
			int n=(int)(Math.random()*3);
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다..");
				break;
			}
			
		//사용자가 낸 걸로 승자가리기
			else if(user.equals("가위")) {
			if(n==0) {//가위- 가위
				System.out.println("사용자 = "+user+", 컴퓨터 "+game[n]+", 비겼습니다.");
			}
			else if(n==1) {//가위- 바위
				System.out.println("사용자 = "+user+", 컴퓨터 "+game[n]+", 컴퓨터가 이겼습니다.");
			}
			else if(n==2) {//가위-보
				System.out.println("사용자 = "+user+", 컴퓨터 "+game[n]+", 사용자가 이겼습니다.");
			}
		}
		else if(user.equals("바위")) {
			if(n==0) {//바위- 가위
				System.out.println("사용자 = "+user+", 컴퓨터 "+game[n]+", 사용자가 이겼습니다.");
			}
			else if(n==1) {//바위- 바위
				System.out.println("사용자 = "+user+", 컴퓨터 "+game[n]+", 비겼습니다.");
			}
			else if(n==2) {//바위-보
				System.out.println("사용자 = "+user+", 컴퓨터 "+game[n]+", 컴퓨터가 이겼습니다.");
			}
		}
		else if(user.equals("보")) {
			if(n==0) {//보- 가위
				System.out.println("사용자 = "+user+", 컴퓨터 "+game[n]+", 컴퓨터가 이겼습니다.");
			}
			else if(n==1) {//보- 바위
				System.out.println("사용자 = "+user+", 컴퓨터 "+game[n]+", 사용자가 이겼습니다.");
			}
			else if(n==2) {//보-보
				System.out.println("사용자 = "+user+", 컴퓨터 "+game[n]+", 비겼습니다.");
			}
		}
			
		}
	}
}
