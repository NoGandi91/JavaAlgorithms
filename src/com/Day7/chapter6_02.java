/* ���� : ������ ����
 * �� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ��� A = 150, B = 266, C = 427 �̶�� 

A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 

����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.

�Է�
ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ���ų� ũ��, 1,000���� ���� �ڿ����̴�.

���
ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.

 */
package com.Day7;

import java.util.Scanner;

public class chapter6_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B, C;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		int result = A * B * C;
		String str = result + "";
		int N;
		int num[] = new int[10];

		for (int i = 0; i < str.length(); i++) {

			num[str.charAt(i) - 48]++;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
		}

	}

}
