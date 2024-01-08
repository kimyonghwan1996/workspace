package array;

public class Array01 {

	public static void main(String[] args) {
		int ar[]; // or int[] ar;
		ar = new int[5]; //주소, 배열명
		
		ar[0] = 25;
		ar[1] = 43;
		ar[2] = 30;
		ar[3] = 27;
		ar[4] = 52;
		
		//System.out.println(ar.length);
		
		/*
		for(int i = 0; i < ar.length; i++) { //or i <4
			System.out.println(ar[i]);
		}
		*/
		/*
		for(int i = ar.length-1; i >= 0; i--) { //역순
			System.out.println(ar[i]);
			*/
		for(int i = 0; i < ar.length; i++) { 
			if (ar[i]%2 == 1) System.out.println(ar[i]);
			//else continue;	
		System.out.println();
		
		System.out.println("확장 for문");
		for(int data : ar) {
			System.out.println(data); //특정 배열 데이터를 못뺌
		}
		
		
		
		}
	}

}
