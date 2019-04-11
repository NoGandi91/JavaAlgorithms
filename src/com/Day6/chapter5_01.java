/*
 * ���� : ���� �ѹ�
���� �ѹ��� 1949�� �ε� ������ D.R. Kaprekar�� �̸� �ٿ���. ���� ���� n�� ���ؼ� d(n)�� n�� n�� �� �ڸ����� ���ϴ� �Լ���� ��������. ���� ���, d(75) = 75+7+5 = 87�̴�.

���� ���� n�� �־����� ��, �� ���� �����ؼ� n, d(n), d(d(n)), d(d(d(n))), ...�� ���� ���� ������ ���� �� �ִ�. 

���� ���, 33���� �����Ѵٸ� ���� ���� 33 + 3 + 3 = 39�̰�, �� ���� ���� 39 + 3 + 9 = 51, ���� ���� 51 + 5 + 1 = 57�̴�. �̷������� ������ ���� ������ ���� �� �ִ�.

33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...

n�� d(n)�� �����ڶ�� �Ѵ�. ���� �������� 33�� 39�� �������̰�, 39�� 51�� ������, 51�� 57�� �������̴�. �����ڰ� �� ������ ���� ��쵵 �ִ�. ���� ���, 101�� �����ڰ� 2��(91�� 100) �ִ�. 

�����ڰ� ���� ���ڸ� ���� �ѹ���� �Ѵ�. 100���� ���� ���� �ѹ��� �� 13���� �ִ�. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97

10000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� ����.

���
10,000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� �����ϴ� ������ ����Ѵ�.

 */
package com.Day6;

import java.util.Arrays;

public class chapter5_01 {
	public static final int MAX = 10001;
	public static int notSelf;

	public static int d(int n) {
		int num = n;
		while (n != 0) {
			num += n % 10;
			n = n / 10;
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] self = new boolean[MAX];
		Arrays.fill(self, true);
		
		for(int i=1; i<MAX; i++) {
			notSelf = d(i);
			if(notSelf <MAX) {
				self[notSelf] = false;
			}
		}//end for
		
		for(int i = 1; i <self.length; i++) {
			if(self[i]) {
				System.out.println(i);
			}
		}//end for
	}//end main

}
