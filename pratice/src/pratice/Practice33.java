package pratice;

import java.util.Scanner;

public class Practice33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] ar = new int[n][m];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        int v = ar[0][0]; // 탐색을 시작할 정점의 번호 (출발지)
		int end = ar[n][m]; // 탐색을 끝낼 정점의 번호 (목적지)

    }
}
