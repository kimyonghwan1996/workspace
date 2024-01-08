package Variable01;

public class Variable03 {

	public static void main(String[] args) {
		int max = Math.max(25, 36);
		System.out.println(max);
		
		double min = Math.min(12.3, 12.5);
		System.out.println(min);
		System.out.println();
		
		int sum = 2 + 5;
		System.out.println(sum);
		int sum2 = '2'-48 + '5'- '0';
		System.out.println(sum2);
		
		int sum3 = Integer.parseInt("2")+Integer.parseInt("5");
		System.out.println(sum3);
		
		float a = Float.parseFloat("43.8f");
		double b = Double.parseDouble("43.8");
		System.out.println(a + b);
		System.out.println();
		
		double c = Math.random();
		System.out.println(c);
		int d = (int)(Math.random()*26+65);
		System.out.println(d);
		System.out.println((char)d);
		
		//double e = new Random().nextDouble();
		//System.out.println((char)e);
	}

}


/*
난수
->컴퓨터가 불규칙하게 발생하는 수
-> 
x~y 사이 난수
(int)Math.random() * (y-x+1)+x
 */