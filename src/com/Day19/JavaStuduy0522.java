package com.Day19;

import java.util.Scanner;
import java.util.Arrays;

public class JavaStuduy0522 {
	public static String[][] seat = new String[6][9];

	public static void resetSeat() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 9; j++) {

				seat[i][j] = "O";
			}
		}
	}

	public static void selectSeat(int a, int b) {
		seat[a][b] = "V";
	}

	public static void viewSeat() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 9; j++) {

				System.out.print(seat[i][j]);
				if(seat[i][j]=="V") {
					seat[i][j]="X";
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		System.out.println("���� ���� �ý���");
		resetSeat();

		Scanner sc = new Scanner(System.in);
		int a, b;

		while (true) {
			System.out.println("������ �����Ͻðڽ��ϱ�?(y/n):");
			String ck = sc.next();
			if (ck.equals("y") || ck.equals("Y")) {
				System.out.println("O:���Ű���  X:���źҰ� V:���ż���" ); 
				viewSeat();
				System.out.print("���� �����ϼ���->");

				a = sc.nextInt();

				System.out.print("���� �����ϼ���->");

				b = sc.nextInt();

				if (seat[a][b].equals("O")) {

					System.out.println(a + "��" + b + "�� �¼��� ����Ǿ����ϴ�.");

					selectSeat(a, b);

				}
				viewSeat();
			} else if (ck.equals("n") || ck.equals("N")) {
				System.out.println("������ �����մϴ�");
				System.exit(0);
			} else {
				System.out.println("�ٽ� �Է��� �ּ���");
			}
		}

	}
}