package com.Day2;

/*
 * �� ���� �Է¹ް� ���� ����ϴ� ����
 * 
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
���
ù° �ٿ� A+B�� ����Ѵ�.
 */
import java.util.Scanner;
public class Test01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int A, B;
		do {			
			A = sc.nextInt();
			B = sc.nextInt();
		} while ( (0 >= A || B >= 10));
	
		System.out.println(A + B);
	}

}
