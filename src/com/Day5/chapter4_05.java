/*
 * 문제 : 평균은 넘겠지
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

입력
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */

package com.Day5;

import java.util.Scanner;
public class chapter4_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for(int i=0;i<test_case;i++) {
			
			//System.out.println("test_case : " + i);
			int N = sc.nextInt(); //학생 수
			
			int[] score = new int[N]; //N명의 학생들 점수
			int sum = 0;
			
			for(int j=0;j<N;j++) {
				score[j] = sc.nextInt();
				sum += score[j];
			}
			
			//System.out.println("입력받은 학생들 점수 : " + Arrays.toString(score));
			
			float average = (float)sum/N;
			String str = String.format("%.3f", (float)sum/N);
			//System.out.println("입력받은 학생들 평균 : " + str);
			
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
			//System.out.println("평균보다 높은 학생들의 비율 : " + str1);
			System.out.println(str1+"%");
		}
		sc.close();
	}
}



