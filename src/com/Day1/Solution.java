package com.Day1;

import java.util.Scanner;

/*�� ���� ������ ���� ����Ϸ��� solveMeFirst �Լ��� �ϼ��Ͻʽÿ� .
�Լ� ������ Ÿ�� :
int solveMeFirst (int a, int b);
a�� ù ��° ���� �Է��Դϴ�.
b�� �� ��° ���� �Է��Դϴ�.
��ȯ ��

���� �� ������ ��
���� �Է�
a = 2
b = 3
���� ���
5
*/
public class Solution {

	static int solveMeFirst(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		int a, b, sum;

		Scanner sc = new Scanner(System.in);
		System.out.printf("ù ��° �� �Է�:");
		a = sc.nextInt();
		System.out.printf("�� ��° �� �Է�:");
		b = sc.nextInt();

		sum = solveMeFirst(a, b);
		System.out.printf("%d�� %d�� ���� : %d\n", a, b, sum);

	}

}
