/*
 * 별 찍기
 *문제
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
package com.Day4;

import java.util.Scanner;

public class chapter3_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int j;
		int temp = N;
		while (N >= 1) {
			for (j = N; j > 1; j--) {
				System.out.printf(" ");
			}
			
			for (int i = N-j; i < temp; i++) {

				System.out.print("*");
			}
			System.out.println(" ");
			N--;
		}		
	}
}
