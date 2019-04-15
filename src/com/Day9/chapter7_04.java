/*
 * 문제 : 단어공부
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * 
 */
package com.Day9;

import java.util.Scanner;

public class chapter7_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char result = 0;
		char[] alphabat = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] Alphabat = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int[] count = new int[26];
		int max = 0;

		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < alphabat.length; j++) {
				if (word.charAt(i) == alphabat[j] || word.charAt(i) == Alphabat[j]) {
					count[j] += 1;
				}

			}
		}
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				result = Alphabat[i];
			} else if (max == count[i]) {
				result = '?';
			}
		}
		System.out.println(result);

	}
}
