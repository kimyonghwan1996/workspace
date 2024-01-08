package Variable01;

public class Variable01 {

	public static void main(String[] args) {
		boolean a;
		a = true;
		System.out.println("a = " + a);
		
		char b;
		b = 'A';
		System.out.println("b = " + b);
		
		char c;
		c = 13319;
		System.out.println("c = " + c);
		
		int d;
		d = 65;
		System.out.println("d = " + d);

		int e;
		e = 'A'; 
		System.out.println("e = " + d + e);
		
		long f;
		f = 25L; //long형 상수?, 25L or 25l
		System.out.println("f = " + f);
		
		float g;
		// 에러남 g = 43.5; //43.5 double형
		g = 43.5f; //float형
		g = (float)43.5; //강제형 변환
		System.out.println("g = " + g);

	}

}
