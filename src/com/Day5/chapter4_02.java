/*
 * ���� : �� ��
�� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
ù° �ٿ� �� ���� A, B, C�� �������� ���еǾ� �־�����. (1 �� A, B, C �� 100)

���
�� ��°�� ū ������ ����Ѵ�.

 */
package com.Day5;

import java.util.Scanner;

public class chapter4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C;
		int temp;
		Scanner sc = new Scanner(System.in);

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		if(1<=A && A<=100 && 1<=B && B<=100 && 1<=C && C<=100) {
			if(A < B) {
				if(B < C) {
					System.out.println(B);
				} else if (A < C) {
					System.out.println(C);
				} else {
					System.out.println(A);
				}
			} else {
				if(A < C) {
					System.out.println(A);
				} else if(C < B) {
					System.out.println(B);
				} else {
					System.out.println(C);
				}
			}
		}
	}

}
