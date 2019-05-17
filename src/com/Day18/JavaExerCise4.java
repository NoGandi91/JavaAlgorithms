/*
 * 간단한 계산기 프로그램을 작성하여 보자. 먼저 사용자로부터 하나의 문자를 입력받는다.
 * 이어서 사용자로부터 2개의 숫자를 입력받는다. 
 * 사용자로부터 받은 문자가 '+'이면 덧셈, '-'이면 뺄셈, '*'이면 곱셈, '/'이면 나눗셈을 수행
 * if-else문을 사용해라. 나눗셈의 경우 분모가 0이 아닌지를 먼저 검사하여야 한다. 
 */

package com.Day18;

import java.util.Scanner;

public class JavaExerCise4 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		String x;

		Scanner sc = new Scanner(System.in);

		System.out.println("문자 입력 : ");
		x = sc.nextLine();
		System.out.println("첫 번째 숫자 입력:");
		num1 = sc.nextInt();
		System.out.println("두 번째 숫자 입력:");
		num2 = sc.nextInt();

		if (x.equals("+")) { // x가 +이면
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
		} else if (x.equals("-")) { // x가 + 이면
			System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		} else if (x.equals("*")) { // x가 - 이면
			System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
		} else if (x.equals("/")) { // x가 / 이면
			if (num2 != 0) { // num2가 0이 아닌지 판별
				System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2)); // num1을 num2로 나눈 몫 출력
			}

		} else if (x.equals("%")) { //// x가 % 이면
			if (num2 != 0) { // num2가 0이 아닌지 판별
				System.out.printf("%d % %d = %d\n", num1, num2, (num1 % num2)); // num1을 num2로 나눈 나머지 출력
			}
		}
	}// end of main
}
