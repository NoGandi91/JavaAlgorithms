package com.Day3;

/*
 * 문제
두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
 */
import java.util.Scanner;

public class chapter2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B;
		Scanner sc = new Scanner(System.in);

		A = sc.nextInt();
		B = sc.nextInt();
		if (0 < A && B < 10) {
			System.out.println(A * B);
		}

	}
}
