package constructor;

import java.util.Scanner;


public class ComputeMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Compute[] ar = new Compute[3];
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println("x 입력 : ");
			int x = scan.nextInt();
			System.out.println("y 입력 : ");
	        int y = scan.nextInt();
	        ar[i] = new Compute(x,y);
	        ar[i].calc();
	        }
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i].getX() + "\t" + ar[i].getY()+ "\t"+
					ar[i].getSum() +  "\t" + ar[i].getSub()
					+  "\t" + ar[i].getMul()
					+  "\t" + String.format("%.2f",ar[i].getDiv()));
			}
	        
		
		
		/*
		for(Compute data : ar) {
			System.out.println("x 입력 : ");
			int x = scan.nextInt();
			System.out.println("y 입력 : ");
	        int y = scan.nextInt();
			data  = new Compute(x,y);
	        data.calc();
		}
		
		for(Compute data : ar) {
			System.out.println(data.getX()+"\t"+data.getY()+"\t"
			+data.getSum()+"\t"+data.getSub()+"\t"+data.getMul()
			+"\t"+data.getDiv());
			}
			*/
		/*
		Compute aa = new Compute(320,258);
		Compute bb = new Compute(320,258);
		bb.calc();
		
		System.out.println(aa.getX() + "\t" + aa.getY()+ "\t"+
				bb.getSum() +  "\t" + bb.getSub()
				+  "\t" + bb.getMul()
				+  "\t" + bb.getDiv());
*/
	}

}


/*
[문제] 합, 차, 곱, 몫을 구하시오
- main 함수에서 데이터를 입력 받는다.
- 몫은 소수이하 2째자리까지 처리
- 객체 배열

클래스명 : Compute
필드   : x, y, sum, sub, mul, div
메소드  : 생성자(x, y)
        calc() - 합, 차, 곱, 몫을 계산
        getX()
		getY()
		getSum()
		getSub()
		getMul()
		getDiv()

[실행결과]
x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X		Y		SUM		SUB		MUL		DIV
320		258
256		125
452		365

*/
