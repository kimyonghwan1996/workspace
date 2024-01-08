package multi;

import javax.swing.plaf.synth.SynthScrollPaneUI;

/*
----------------------------------------------------
이름		국어		영어		수학		총점		평균		학점
----------------------------------------------------
홍길동	90		95		100
프로도	100		89		75
라이언	75		80		48
----------------------------------------------------
학점
평균 90이상 A
평균 80이상 B
평균 70이상 C
평균 60이상 D
		 F
 */

public class MultiArray04 {

	public static void main(String[] args) {
		String[] name = {"홍길동","프로도","라이언"};
		int[][] jumsu = {{90,95,100,0},{100,89,76,0},{75,80,48,0}};
		double[] average = new double[3];
		char[] grade = new char[3];
		
		int num = 0;
		
		//System.out.println(grade);

		//총점
		for(int i = 0; i < jumsu.length; i++) {
			for(int j = 0; j < jumsu[i].length-1; j++) {
				jumsu[i][3] += jumsu[i][j];
				//System.out.println(grade[i][j]);
				}

		//평균
		
			average[i] = jumsu[i][3]/3;
			// 학점
			
			if(average[i] >= 90) grade[i] = 'A';
			else if(average[i] >= 80) grade[i] = 'B';
			else if(average[i] >= 70) grade[i] = 'C';
			else if(average[i] >= 60) grade[i] = 'D';
			else grade[i] = 'F';
		}
		System.out.println("------------");
		System.out.println("이름\t1\t2\t3\t총점\t평균\t학점");
		System.out.println("------------");
		for(int i = 0; i < jumsu.length; i++) {
			System.out.print(name[i] + "\t" );
			
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}

			System.out.println(String.format("%.2f",average[i]) + "\t" + grade[i]);
		}

	}

}
