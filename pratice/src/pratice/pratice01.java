package pratice;

import java.util.Scanner;

public class pratice01 {

	/*
	 문제
영수증에 적힌,

구매한 각 물건의 가격과 개수
구매한 물건들의 총 금액
을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

입력
첫째 줄에는 영수증에 적힌 총 금액 
$X$가 주어진다.

둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 
$N$이 주어진다.

이후 
$N$개의 줄에는 각 물건의 가격 
$a$와 개수 
$b$가 공백을 사이에 두고 주어진다.

출력
구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
	 */

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 영수증에 적힌 총 금액 입력
	        int receiptTotal = scanner.nextInt();
	        int itemCount = scanner.nextInt();
	        scanner.nextLine(); // 개행 문자 처리

	        int calculatedTotal = 0;

	        // 각 물건의 가격과 개수로 계산한 총 금액 계산
	        for (int i = 0; i < itemCount; i++) {
	            int price = scanner.nextInt();
	            int quantity = scanner.nextInt();
	            scanner.nextLine(); // 개행 문자 처리

	            calculatedTotal += price * quantity; // 각 물건의 가격 * 개수를 누적하여 계산한 총 금액
	        }

	        // 계산된 총 금액과 영수증에 적힌 총 금액 비교 후 출력
	        if (calculatedTotal == receiptTotal) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }

	        scanner.close();
	    }
	}