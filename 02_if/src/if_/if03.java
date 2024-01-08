package if_;

import java.util.Scanner;

/*
 3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오 (if문 사용하시오)

[실행결과]
a의 값 : 98
b의 값 : 90
c의 값 : 85

85 90 98

a의 값 : 75
b의 값 : 25
c의 값 : 36

25 36 75
 */
public class if03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //기본 형식
		System.out.print("a : ");
		int a = scan.nextInt();
		System.out.print("b : ");
		int b = scan.nextInt();
		System.out.print("c : ");
		int c = scan.nextInt();
		
		if(a < b && b < c) System.out.println(c +"  "+ b+"  "+ a);
		else if (a < b && c < b ) System.out.println(b+"  " + c+"  " + a);
		else if (b < a && a < c ) System.out.println(c+"  " + a+"  " + b);
		else if (b < a && c < a ) System.out.println(a+"  " + c+"  " + b);
		else if (c < a && a < b ) System.out.println(b+"  " + a+"  " + c);
		//else if (c < a && b < a ) System.out.println(a + b + c);
		else System.out.println(a+"  " + b+"  " + c);
		/*
		 if (a<B && a<c) {
		 	if(b<c) System.out.print(a+"  " + b+"  " + c);
		 	else System.out.println(a+"  " + c+"  " + b);
		 	}
		 else if (b<c) {
		 	if(b<c) System.out.print(a+"  " + b+"  " + c);
		 	else System.out.println(a+"  " + c+"  " + b);
		 }
		 else {
		 	if(b<c) System.out.print(a+"  " + b+"  " + c);
		 	else System.out.println(a+"  " + c+"  " + b);
		 }
		 */

	}

}
