/*
 * 문제 : 수 정렬하기 3
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
package com.Day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class chapter9_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		int N = Integer.parseInt(br.readLine());  // 자연수의 갯수
		int[] insert = new int[10001]; // 0 ~ 10,000 까지
		
		// 자연수의 갯수는 N개. 따라서 0부터 N-1까지 반복해서 입력 받음.
		for(int i = 0 ; i < N ; i ++)
			insert[Integer.parseInt(br.readLine())]++;
		
		for(int i = 1 ; i <= 10000 ; i++) {
			int tmp = insert[i];
			for(int j = 0 ; j < tmp ; j++)
				bw.write(i + "\n");
		}
		bw.close();
	}
}

