package homework;
/*
[문제] 250을 저장한 후 2진수, 8진수, 16진수로 변환한 값을 출력하시오

[조건]
2진수, 8진수, 16진수로 변환시켜주는 메소드를 이용하시오 - Integer

[실행결과]
10진수 = 250 (dec)
2진수 = 1111 1010 (bin)
8진수 = 372 (oct)
16진수 = fa (hex)
 */
public class yonghwan {

	public static void main(String[] args) {
	int a = 250;
	String bin = Integer.toBinaryString(a);
	String hex = Integer.toHexString(a);
	String oct = Integer.toOctalString(a);
	String dec = Integer.toString(a);
	
	System.out.println("2진수 = " +bin);
	System.out.println("16진수 = " +hex);
	System.out.println("8진수 = " +oct);
	System.out.println("10진수 = " +dec);
	}

}
