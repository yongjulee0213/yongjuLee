package chapter4;
import java.util.Scanner;

public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Circle c[]=new Circle[3];//3개의 Circle배열 선언
		
		for(int i=0;i<c.length;i++) {
			System.out.print("x,y,radius>>");
			double x=scanner.nextDouble();
			double y=scanner.nextDouble();
			int radius=scanner.nextInt();
			c[i]=new Circle(x,y,radius);
		}
		
		for(int i=0;i<c.length;i++) {
			c[i].show1();
		}
		
		c[0].show2(c[1],c[2]);
		scanner.close();
	}
}
