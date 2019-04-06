package com.Day1;

import java.util.Scanner;

/*두 개의 정수의 합을 계산하려면 solveMeFirst 함수를 완성하십시오 .
함수 프로토 타입 :
int solveMeFirst (int a, int b);
a는 첫 번째 정수 입력입니다.
b는 두 번째 정수 입력입니다.
반환 값

위의 두 정수의 합
샘플 입력
a = 2
b = 3
샘플 출력
5
*/
public class Solution {

	static int solveMeFirst(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		int a, b, sum;

		Scanner sc = new Scanner(System.in);
		System.out.printf("첫 번째 수 입력:");
		a = sc.nextInt();
		System.out.printf("두 번째 수 입력:");
		b = sc.nextInt();

		sum = solveMeFirst(a, b);
		System.out.printf("%d와 %d의 합은 : %d\n", a, b, sum);

	}

}
