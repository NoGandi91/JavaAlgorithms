/*
 * 문제 : 최소공배수
 * 두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.

두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)

출력
첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.

*/
package com.Day13;

import java.util.Scanner;

public class Chapter18_01 {

	public static int gcv(int num1, int num2) {
		if(num2>num1) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num2==0) {
			return num1;
		}else {
			return gcv(num2, num1 % num2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int gcdValue = gcv(num1,num2);		//최대공약수
			int lcmValue = num1*num2/gcdValue;	//최소공배수
			System.out.println(lcmValue);
		}
	}

}
