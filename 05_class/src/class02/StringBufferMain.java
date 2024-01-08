package class02;

import java.util.Scanner;


public class StringBufferMain {
	
	private int dan;
	
	
	public StringBufferMain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력 : ");
		dan = scan.nextInt();
		
	}
	
	public void display() {
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 1; i <= 9; i++) {
			//System.out.println(dan + "*" + i +"=" + dan*i);
			
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString());
			
			buffer.delete(0, buffer.length());
			
			
		}
	}
	
	
	public static void main(String[] args) {
		StringBufferMain sbf = new StringBufferMain();
		sbf.display();
	}

}



