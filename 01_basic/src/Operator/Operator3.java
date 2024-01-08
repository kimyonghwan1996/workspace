package Operator;

public class Operator3 {

	public static void main(String[] args) {
		int a = 5;
		a += 3; //이전 a + 3
		a *= 2; //이전 a * 2
		++a;
		System.out.println(a);
		int b = a++;
		System.out.println(a +"   "+ b);
		int c = ++a - b--;
		System.out.println(a +"   "+ b +"   "+ c); //1. ++a 2.int c 3. b--
		
	}

}
