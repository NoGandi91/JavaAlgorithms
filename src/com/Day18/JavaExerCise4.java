/*
 * ������ ���� ���α׷��� �ۼ��Ͽ� ����. ���� ����ڷκ��� �ϳ��� ���ڸ� �Է¹޴´�.
 * �̾ ����ڷκ��� 2���� ���ڸ� �Է¹޴´�. 
 * ����ڷκ��� ���� ���ڰ� '+'�̸� ����, '-'�̸� ����, '*'�̸� ����, '/'�̸� �������� ����
 * if-else���� ����ض�. �������� ��� �и� 0�� �ƴ����� ���� �˻��Ͽ��� �Ѵ�. 
 */

package com.Day18;

import java.util.Scanner;

public class JavaExerCise4 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		String x;

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �Է� : ");
		x = sc.nextLine();
		System.out.println("ù ��° ���� �Է�:");
		num1 = sc.nextInt();
		System.out.println("�� ��° ���� �Է�:");
		num2 = sc.nextInt();

		if (x.equals("+")) { // x�� +�̸�
			System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
		} else if (x.equals("-")) { // x�� + �̸�
			System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		} else if (x.equals("*")) { // x�� - �̸�
			System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
		} else if (x.equals("/")) { // x�� / �̸�
			if (num2 != 0) { // num2�� 0�� �ƴ��� �Ǻ�
				System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2)); // num1�� num2�� ���� �� ���
			}

		} else if (x.equals("%")) { //// x�� % �̸�
			if (num2 != 0) { // num2�� 0�� �ƴ��� �Ǻ�
				System.out.printf("%d % %d = %d\n", num1, num2, (num1 % num2)); // num1�� num2�� ���� ������ ���
			}
		}
	}// end of main
}
