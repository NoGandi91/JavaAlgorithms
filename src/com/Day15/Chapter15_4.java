/*
 * ���� ���丮��
0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.

���
ù° �ٿ� N!�� ����Ѵ�.
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
