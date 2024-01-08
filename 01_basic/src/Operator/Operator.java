package Operator;
import java.util.Scanner;
public class Operator {

	public static void main(String[] args) {
		int money;
		Scanner scan = new Scanner(System.in); //기본 형식
		
		System.out.print("정수 입력 : ");
		int a = scan.nextInt();
		int b = a/1000;
		int c = (a%1000)/100; 
		int d = (a%100)/10;
		int e = (a%100)%10;
		/*
		 
		 */
		//System.out.println(a + "=" + a );
		System.out.println("1000 =" +b + "\t 100 =" + c + "\t 10 =" + d + "\t 1 =" +e);
	}

}
