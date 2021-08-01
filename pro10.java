package chapter3;



/*
 * 4x4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤으로 생성하여 임의의 위치에 삽입하라.
 * 동일한 정수가 있어도 상관없다.
 * 나머지 6개의 숫자는 모두 0이다. 만들어진 2차원 배열을 화면에 출력하라.
 */
import java.util.Random;
public class pro10 {
	public static void main(String[] args) {
		int [][]num=new int[4][4];
		int x=0;
		int y=0;
		int randomcnt=0;//랜덤 횟수
		
		while(randomcnt<10) {//랜덤으로 지정된 횟수가 10일때까지
			//좌표값
				x=(int)(Math.random()*4);
				y=(int)(Math.random()*4);
				
				if(num[y][x]==0) {//배열 값이 없으면
				num[y][x]=(int)(Math.random()*10+1);//랜덤값 넣어두기
				randomcnt++;
				}
		}
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		}
}
