/*
 * ���� : ��Ʈ�λ��̵�
�迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.

�Է�
ù° �ٿ� �����ϰ����ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̴�.

���
ù° �ٿ� �ڸ����� ������������ ������ ���� ����Ѵ�.
 */
package com.Day11;

import java.util.Scanner;

public class chapter9_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp;
		String N = sc.nextLine();
		int num[] = new int[N.length()];

		for (int i = 0; i < N.length(); i++) {
			num[i] = N.charAt(i) - 48;
		}

		for (int i = 0; i <= N.length() - 1; i++) {
			for (int j = 0; j < N.length(); j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		for (int i = 0; i < N.length(); i++) {
			System.out.print(num[i]);
		}
	}
}
