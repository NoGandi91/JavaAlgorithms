package com.Day3;



/*
 * ����
�� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
ù° �ٿ� A/B�� ����Ѵ�. ����/��� ������ 10-9 ���� ����Ѵ�.
 */
import java.util.Scanner;
public class chapter2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(0 < A&& B < 10) {
			System.out.printf("%.9f",(double)A/B);
		}

	}

}
