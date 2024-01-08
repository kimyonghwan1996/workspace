package Variable01;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //기본 형식
		
		System.out.print("정수 입력 : ");
		int a = scan.nextInt();
		System.out.print("실수 입력 : ");
		double b = scan.nextDouble();
		
		System.out.println(a + "+" + b + "=" + (a+b) );
	}

}
