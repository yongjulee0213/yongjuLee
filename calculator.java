package ch04_pro11;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Add add=new Add();
		Sub sub=new Sub();
		Mul mul=new Mul();
		Div div=new Div();
		
		int a;
		int b;
		char op;
		System.out.print("두 정수와 연산자를 입력하시오>>");
		a=scanner.nextInt();
		b=scanner.nextInt();
		op=scanner.next().charAt(0);
	
		switch(op) {
		case '+':
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case '-':
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case '*':
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case '/':
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
		}
		
	}
}
