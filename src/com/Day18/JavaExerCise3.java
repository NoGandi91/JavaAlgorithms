/*
 * ��Ÿ����� ������ ���� �ﰢ������ ������ �� �� ���� ���̸� a, b��� �ϰ�, ������ ���̸� c��� �ϸ�
 * a^2 + b^2 = c^2�� ������ �����Ѵٴ� ���̴�. �� ���� ���̰� 100���� ���� �ﰢ�� �߿��� 
 * ��Ÿ����� ������ �����ϴ� ���� �ﰢ���� �� ���� ������? 
 * 3�� �ݺ����� �̿��Ͽ� ��Ÿ����� ������ �����ϴ� 3���� ������ ã���� �Ѵ�.
 */

package com.Day18;

public class JavaExerCise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c;
		int count=0; //��Ÿ����� ������ �����ϴ� �����ﰢ�� ���� ī��Ʈ ����
		
		for(a=1; a<=100; a++) { //a�� 1~100������ ��
			for(b=1; b<=100; b++) { //b�� 1~100������ ��
				for(c=1; c<=100; c++) { //c�� 1~100������ ��
					
					if( a*a + b*b == c*c) { //a^2 + b^2 = c^2�� �����ϸ�
						count++; //ī��Ʈ���� ����
						System.out.println("a : "+a+"\t b : "+b+"\t c : "+c);
					}
				}//end of for3
			}//end of for2
		}//end of for3

	}//end of main

}
