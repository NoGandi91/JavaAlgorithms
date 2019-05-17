/*
 * 1차 방적식 3x + 10y = 100을 만족하는 모든 해를 구하는 프로그램을 작성해보자.
 * 여기서 x와 y는 정수이고 0 <= x <= 10, 0 <= y <= 10이라고 가정하자
 * 
 */

package com.Day18;

public class JavaExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int x = 0; x <= 10; x++) { // for1 x를 0~10까지 1씩 증가
			
			for (int y = 0; y <= 10; y++) { // for2 y를 0~10까지 1씩 증가
				
				if ((3 * x) + (10 * y) == 100) {// 3x + 10y 가 100이면 조건 만족
					
					System.out.println("x : " + x + "\t y : " + y); // 조간 만족시 출력
				}
			} // end of for2
		} // end of for1

	}

}
