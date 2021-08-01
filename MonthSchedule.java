package chapter4;
import java.util.Scanner;

public class MonthSchedule {
	public static void main(String[] args) {
		Day days[]=new Day[30];
		
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<days.length;i++) {
			days[i]=new Day();
		}
		int day;
		
		System.out.println("이번달 스케줄 관리 프로그램");
		boolean run=true;
		
		while(run) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			int select=scanner.nextInt();
			switch(select) {
			case 1: 
				System.out.print("날짜(1~30)?");
					day=scanner.nextInt();
					System.out.println(day);
					if(day<0||day>30) {
						System.out.println("날짜를 잘못입력했습니다.");
					}
					System.out.print("할일(빈칸없이 입력)?");
					String work=scanner.next();
					
					System.out.println(work);
					days[day].set(work);
					break;
				
			case 2:
				System.out.println("날짜(1~30)?");
				day=scanner.nextInt();
				System.out.print(day+"일에 할 일은 ");
				days[day].show();
				break;
			
			case 3:
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
				
			default:
				System.out.println("다시 입력하세요");
				break;
				
			}

		}
	}
}
