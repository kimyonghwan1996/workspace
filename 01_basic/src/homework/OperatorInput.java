package homework;

import java.io.IOException;

/*
 [문제] 문자를 입력하여 대문자이면 소문자로 변경 후 출력하고
만약에 대문자가 아니면 대문자로 변경 후 출력하시오

[조건]
System.in.read(), 조건연산자를 사용하시오

[실행결과]
문자 입력 : T
T -> t

또는 

문자 입력 : e
e -> E
32차이
 */
public class OperatorInput {

	public static void main(String[] args) throws IOException {
		System.out.print("입력 : ");
		int a = System.in.read(); //한개의 문자만 받을 수 있다.
		System.out.println(a >= 97 );
		int result  = (a >= 97)? a - 32 : a + 32;
		char result2 = (char) result;
		System.out.println(result2);

	}

}
