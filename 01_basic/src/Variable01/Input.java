package Variable01;

import java.io.IOException;

public class Input {

	public static void main(String[] args) throws IOException {
		System.out.print("정수 입력 : ");
		int a = System.in.read(); //한개의 문자만 받을 수 있다.
		System.in.read();
		System.in.read(); //플러쉬(?)
		
		System.out.print("정수 입력 : ");	
		int b = System.in.read(); //한개의 문자만 받을 수 있다.
		
		System.out.println(a + "+" + b + "=" + (a+b)); 
		
	}

}
