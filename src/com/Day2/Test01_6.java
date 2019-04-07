package com.Day2;

/*
 * 입력받은 문자를 출력하는 문제1
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.

입력
입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Test01_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			try {

				String str = sc.nextLine();
				if (str == null || str.equals(" ")) {
					break;
				} else if (str.length() > 100) {
					break;
				} else {
					strList.add(str);
				}
			} catch (Exception e) {

			}
		}

		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}

	}

}
