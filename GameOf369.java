package chapter3;

import java.text.DecimalFormat;

public class GameOf369 {
	public static void main(String[] args) {

		DecimalFormat df=new DecimalFormat("0");
		String numberof10;
		String numberof1;
		
		for(int i=0;i<100;i++) {
			int a=i/10;//10의 자리
			int b=i%10;//1의 자리
			numberof10=df.format(a);
			numberof1=df.format(b);

			
			if((a==3||a==6||a==9)&&(b==3||b==6||b==9)) {
				System.out.print(numberof10+numberof1);
				System.out.println(" 박수 짝짝");
			}
			else if((a==3||a==6||a==9)&&(b!=3||b!=6||b!=9)) {
				System.out.print(numberof10+numberof1);
				System.out.println(" 박수 짝");
			}
			else if((a!=3||a!=6||a!=9)&&(b==3||b==6||b==9)){
				System.out.print(numberof10+numberof1);
				System.out.println(" 박수 짝");
			}
		}
}
}

