/*
 * ����
 * ������ ��
N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
 */

package com.Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chapter3_10 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		if(1<=n && n<=100) {
			int sum = 0;
			for(int i=0; i<n; i++) {
				sum += Integer.parseInt(input.substring(i,i+1));
			}
			System.out.println(sum);
		}
	}
}