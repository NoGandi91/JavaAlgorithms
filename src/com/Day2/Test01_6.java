package com.Day2;

/*
 * �Է¹��� ���ڸ� ����ϴ� ����1
 * �Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. 
�� ���� 100���ڸ� ���� ������, �� ���� �־����� �ʴ´�. ��, �� ���� �������� �������� �ʰ�, �������� ������ �ʴ´�.
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
