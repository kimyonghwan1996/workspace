package array;

public class Selectionsort {

	public static void main(String[] args) {
		int[] ar = {35, 48, 25, 72, 50};
		
		System.out.println("정렬전 : ");
		for(int data : ar) {
			System.out.print(data + "  ");
		}
		System.out.println();
		
		System.out.println("정렬 후 : ");
		for(int data : ar) {
			System.out.print(data + "  ");
		}
		System.out.println();
		for(int i=0; i<ar.length-1; i++) { // 등호바꾸면 내림차순
			for(int j= i+1; j<ar.length; j++) {
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
					
				}
			}
		}
	}

}


/*
 -오름차순 (ascending) : 1,2,3..
 -내림차순 (descending) : 3,2,1...
 */
