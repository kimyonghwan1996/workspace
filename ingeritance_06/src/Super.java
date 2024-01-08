package inheritance;

public class Super {
	protected double weight, height;
	
	public Super() {
		System.out.println("Super 기본생성자");
	}
	public Super(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	public void disp() {
		System.out.println(weight + "          " + height);
	}
}
