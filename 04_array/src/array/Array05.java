package array;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		boolean [] ar = new boolean[5];
		int in, parking, data;
		Scanner scan = new Scanner(System.in);
		
		while (true) {
		    System.out.println("******************");
		    System.out.println("1. 입차");
		    System.out.println("2. 출차");
		    System.out.println("3. 리스트");
		    System.out.println("4. 종료");
		    System.out.println("******************");
		    System.out.println("메뉴");

			in = scan.nextInt();
			
			if (in == 4) break;
			
			//입차
			if (in == 1) {
				System.out.println("위치 입력 :");
				
				int a = scan.nextInt();

				if (ar[a-1]) System.out.println("다른자리 뽑아주세요");
				else {
					ar[a-1] = true;
					System.out.println("입차");
					
				}
				
			}
			//출차
			else if (in == 2) {
				System.out.println("위치 입력 :");
				int a = scan.nextInt();

				if (ar[a-1]) {ar[a-1] = false;
					System.out.println("출차");}
				else {
					ar[a-1] = false;
					System.out.println("주차되어있지않습니다.");
					}}
			
			//리스트
			else if (in == 3) {
				for(int i =0; i<ar.length; i++) {
					System.out.println((i+1) +"위치"+ ar[i]);
				}
				
			}
		    
		}
		System.out.println("프로그램 종료");
/*
		Scanner scan = new Scanner(System.in);
		System.out.println("입차 위치 입력 : ");
		int in = scan.nextInt();
		*/

	}

}
