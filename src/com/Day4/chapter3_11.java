/*���� : �� ���� ���� ����ϱ�
���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.

�� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �ܾ �־�����. �ܾ�� ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ������, ���̴� 100�� ���� �ʴ´�. ���̰� 0�� �ܾ�� �־����� �ʴ´�.

���
�Է����� �־��� �ܾ �� ���� ��� �� �ٿ� �ϳ��� ����Ѵ�. �ܾ��� ���̰� 10�� ����� �ƴ� ��쿡�� ������ �ٿ��� 10�� �̸��� ���ڸ� ����� ���� �ִ�.
*/
package com.Day4;

import java.util.Scanner;

public class chapter3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum += Integer.parseInt(input.substring(i,i+1)
		String word;
		Scanner sc = new Scanner(System.in);
		word = sc.next();
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			System.out.print(word.charAt(i));
			count++;
			if (count % 10 == 0) {
				System.out.println();
			}
		}

	}

}