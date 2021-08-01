package ch04_pro10;

import java.util.Scanner;
public class DicApp {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Dictionary dic=new Dictionary();
		String word;
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		
		System.out.print("한글 단어?");
		word=scanner.next();
		
		while(!word.equals("그만")) {
			
			if(dic.kor2Eng(word)==null) {
				System.out.println(word+"는 저의 사전에 없습니다.");
			}
			else {
			System.out.println(word+"은"+dic.kor2Eng(word)); 
			}
			
			System.out.print("한글 단어?");
			word=scanner.next();
		}
		scanner.close();
	
		
		
	}
}
