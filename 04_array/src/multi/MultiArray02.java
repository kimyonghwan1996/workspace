package multi;

public class MultiArray02 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10];
		int num =0;
		/*
		ar[9][9] = 1;
		ar[9][9] = 2;
		
		ar[9][8] = 11;
		ar[8][8] = 12;
		
		ar[9][7] = 21;
		ar[7][7] = 22;
		
		
		*/
		/*
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0;j < ar[i].length; j++) {
				num++;
				ar[i][j] = num;}
			//  ar[j][i] = num;}
		}
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(String.format("%5d", ar[i][j]));}
			System.out.println();
		}
		*/
		
		for(int i = ar.length-1; i >= 0; i--) {
			for(int j = ar[i].length-1;j >= 0; j--) {
				num++;
			//	ar[i][j] = num;}
				ar[j][i] = num;}
		}
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				System.out.print(String.format("%5d", ar[i][j]));}
			System.out.println();
		}

	}

}
