/*���� 
 * ��
n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.

���
1���� n���� ���� ����Ѵ�.
*/
package com.Day4;

import java.util.Scanner;

public class chapter3_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if(1<=n && n<=10000) {
			for(int i=1; i<=n; i++) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
