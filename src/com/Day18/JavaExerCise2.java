/*
 * 2�� 100���̿� �ִ� ��� �Ҽ��� ã�� ���α׷�
 * �־��� ���� k�� 2���� k-1������ ���ڷ� ����� �������� 0�� ���� �ϳ��� ������ �Ҽ��� �ƴϴ�.
 * 
 */

package com.Day18;

public class JavaExerCise2 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;	//count ���� ����
		
		for (int k = 2; k <= 100; k++) { // for1 2~100������ ��
			
			count = 0;	//ù��° for������ ������ count�� 0���� �ʱ�ȭ
			
			for (int x = 2; x <= k - 1; x++) { // for2 ����k�� 2���� k-1���� �ݺ�
				
				if (k % x == 0) {// k�� x�� ���� �������� 0�̸� count����
					count++;
				}
				
			} // end of for2
			
			if (count == 0) { // for2�� ������ count �Ǻ� , count�� 0�̸� ���� k�� �Ҽ�
				System.out.print(k + " ");
			} // end of for2
		} //for of for1

	}//end of main
}
