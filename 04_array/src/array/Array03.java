package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum =0;
		System.out.println("배열 크기 입력 : ");
		int size = scan.nextInt();
		
		int ar[] = new int[size]; //주소, 배열명

		
		for(int i = 0; i < size; i++) {
			System.out.println("ar 입력 : " + i);
			ar[i] = scan.nextInt();
			sum += ar[i];
		}
		
		for(int data : ar) {
			System.out.println(data + "  ");
		}
		System.out.println();
		System.out.println("합" + sum);
		
		
	}

}
