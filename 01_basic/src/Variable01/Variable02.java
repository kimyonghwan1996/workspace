package Variable01;

public class Variable02 {
	int a; //필드, 초기값설정, 인스턴스 변수
	static int b; //필드, 클래스 변수
	static double c;
	static String str;
	
	public static void main(String[] args) {
		int a = 100; //지역변수
		System.out.println("지역함수 a = " +a);
		System.out.println("필드 a = " + new Variable02().a);
		System.out.println("필드 b = " + Variable02.b);
		System.out.println("필드 c = " + c);
		System.out.println("필드 str = " + str);
	}

}
