package class02;

import java.util.Arrays;

import static java.lang.Math.random;
import static java.lang.Math.pow;

import static java.lang.String.format;

import static java.lang.System.out;

import static java.util.Arrays.sort;

public class ImportStatic {
	public static void main(String[] args) {
		out.println("난수 : " + random());
		out.println("제곱 : " + pow(3, 4)); // 3의 4제곱
		
		out.println("소수이하 2째자리 : " +  format("%.2f", 34.789)); 
		
		int[] ar = {25,37,20,78,55};
		Arrays.sort(ar);
		
		for(int data : ar)System.out.print(data + "\t");
	}
}
