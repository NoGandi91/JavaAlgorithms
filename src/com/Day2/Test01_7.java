package com.Day2;


/*
 * ����
�Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. 
�� ���� 100���ڸ� ���� ������, �� ���� �־��� ���� �ְ�, �� ���� �� �ڿ� ������ ���� ���� �ִ�.
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
