/*
 * 1�� ������ 3x + 10y = 100�� �����ϴ� ��� �ظ� ���ϴ� ���α׷��� �ۼ��غ���.
 * ���⼭ x�� y�� �����̰� 0 <= x <= 10, 0 <= y <= 10�̶�� ��������
 * 
 */

package com.Day18;

public class JavaExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int x = 0; x <= 10; x++) { // for1 x�� 0~10���� 1�� ����
			
			for (int y = 0; y <= 10; y++) { // for2 y�� 0~10���� 1�� ����
				
				if ((3 * x) + (10 * y) == 100) {// 3x + 10y �� 100�̸� ���� ����
					
					System.out.println("x : " + x + "\t y : " + y); // ���� ������ ���
				}
			} // end of for2
		} // end of for1

	}

}
