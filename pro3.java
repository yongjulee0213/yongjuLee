package chapter4;
/*
 * 노래 한 곡을 나타내는 Song클래스 작성
 * title : 노래 제목
 * artist: 가수
 * year : 노래 발표연도
 * country: 국적
 * 생성자 2개 : 기본 생성자, 매개변수로 모든 필드 초기화하는 생성자
 * show()메소드 : 노래 정보 출력
 * main() : 1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen 을 Song객체로 생성하고 show()이용하여 노래 정보 출력
 *1978년 스웨덴 국적의 ABBA가 부른 Dancing Queen
 */
public class pro3 {
	public static void main(String[] args) {
		Song a=new Song("Dancing Queen","ABBA",1978,"스웨덴");
		a.show();
	}
}
