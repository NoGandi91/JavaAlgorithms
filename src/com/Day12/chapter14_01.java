/*
 * ���� : �Ǻ���ġ ��
�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.

�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.

n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n�� �־�����. n�� 45���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
 */
package com.Day12;

import java.util.Scanner;

public class chapter14_01 {

	public static int pibo(int N) {
		int result = 0;
		int num = N;

		if (num == 0) {
			result = 0;
		}
		if (num == 1)
			result = result + 1;

		if (num >= 2) {
			result = pibo(num - 1) + pibo(num - 2);
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try {
			if (num <= 45 && num >= 1) {
				System.out.println(pibo(num));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
