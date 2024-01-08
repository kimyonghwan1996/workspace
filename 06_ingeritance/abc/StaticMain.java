package class02;


class StaticTest{
	private int a; //필드, 인스턴스 변수
	private static int b; //필드, 클래스 변수
	
	static {
		System.out.println("static 초기화 영역");
		b = 7;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자" );
		this.a = 7;
	}
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = " + this.a + " b = " + StaticTest.b);
	}
	
	public static void output() {
		System.out.println("static method...");
		// System.out.println("a = " + this.a + " b = " + StaticTest.b); static메소드에서는 this를 참조할 수 없다
		
	}
	
	
}
//---------




public class StaticMain {

	public static void main(String[] args) {
		StaticTest aa = new StaticTest(); //new 보다 빨리 실행
		aa.calc();
		aa.disp();
		System.out.println();
		
		StaticTest bb = new StaticTest(); //new 보다 빨리 실행
		bb.calc();
		bb.disp();
		System.out.println();
				
		StaticTest cc = new StaticTest(); //new 보다 빨리 실행
		cc.calc();
		cc.disp();
		System.out.println();
		
		StaticTest.output();
		aa.output();
		System.out.println("안녕하세요");
				
		
		
	}

}
