/*
 * 문제 : 소트인사이드
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

입력
첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 */
package com.Day11;

import java.util.Scanner;

public class chapter9_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp;
		String N = sc.nextLine();
		int num[] = new int[N.length()];

		for (int i = 0; i < N.length(); i++) {
			num[i] = N.charAt(i) - 48;
		}

		for (int i = 0; i <= N.length() - 1; i++) {
			for (int j = 0; j < N.length(); j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		for (int i = 0; i < N.length(); i++) {
			System.out.print(num[i]);
		}
	}
}
