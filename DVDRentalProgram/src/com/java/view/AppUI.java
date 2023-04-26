package com.java.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppUI {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static String inputString() {
		return sc.nextLine();
	}
	
	public static int inputInteger() {
		int num = 0;
		try {
			num = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("정수로 입력해 주세요.");
		} finally {
			sc.nextLine();
		}
		
		return num;
	}
	
	//시작 화면 출력
	public static void startScreen() {
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m-------------------DVD 대여 관리 시스템!-------------------\u001B[0m");
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m-------------------1. 회원 관리 시스템-------------------\u001B[0m");
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m-------------------2. 대여 주문 관리 시스템-------------------\u001B[0m");
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m-------------------3. 영화 DVD 관리 시스템-------------------\u001B[0m");
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m-------------------4. 프로그램 종료-------------------\u001B[0m");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println(">>>");
	}
	
	//회원 관리 시스템 화면 출력
	public static void userManagementScreen() {
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m-------------------회원 관리 관리 시스템-------------------\u001B[0m");
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m-------------------1. 신규 회원 추가-------------------\u001B[0m");
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m-------------------2. 회원 검색-------------------\u001B[0m");
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m-------------------3. 회원 탈퇴-------------------\u001B[0m");
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m-------------------4. 첫 화면으로 가기-------------------\u001B[0m");
		System.out.println("\u001B[31;1;4;41;42;43;44;45;46m--------------------------------------\u001B[0m");
		System.out.println(">>>");
	}
	
	//대여 주문 관리 시스템 화면 출력
	
	//영화 관리 시스템 화면 출력
	public static void movieManagementScreen() {
        System.out.println("\n========= 영화 DVD 관리 시스템 =========");
        System.out.println("### 1. 신규 영화 DVD 추가");
        System.out.println("### 2. 영화 DVD 정보 검색");
        System.out.println("### 3. 첫 화면으로 가기");
        System.out.println("----------------------------------------");
        System.out.print(">>> ");
    }
	
	public static void orderManagementScreen() {
        System.out.println("\n========= 대여 주문 관리 시스템 =========");
        System.out.println("### 1. 영화 DVD 대여하기");
        System.out.println("### 2. 영화 DVD 반납하기");
        System.out.println("### 3. 첫 화면으로 가기");
        System.out.println("----------------------------------------");
        System.out.print(">>> ");
    }
}
