/*
 * ���� : OX����
"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
���
�� �׽�Ʈ ���̽����� ������ ����Ѵ�.
 */
package com.Day8;
import java.util.Scanner;
public class chapter6_03 {

	public static int Sum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count, sum;
		int N = sc.nextInt(); // �׽�Ʈ ���� �Է�
		sc.nextLine();

		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();

			count = 0;
			sum = 0; // 1~N��° ���� ���� �������� count = 0���� �ʱ�ȭ
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O' || str.charAt(j) == 'o') {
					count++;
				} else if (str.charAt(j) == 'X' || str.charAt(j) == 'x') {
					sum = sum + Sum(count);
					count = 0;
				}
			}
			if (count != 0) {
				sum = sum + Sum(count);
				count = 0;
			} // end or for
			arr[i] = sum;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
