/*
 * �� ���
 *����
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����

������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.

�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.

���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
 */
package com.Day4;

import java.util.Scanner;

public class chapter3_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}
