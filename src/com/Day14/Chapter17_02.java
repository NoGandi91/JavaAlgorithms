/*
 * ���� ������
�츮���� ������ �����̴� �� ���� ��¦�� ������ ��(0)�� ��(1)�� ������ ���ڸ� ���� ��, ��, ��, ��, �� �����Ѵ�. �� �� ��¦�� ������ ���� �� ��¦�� �� Ȥ�� �� ������ �־��� �� ��(�� �� ��, �� �� ��), ��(�� �� ��, �� �� ��), ��(�� �� ��, �� �� ��), ��(�� �� ��), ��(�� �� ��) �� � �������� �����ϴ� ���α׷��� �ۼ��϶�.

�Է�
ù° �ٺ��� ��° �ٱ��� �� �ٿ� ���� �� �� ���� ��¦���� ���¸� ��Ÿ���� �� ���� ����(0 �Ǵ� 1)��  ��ĭ�� ���̿� �ΰ� �־�����.

���
ù° �ٺ��� ��° �ٱ��� �� �ٿ� �ϳ��� �����  ���� A, ���� B, ���� C, ���� D, ��� E�� ����Ѵ�.
 */

package com.Day14;

import java.util.Scanner;

public class Chapter17_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			sum = 0;
			for (int j = 0; j < 4; j++) {

				sum = sum + sc.nextInt();
			}

			if (sum == 0) {
				System.out.println("D");
			} else if (sum == 1) {
				System.out.println("C");
			} else if (sum == 2) {
				System.out.println("B");
			} else if (sum == 3) {
				System.out.println("A");
			} else if (sum == 4) {
				System.out.println("E");
			}
		}
	}

}
