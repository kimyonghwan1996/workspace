package inheritance;

public class Submain extends Super{
	
	protected String name;
	protected int age;
	
	public Submain() {
		System.out.println("submain 기본생성자");
	}
	
	public Submain(String name, int age, double weight, double height) {
		//부모생성자 호출, 무조건 첫째줄
		super(weight, height);
		
		System.out.println("submain 생성자");
		this.name = name;
		this.age = age;
		//this.weight = weight;
		//this.height = height;
		//super.weight = weight;//부모의 참조값을 얻음
		//super.height = height;//부모의 참조값을 얻음
	}
	public void output() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(height);
		disp();
	}

	public static void main(String[] args) {
		Submain aa = new Submain("dd",10,10,100);
		
		aa.output();
		System.out.println("-------------------");
		
		aa.disp();
		System.out.println();

		
		Super bb = new Submain("코난", 13, 45.8, 153.6); 
		
		
		
		
	}

}
