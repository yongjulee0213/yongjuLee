package chapter3;

import java.util.Scanner;
import java.util.Random;

public class gameofRock {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		
		boolean run=true;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		String str[]={"가위","바위","보"};
		
		while(run) {
			System.out.print("가위 바위 보!>>");
			String user=scanner.next();
			int computer=(int)(random.nextInt(2));
			
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				run=false;
			}
			else {
			if(user.equals(str[computer])){
				System.out.println("사용자 = "+user+",컴퓨터 = "+str[computer]+", 비겼습니다.");
			}
			//가위vs보  바위vs가위  보vs 주먹
			else if((user.equals("가위")&&str[computer].equals("보"))||(user.equals("바위")&&str[computer].equals("가위"))||(user.equals("보")&&str[computer].equals("바위"))){
				System.out.println("사용자 = "+user+",컴퓨터 = "+str[computer]+", 사용자가 이겼습니다.");
			}
			else {
				System.out.println("사용자 = "+user+",컴퓨터 = "+str[computer]+", 컴퓨터가 이겼습니다.");
			}
			}
		}
	}
}
