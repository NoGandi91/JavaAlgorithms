/*
 * ���� : ����� �Ѱ���
���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.

�Է�
ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.

��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.

���
�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
 */

package com.Day5;

import java.util.Scanner;
public class chapter4_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for(int i=0;i<test_case;i++) {
			
			//System.out.println("test_case : " + i);
			int N = sc.nextInt(); //�л� ��
			
			int[] score = new int[N]; //N���� �л��� ����
			int sum = 0;
			
			for(int j=0;j<N;j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			//System.out.println("�Է¹��� �л��� ���� : " + Arrays.toString(score));
			
			float average = (float)sum/N;
			String str = String.format("%.3f", (float)sum/N);
			//System.out.println("�Է¹��� �л��� ��� : " + str);
			
			int score_up = 0;
			
			for(int j=0;j<N;j++) {
				if(average<score[j]) {
					score_up++;
				}
			}
			
			//System.out.println("score_up : " + score_up + ", N : " + N);
			float answer = ((float)score_up/N)*100;
			//System.out.println(answer);
			String str1 = String.format("%.3f", answer);
			//System.out.println("��պ��� ���� �л����� ���� : " + str1);
			System.out.println(str1+"%");
		}
		sc.close();
	}
}



