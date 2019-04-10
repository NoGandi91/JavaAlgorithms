/*
 * 문제 : 세 수
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

입력
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

출력
두 번째로 큰 정수를 출력한다.

 */
package com.Day5;

import java.util.Scanner;

public class chapter4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C;
		int temp;
		Scanner sc = new Scanner(System.in);

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		if(1<=A && A<=100 && 1<=B && B<=100 && 1<=C && C<=100) {
			if(A < B) {
				if(B < C) {
					System.out.println(B);
				} else if (A < C) {
					System.out.println(C);
				} else {
					System.out.println(A);
				}
			} else {
				if(A < C) {
					System.out.println(A);
				} else if(C < B) {
					System.out.println(B);
				} else {
					System.out.println(C);
				}
			}
		}
	}

}
