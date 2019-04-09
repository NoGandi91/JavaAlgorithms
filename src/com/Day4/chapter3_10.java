/*
 * 문제
 * 숫자의 합
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 */

package com.Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chapter3_10 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		if(1<=n && n<=100) {
			int sum = 0;
			for(int i=0; i<n; i++) {
				sum += Integer.parseInt(input.substring(i,i+1));
			}
			System.out.println(sum);
		}
	}
}