/*
 * ���� : �ƽ�Ű�ڵ�
���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
���ĺ� �ҹ���, �빮��, ���� 0-9 �� �ϳ��� ù° �ٿ� �־�����.

���
�Է����� �־��� ������ �ƽ�Ű �ڵ� ���� ����Ѵ�.
 */

package com.Day9;

import java.util.Scanner;

public class chapter7_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char code = word.charAt(0);

		if( (code >='0' && code<='9') || ( code>='a' && code<='z') || ( code>='A' && code<='Z') ) {
			System.out.println((int) code);
		}	
	}
}
