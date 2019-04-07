package com.Day2;


/*
 * 문제
입력 받은 대로 출력하는 프로그램을 작성하시오.

입력
입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 
각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
 */
//str == null || str.equals("")
import java.util.ArrayList;
import java.util.Scanner;

public class Test01_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 100; i++) {// for1
			try {
				String str = sc.nextLine();
				if (str.length()==0) {
					break;
				} else if(str.length() > 100){
					break;
				} else {
					strList.add(str);
					
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
		} // end of for1

		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}

	}

}
