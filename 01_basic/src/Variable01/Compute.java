package Variable01;

import java.text.DecimalFormat;


/*
[문제] 변수를 이용하여 320, 258의 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오

*/

public class Compute {
	//short a; //필드
	public static void main(String[] args) {
		short a = 320; //지역변수 
		short b= 258;
		
		short sum = (short)(a + b);
		System.out.println(a + "+" +b + "=" + sum);

		short sub = (short)(a - b);
		System.out.println(a + "-" +b + "=" + sub);
		
		int mul = a * b;
		System.out.println(a + "*" +b + "=" + new DecimalFormat().format(mul));
		
		double div = (float)a / b; //강제형변환 / 자동형변환
		System.out.println(a + "/" +b + "=" + div);
		System.out.println(a + "/" +b + "=" + String.format("%.2f",div));
		
	}
}
