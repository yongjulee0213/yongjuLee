package ch04_pro8;
/*
 * 이름, 전화번호 필드와 생성자 등을 가진 phone클래스를 작성하고 
 * 동작하는 PhoneBook 클래스 작성
 * 인원수>>3
 * 이름과 전화번호(이름과 전화번호는 빈 칸없이 입력)>> 황기태 7727777
 * 이름과 전화번호(이름과 전화번호는 빈 칸없이 입력)>> 황기태 7727777
 * 이름과 전화번호(이름과 전화번호는 빈 칸없이 입력)>> 황기태 7727777
 * 저장되었습니다...
 * 검색할이름>>황기순
 * 황기순이 없습니다.
 * 검색할 이름>>최자바
 * 최자바의 번호는 333-1234입니다.
 * 검색할 이름>> 그만
 * 
 */
import java.util.Scanner;
public class PhoneBook {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String name;
		int number;
		System.out.print("인원수>>");
		int person=scanner.nextInt();
		
		Phone p[]=new Phone[person];
		
		for(int i=0;i<p.length;i++) {
			System.out.print("이름과 전화번호(이름과 전화번호는 빈칸없이 입력)>>");
			name=scanner.next();
			number=scanner.nextInt();
			p[i]=new Phone();
			p[i].setInfo(name, number);
		}
		System.out.println("저장되었습니다.");

		while(true) {
		System.out.print("검색할 이름>>");
		name=scanner.next();
		
		while(!name.equals("그만")) {
			int i;
		for( i=0;i<p.length;i++) {	
			if(name.equals(p[i].name)) {
				System.out.println(name+"의 번호는 "+p[i].number);
				break;
			}
		}
		if (i>=p.length)  {
				System.out.println(name+"이 없습니다.");
				break;
		}
		
		System.out.print("검색할 이름>>");
		name=scanner.next();
			
		}
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
		
		}

		
	
	}
	}
