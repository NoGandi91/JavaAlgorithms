/*���� : ���� ����
���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
*/

package com.Day5;

import java.util.Scanner;

public class chapter4_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		
		score = sc.nextInt();
		
		if(90<=score && score<=100) {
			System.out.println("A");
		}else if(80<=score && score<=89) {
			System.out.println("B");
		}else if(70<=score && score<=79) {
			System.out.println("C");
		}else if(60<=score && score<=69) {
			System.out.println("D");
		}else if(0<=score && score<=59) {
			System.out.println("F");
		}

	}

}
