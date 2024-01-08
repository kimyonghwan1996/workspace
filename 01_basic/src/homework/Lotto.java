package homework;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean duplicate;
		int random;
		int[] lotto= new int[6];
		
		System.out.println("현금 입력 : ");
		int money = scan.nextInt();
		int lottocount = money/1000;
		
		for(int k = 0; k < lottocount; k++) {
			for (int j = 0; j <lotto.length; j++) {
				do {
					duplicate = false;
					random = (int)(Math.random()*45+1);
					for(int i = 0; i<j; i++) {
						if(lotto[i] == random) {
							duplicate = true;}}
					}
				while(duplicate);
				lotto[j] = random;}
						
				
		
			for(int a=0; a<lotto.length-1; a++) { // 등호바꾸면 내림차순
				for(int b= a+1; b<lotto.length; b++) {
					if(lotto[a] > lotto[b]) {
						int temp = lotto[a];
						lotto[a] = lotto[b];
						lotto[b] = temp;}}
				}
			for(int data : lotto) {
				System.out.print(data + "  ");
				}
			System.out.println();
			}
	}
}


/* 강사님 솔루션
			Scanner scan = new Scanner(System.in);
			System.out.println("현금 입력 : ");
			int money = scan.nextInt();
			
			for(int k=1; k<=money/1000; k++) {
				for(int i = 0; i <lotto.length; i++) {
					lotto[i] = (int)(Math.random()*45+1);
					for(int j =0; j<i; j++){
						if(lotto[i] == lotto[j]){i--; continue or break;}
						}}} //난수
					for(int i=0; i<lotto.length-1; i++) { // 등호바꾸면 내림차순
					for(int j= i+1; j<lotto.length; j++) {
						if(lotto[i] > lotto[j]) {
							int temp = lotto[i];
							lotto[i] = lotto[j];
							lotto[j] = temp; //정렬
							
					for(int data : lotto) {
					System.out.print(String.format(""%4d,data));
					System.out.println();
					
					if(k%5 == 0) System.out.println(); //5줄씩
					}//출력
					}
*/


/*
1~ 45, 난수, 숫자 중복 x
입력 : 3000
내림차순?
2	3	4	5	6	7
2	3	4	5	6	7
2	3	4	5	6	7
*/
