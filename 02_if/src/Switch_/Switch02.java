package Switch_;

import java.io.IOException;
import java.util.Scanner;

/*
 2개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오

[실행결과]
a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : +

25 + 36 = xx

a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : /

25 / 36 = 0.6944444444444444

a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : #

연산자 error
 */
public class Switch02 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("a 입력 : ");
		int a = scan.nextInt();
		System.out.println("b 입력 : ");
		int b = scan.nextInt();

		
		System.out.print("c 입력 : ");
		char op = (char)System.in.read(); //한개의 문자만 받을 수 있다.
		System.in.read();
		
		
		switch (op){
		case '+': System.out.println(a + b); break;
		case '-': System.out.println(a - b); break;
		case '/': System.out.println(a/b); break;
		case '*': System.out.println(a*b); break;
		}
		
		
	}

}
