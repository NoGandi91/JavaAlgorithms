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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num[] = new int[N];
		int temp;
		
		//num[] 0~N�� ° �迭�� �Է°� ����
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		//�������� ����
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}				
			}
		}
		//���� �� ���� ���
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
