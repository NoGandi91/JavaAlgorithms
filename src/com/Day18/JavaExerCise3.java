/*
 * 피타고라스의 정리는 직각 삼각형에서 직각을 낀 두 변의 길이를 a, b라고 하고, 빗변의 길이를 c라고 하면
 * a^2 + b^2 = c^2의 수식이 성립한다는 것이다. 각 변의 길이가 100보다 작은 삼각형 중에서 
 * 피타고라스의 정리가 성립하는 직각 삼각형은 몇 개나 있을까? 
 * 3중 반복문을 이용하여 피타고라스의 정리를 만족하는 3개의 정수를 찾도록 한다.
 */

package com.Day18;

public class JavaExerCise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c;
		int count=0; //피타고라스의 정리가 성립하는 직각삼각형 갯수 카운트 변수
		
		for(a=1; a<=100; a++) { //a는 1~100사이의 수
			for(b=1; b<=100; b++) { //b는 1~100사이의 수
				for(c=1; c<=100; c++) { //c는 1~100사이의 수
					
					if( a*a + b*b == c*c) { //a^2 + b^2 = c^2를 만족하면
						count++; //카운트변수 증가
						System.out.println("a : "+a+"\t b : "+b+"\t c : "+c);
					}
				}//end of for3
			}//end of for2
		}//end of for3

	}//end of main

}
