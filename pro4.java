package chapter3;
/*
 * Scanner을 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램 작성
 * 소문자 알파벳 하나를 입력하시오>> 
 * abcde
 * abcd
 * abc
 * ab
 * a
 */
import java.util.Scanner;

public class pro4 {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	     String insert;
	      char first;
	      
	      System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
	      insert = sc.next(); //s 에 문자열 읽기 e
	      first = insert.charAt(0); //s의 첫번쨰 문자를 c에 입력e
	      //i=0 j=a e-0까지니까 abcde
	      //i=1 j=a e-1까지니까 abcd
	      
	      for(int i = 0; i<=first-'a'; i++) {//줄수
	         for(char j = 'a'; j<= first-i; j++) {//abcde
	            System.out.print(j);
	         }
	         System.out.println();
	      }
	      
	      sc.close();
	   }

	
	}

