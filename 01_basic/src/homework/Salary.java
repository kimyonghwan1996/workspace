package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 [문제] 월급 계산 프로그램 - 조건 연산자
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오



[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000


       
*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원

합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[조거ㅓㄴ]
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       ,표시
       소수 표시 x 
       */
public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("직급 입력 : ");
		String job = sc.next();
		System.out.println("기본급 입력 : ");
		int basic = sc.nextInt();
		System.out.println("수당 입력 : ");
		int extra = sc.nextInt();
		int tot = basic + extra;
		double rate = 5000000 <= tot ?  0.03 : tot >= 3000000 ? 0.02 : 0.01;  
		int tax = (int) (tot * rate);
		int salary = tot - tax;
 		System.out.println(""+ name + " " + job + " 월급");
		System.out.println("기본급 : " + new DecimalFormat().format(basic) + "원");
		System.out.println("수당 : " + new DecimalFormat().format(extra) + "원");
		System.out.println("합계 : " + new DecimalFormat().format(tot) + "원");
		System.out.println("세금 : " + new DecimalFormat().format(tax) + "원");
		System.out.println("월급 : " + new DecimalFormat().format(salary) + "원");
		

	}

}
