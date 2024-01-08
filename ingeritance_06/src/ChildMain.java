package inheritance;

public class ChildMain  extends Super{
	
	protected String name;
	protected int age;
	
	public ChildMain() {
		System.out.println("submain 기본생성자");
	}
	
	public ChildMain(String name, int age, double weight, double height) {
		System.out.println("submain 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;//부모의 참조값을 얻음
		super.height = height;//부모의 참조값을 얻음
	}
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("몸무게 : " + weight);
		System.out.println("키 : " + height);
	}
	
	public static void main(String[] args) {
		
		ChildMain aa = new ChildMain("코난", 13, 45.8, 153.6);
		aa.disp();
		System.out.println();
		
		Super bb =new ChildMain("홍길", 113, 145.8, 1153.6);
		bb.disp();
	}

}
