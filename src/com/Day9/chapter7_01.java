/*
 * 문제 : 아스키코드
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

입력
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

출력
입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */

package com.Day9;

import java.util.Scanner;

public class chapter7_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char code = word.charAt(0);

		if( (code >='0' && code<='9') || ( code>='a' && code<='z') || ( code>='A' && code<='Z') ) {
			System.out.println((int) code);
		}	
	}
}
