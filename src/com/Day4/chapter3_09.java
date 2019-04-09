/*문제 
 * 합
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
1부터 n까지 합을 출력한다.
*/
package com.Day4;

import java.util.Scanner;

public class chapter3_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if(1<=n && n<=10000) {
			for(int i=1; i<=n; i++) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
