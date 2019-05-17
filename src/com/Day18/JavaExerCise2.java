/*
 * 2와 100사이에 있는 모든 소수를 찾는 프로그램
 * 주어진 정수 k를 2부터 k-1까지의 숫자로 나누어서 나머지가 0인 것이 하나라도 있으면 소수가 아니다.
 * 
 */

package com.Day18;

public class JavaExerCise2 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;	//count 변수 선언
		
		for (int k = 2; k <= 100; k++) { // for1 2~100사이의 수
			
			count = 0;	//첫번째 for문으로 들어오면 count를 0으로 초기화
			
			for (int x = 2; x <= k - 1; x++) { // for2 정수k를 2부터 k-1까지 반복
				
				if (k % x == 0) {// k를 x를 나눈 나머지가 0이면 count증가
					count++;
				}
				
			} // end of for2
			
			if (count == 0) { // for2가 끝나면 count 판별 , count가 0이면 정수 k는 소수
				System.out.print(k + " ");
			} // end of for2
		} //for of for1

	}//end of main
}
