/*���� : �� �����ϱ�
 * N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. �� ���� ������ 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.

���
ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
*/
package com.Day10;

import java.util.Scanner;

public class chapter9_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[1000];
		int num;
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int k = 0; k < num; k++) {
			System.out.println(arr[k]);
		}
	}
}
