/*
 * ���� : �ܾ����
���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

�Է�
ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

���
ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
 * 
 */
package com.Day9;

import java.util.Scanner;

public class chapter7_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char result = 0;
		char[] alphabat = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] Alphabat = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int[] count = new int[26];
		int max = 0;

		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < alphabat.length; j++) {
				if (word.charAt(i) == alphabat[j] || word.charAt(i) == Alphabat[j]) {
					count[j] += 1;
				}

			}
		}
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {
				max = count[i];
				result = Alphabat[i];
			} else if (max == count[i]) {
				result = '?';
			}
		}
		System.out.println(result);

	}
}
