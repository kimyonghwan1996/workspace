package Operator;

public class Operator5 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a); //false
		System.out.println("!a = " + !a); //true
		
		System.out.println(); 
		
		String b = "apple";
		String c = new String("apple");
		
		System.out.println((b == c ? "같" : "다")); //주소비교
		System.out.println((b != c ? "참" : "거")); //주소비교
		
		System.out.println((b.equals(c) ? "같" : "다")); //문자열 (appple) 비교
		System.out.println((!b.equals(c) ? "같" : "다")); //문자열 (appple) 비교
	}

}
