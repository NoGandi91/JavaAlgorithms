/*
 *������
 * ����
N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.

�Է�
ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.

���
������İ� ���� N*1���� N*9���� ����Ѵ�.

 */
package com.Day4;

import java.util.Scanner;

public class chapter3_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();

		if (N >= 1 && N <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(N + " * " + i + " = " + N * i);
			}
		}

	}

}
