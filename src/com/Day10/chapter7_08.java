/*
 * ������� �ҸӴϴ� �Ʒ� �׸��� ���� ������ ���̾� ��ȭ�⸦ ����Ѵ�.
��ȭ�� �ɰ� ���� ��ȣ�� �ִٸ�, ���ڸ� �ϳ��� ���� ������ �ݼ� ���� �ִ� �� ���� �ð�������� ������ �Ѵ�. 
���ڸ� �ϳ� ������ ���̾��� ó�� ��ġ�� ���ư���, ���� ���ڸ� �������� ���̾��� ó�� ��ġ���� �ٽ� ������ �Ѵ�.
���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���,
 �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ� 1�ʾ� �� �ɸ���.
������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. 
��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ���� ���, UNUCIC�� 868242�� ����.
�ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ���ĺ� �빮�ڷ� �̷���� �ܾ �־�����. �ܾ�� 2����~15���ڷ� �̷���� �ִ�.
���
ù° �ٿ� ���̾��� �ɱ� ���ؼ� �ʿ��� �ð��� ����Ѵ�.

 */
package com.Day10;

import java.util.Scanner;

public class chapter7_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int result = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='B' || str.charAt(i)=='C' ) {
				result += 3;
			}else if(str.charAt(i)=='D' || str.charAt(i)=='E' || str.charAt(i)=='F' ) {
				result += 4;
			}else if(str.charAt(i)=='G' || str.charAt(i)=='H' || str.charAt(i)=='I' ) {
				result += 5;
			}else if(str.charAt(i)=='J' || str.charAt(i)=='K' || str.charAt(i)=='L' ) {
				result += 6;
			}else if(str.charAt(i)=='M' || str.charAt(i)=='N' || str.charAt(i)=='O' ) {
				result += 7;
			}else if(str.charAt(i)=='P' || str.charAt(i)=='Q' || str.charAt(i)=='R' || str.charAt(i)=='S' ) {
				result += 8;
			}else if(str.charAt(i)=='T' || str.charAt(i)=='U' || str.charAt(i)=='V' ) {
				result += 9;
			}else if(str.charAt(i)=='W' || str.charAt(i)=='X' || str.charAt(i)=='Y'|| str.charAt(i)=='Z' ) {
				result += 10;
			}			
		}
		System.out.println(result);

	}

}
