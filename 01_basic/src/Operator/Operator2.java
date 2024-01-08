package Operator;

import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //기본 형식
		
		System.out.print("정수 입력 : ");
		int score = scan.nextInt();
		System.out.println(score <= 100 && score >= 80);
		String result  = score >= 80 && score <= 100 ? "합격" : "불합격"; //true : false
		System.out.println(result);
	}

}
