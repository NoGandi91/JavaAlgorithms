/*
 * ���� : X���� ���� ��
���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)

��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.

���
X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.

 */
package com.Day5;

import java.util.Scanner;

public class chapter4_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, X;
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		X = sc.nextInt();
		
		if( 1<= N && 1<= X && N<=10000 && X <= 10000) {
			for( int i = 0; i<N; i++) {
				int numChk = sc.nextInt();
				if(numChk <X) {
					System.out.printf("%d ",numChk);
				}
			}
			
		}

	}

}
