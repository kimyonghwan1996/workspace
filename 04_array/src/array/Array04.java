package array;

public class Array04 {

	public static void main(String[] args) {
		int[] ar = new int[10];
		int max, min;
		
		for(int i=0; i < ar.length; i++) {
			ar[i] = (int)(Math.random()*100 + 1);
			System.out.println(ar[i]);
			}
		
		max = ar[0];
		min = ar[0];
		
		for(int i=0; i < ar.length; i++) {
			if(ar[i] > max)max = ar[i];
		}
		System.out.println(max);
		for(int data : ar) {
			System.out.println(data + "  ");
			}
		for(int i=0; i < ar.length; i++) {
			if(ar[i] < max)max = ar[i];
			}
			System.out.println(min);
		
	}

}
