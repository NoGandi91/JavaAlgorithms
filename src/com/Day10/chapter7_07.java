/*���� : ���
������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. 
�̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. 
����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�.
����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.

���
ù° �ٿ� ����� ����� ����Ѵ�.
 * 
 */

package com.Day10;

import java.util.Scanner;

public class chapter7_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(pow(a) > pow(b) ? pow(a) : pow(b));
	}

	// ���ڸ� �Ųٷ� ����ϴ� �Լ�
	public static int pow(int num) {
		int result = 0;

		while (num >= 1) {
			if (num >= 100) {
				result = result + num / 100;
				num = num % 100;
			} else if (num >= 10) {
				result = result + (num / 10) * 10;
				num = num % 10;
			} else if (num >= 1) {
				result = result + num * 100;
				num = num % 1;
			}
		}

		return result;
	}

}
