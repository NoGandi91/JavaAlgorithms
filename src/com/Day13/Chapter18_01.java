/*
 * ���� : �ּҰ����
 * �� �ڿ��� A�� B�� ���ؼ�, A�� ����̸鼭 B�� ����� �ڿ����� A�� B�� �������� �Ѵ�. �̷� ����� �߿��� ���� ���� ���� �ּҰ������� �Ѵ�. ���� ���, 6�� 15�� ������� 30, 60, 90���� ������, �ּ� ������� 30�̴�.

�� �ڿ��� A�� B�� �־����� ��, A�� B�� �ּҰ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. ��° �ٺ��� T���� �ٿ� ���ļ� A�� B�� �־�����. (1 �� A, B �� 45,000)

���
ù° �ٺ��� T���� �ٿ� A�� B�� �ּҰ������ �Է¹��� ������� �� �ٿ� �ϳ��� ����Ѵ�.

*/
package com.Day13;

import java.util.Scanner;

public class Chapter18_01 {

	public static int gcv(int num1, int num2) {
		if(num2>num1) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num2==0) {
			return num1;
		}else {
			return gcv(num2, num1 % num2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int gcdValue = gcv(num1,num2);		//�ִ�����
			int lcmValue = num1*num2/gcdValue;	//�ּҰ����
			System.out.println(lcmValue);
		}
	}

}
