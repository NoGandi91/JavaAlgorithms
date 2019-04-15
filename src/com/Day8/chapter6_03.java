/*
 * 문제 : OX퀴즈
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
출력
각 테스트 케이스마다 점수를 출력한다.
 */
package com.Day8;
import java.util.Scanner;
public class chapter6_03 {

	public static int Sum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count, sum;
		int N = sc.nextInt(); // 테스트 개수 입력
		sc.nextLine();

		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			String str = sc.nextLine();

			count = 0;
			sum = 0; // 1~N번째 까지 문제 돌때마다 count = 0으로 초기화
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'O' || str.charAt(j) == 'o') {
					count++;
				} else if (str.charAt(j) == 'X' || str.charAt(j) == 'x') {
					sum = sum + Sum(count);
					count = 0;
				}
			}
			if (count != 0) {
				sum = sum + Sum(count);
				count = 0;
			} // end or for
			arr[i] = sum;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
