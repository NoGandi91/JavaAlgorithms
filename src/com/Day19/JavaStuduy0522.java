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
		// TODO 자동 생성된 메소드 스텁
		System.out.println("극장 예약 시스템");
		resetSeat();

		Scanner sc = new Scanner(System.in);
		int a, b;

		while (true) {
			System.out.println("예약을 진행하시겠습니까?(y/n):");
			String ck = sc.next();
			if (ck.equals("y") || ck.equals("Y")) {
				System.out.println("O:예매가능  X:예매불가 V:예매성공" ); 
				viewSeat();
				System.out.print("열을 선택하세요->");

				a = sc.nextInt();

				System.out.print("행을 선택하세요->");

				b = sc.nextInt();

				if (seat[a][b].equals("O")) {

					System.out.println(a + "열" + b + "행 좌석이 예약되었습니다.");

					selectSeat(a, b);

				}
				viewSeat();
			} else if (ck.equals("n") || ck.equals("N")) {
				System.out.println("예약을 종료합니다");
				System.exit(0);
			} else {
				System.out.println("다시 입력해 주세요");
			}
		}

	}
}