package com.Day3;

/*
 * ����
�� ���� A�� B�� �Է¹��� ����, A��B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
 */
import java.util.Scanner;

public class chapter2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B;
		Scanner sc = new Scanner(System.in);

		A = sc.nextInt();
		B = sc.nextInt();
		if (0 < A && B < 10) {
			System.out.println(A * B);
		}

	}
}
