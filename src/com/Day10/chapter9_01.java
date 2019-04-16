/*문제 : 수 정렬하기
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
*/
package com.Day10;

import java.util.Scanner;

public class chapter9_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num[] = new int[N];
		int temp;
		
		//num[] 0~N번 째 배열에 입력값 저장
		for(int i=0; i<N; i++) {
			num[i] = sc.nextInt();
		}
		
		//오름차순 정렬
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}				
			}
		}
		//정렬 된 수를 출력
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
