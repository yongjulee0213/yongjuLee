package ch04_pro12;

public class Seat {
	
	private static int seatSize=10;
	private static String []S=new String[seatSize];
	private static String []A= new String[seatSize];
	private static String []B= new String[seatSize];
	private String name;
	private int seatNumber;
	
	
	public Seat() {
		for(int i=0;i<seatSize;i++) {
			S[i]="---";
			A[i]="---";
			B[i]="---";
		}
	}
	//좌석 예약
	public void SeatReservation(int seatGrade,String name, int seatNumber) {
		
		this.name=name;
		this.seatNumber=seatNumber;
		
		switch(seatGrade) {
		case 1:
			S[seatNumber-1]=name;
			showSeatS();
			break;
		case 2:
			A[seatNumber-1]=name;
			showSeatA();
			break;
		case 3:
			B[seatNumber-1]=name;
			showSeatB();
			break;
		}
	}
	
	//좌석 조회S
	public void showSeatS() {
		System.out.print("S>> ");
		for(int i=0;i<seatSize;i++) {
			System.out.print(S[i]+" ");
		}
		System.out.println();
	}
	//좌석 조회A
		public void showSeatA() {
			System.out.print("A>> ");
			for(int i=0;i<seatSize;i++) {
				System.out.print(A[i]+" ");
			}
			System.out.println();
		}
		//좌석 조회B
		public void showSeatB() {
			System.out.print("B>> ");
			for(int i=0;i<seatSize;i++) {
				System.out.print(B[i]+" ");
			}
			System.out.println();
		}
		
		
}
