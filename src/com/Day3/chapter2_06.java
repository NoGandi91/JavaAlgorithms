package com.Day3;



/*
 * ����
(A+B)%C�� (A%C + B%C)%C �� ������?

(A��B)%C�� (A%C �� B%C)%C �� ������?

�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)

���
ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C, ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.
 */
import java.util.Scanner;
public class chapter2_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C * B%C)%C);
		
	}

}
