package homework;

import java.util.Scanner;

public class ExamMain {
	
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수 입력 : ");
		int n = scan.nextInt();
		
		Exam[] ar = new Exam[n];
		for(int i = 0; i < ar.length; i++) {
			
			System.out.println("이름 입력 : ");
			String x = scan.next();
			System.out.println("답 입력 : ");
	        String y = scan.next();
	        
			ar[i] = new Exam(scan, x, y);
			
			ar[i].compare();
			for(int j = 0; j<ar[i].getOX().length ; j++ ) {
				//System.out.println(ar[i].getOX()[j]);
			}
			//System.out.println(ar[i].getScore());
		}
		System.out.println("이름\t1\t2\t3\t4\t5\t점수");
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i].getName() + "\t");
			ar[i].printOX();
			System.out.print(ar[i].getScore()+"점");
			}
	}
}