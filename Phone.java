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

public class Phone {
	public String name;
	public int number;
	
	public Phone() {
		
	}
	public void setInfo(String name, int number) {
		this.name=name;
		this.number=number;
		
	}
	

}
