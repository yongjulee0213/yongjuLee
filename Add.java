package chapter3;
/*
 *  명령행 인자 중에서 정수만을 골라 합을 구하라.
 */
public class Add {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=0;i<args.length;i++) {
			try {
				sum+=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e) {
				continue;
			}
		}
		System.out.println(sum);
	}
}
