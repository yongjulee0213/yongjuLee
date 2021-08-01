package chapter3;

import java.util.Random;

/*
 * 4x4의 2차원 배열을 만들고 이곳에서 1에서 10까지 범위의 정수를 랜덤하게 새성하여 정수 16개를 배열에 저장하고, 2차원배열을 화면에 출력
 * 
 */
public class pro9 {
	public static void main(String[] args) {
		Random rd= new Random();
		int[][]num=new int[4][4];
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				num[i][j]=rd.nextInt(10)+1;
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}