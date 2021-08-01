package ch04_pro12;
/*
 * ﻿
12. 간단한 콘서트 예약 시스템을 만들어보자. 예약 시스템의 기능은 다음과 같다.

공연은 하루에 한 번 있다.

좌석은 S석,A석, B석으로 나뉘며, 각각 10개의 좌석이 있다.

예약 시스템의 메뉴는 예약, 조회, 취소, 끝내기 가 있다.

예약은 한 자리만 가능하고, 좌석타입, 예약자 이름, 좌석번호를 순서대로 입력받아 예약한다

조회는 모든 좌석을 출력한다.

취소는 예약자의 이름을 입력받아 취소한다.

없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메세지를 출력하고 사용자가 다시 시도하도록한다.

﻿
 */
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//좌석별 초기상태
		Seat seat=new Seat();
		
		int selectMenu=0;
		int selectSeat;
		String name;
		int seatNumber;
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
	while(selectMenu!=4) {
		
		System.out.print("예약:1, 조회:2, 취소: 3, 끝내기:4>>");
		selectMenu=scanner.nextInt();
		
		
		switch(selectMenu) {
		
		case 1:
			System.out.print("좌석 구분 S(1), A(2), B(3)>>");
			selectSeat=scanner.nextInt();
			if(selectSeat==1) {seat.showSeatS();}
			else if(selectSeat==2) {seat.showSeatA();}
			else if(selectSeat==3) {seat.showSeatB();}
			
			System.out.print("이름>>");
			name=scanner.next();
			
			System.out.print("번호>>");
			seatNumber=scanner.nextInt();
				
			seat.SeatReservation(selectSeat, name, seatNumber);
			break;
			
		case 2:
			seat.showSeatS();
			seat.showSeatA();
			seat.showSeatB();
			System.out.println("<<<조회를 완료하였습니다.>>>");
			break;
			
		case 3:
			break;
		case 4:
			
		}
	}
	}
}
