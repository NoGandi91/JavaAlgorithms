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
