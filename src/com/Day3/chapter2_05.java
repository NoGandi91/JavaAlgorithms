package com.Day3;



/*
 * ����
�� �ڿ��� A�� B�� �־�����. �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 

�Է�
�� �ڿ��� A�� B�� �־�����. (1 �� A, B �� 10,000)

���
ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
 */
import java.util.Scanner;
public class chapter2_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		if(1 <= A && B <= 10000) {
			System.out.println(A+B);
			System.out.println(A-B);
			System.out.println(A*B);
			System.out.println(A/B);
			System.out.println(A%B);
		}

	}

}
