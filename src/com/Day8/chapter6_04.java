/*
 * ���� : ����
�������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�. c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.
1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed �̴�.
������ ������ �־����� ��, �̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Է�
ù° �ٿ� 8�� ���ڰ� �־�����. �� ���ڴ� ���� ������ ������ ���̸�, 1���� 8���� ���ڰ� �� ���� �����Ѵ�.
���
ù° �ٿ� ascending, descending, mixed �� �ϳ��� ����Ѵ�.
*/
package com.Day8;

import java.util.Scanner;

public class chapter6_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		if (str.equals("1 2 3 4 5 6 7 8")) {
			System.out.println("ascending");
		} else if (str.contentEquals("8 7 6 5 4 3 2 1")) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}

	}

}
