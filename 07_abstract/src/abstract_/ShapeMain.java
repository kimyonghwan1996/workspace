package abstract_;

import java.util.Scanner;

abstract class ShapeTest{
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	
	public ShapeTest() {
		System.out.println("ShapeTest 기본생성자");
	}
	public abstract void calcArea(); //추상메소드
	
	public abstract void dispArea(); //추상메소드
	
}
//------------------------------
class SamTest extends ShapeTest{
	protected int base, height;
	
	public SamTest() {
		System.out.println("Triangle ShapeTest 기본생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	
	@Override
	public void calcArea() {
		area = base * height/ 2.;
		
	}
	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 : " + area);
	}
	
}
//------------------------------
class SaTest extends ShapeTest{
	protected int width, height;
	
	public SaTest() {
		System.out.println("Square ShapeTest 기본생성자");
		System.out.print("가로 : ");
		width = scan.nextInt();
		System.out.print("세로 : ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area = width * height;
		
	}
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 : " + area);
	}
	
}

//------------------------------
class SadariTest extends ShapeTest{
	protected int top, bottom, height;
	
	public SadariTest() {
		System.out.println("Sadari ShapeTest 기본생성자");
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("밑변 : ");
		bottom = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area = (top + bottom) * height/ 2.;
		
	}
	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 : " + area);
	}
	
}

//------------------------------
public class ShapeMain {

	public static void main(String[] args) {
		
		ShapeTest shape; // 리모컨역할
		shape = new SamTest();
		shape.calcArea();
		shape.dispArea();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		
	}

}
