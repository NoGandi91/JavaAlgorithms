/*����
������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. 
����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 
4, 6, 9, 11���� 30�ϱ���, 
2���� 28�ϱ��� �ִ�.

���
ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
*/
package com.Day4;

import java.util.Scanner;

public class chapter3_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		int[] MaxDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (1 <= a && a <= 12 && 1 <= b && b <= 31) {

			int temp = 0;

			for (int i = 1; i < a; i++) {
				temp += MaxDay[i - 1];
			}
			// System.out.println("�� : "+ chai);

			temp += b;
			// System.out.println("�� : "+ chai);

			int whatday = (temp) % 7;
			System.out.println(day[whatday]);

		}
	}
}
