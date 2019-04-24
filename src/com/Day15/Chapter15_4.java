/*
 * 문제 팩토리얼
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.

출력
첫째 줄에 N!을 출력한다.
 */

package com.Day15;

import java.util.Scanner;

public class Chapter15_4 {

	public static int factorial(int N) {
		int result = 1;
		if (N > 1) {
			result = N * factorial(N - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		System.out.println(factorial(N));
	}
}
