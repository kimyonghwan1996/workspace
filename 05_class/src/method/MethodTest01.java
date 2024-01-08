package method;

public class MethodTest01 {
	
	public static void main(String[] args) {
		MethodTest01 m = new MethodTest01();
		System.out.println("객체 m = " + m); //참조값
		System.out.println("객체 m = " + m.toString());
		
		m.display(); // display 찍고 옴
		
		MethodTest01.output();
		m.output();
		output();
	} //먼저 진입/호출, 없으면 자바가상환경돌아감
	
	
	//구현
	public void display() {
		System.out.println("method");
	}
	
	public static void output() {
		System.out.println("static method");
	}
	
	

}
