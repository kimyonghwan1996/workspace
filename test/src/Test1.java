import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[4][2];
        
        for(int i = 0; i < 3; i ++){
            ar[i][0] = sc.nextInt();
            ar[i][1] = sc.nextInt();
        }

        if (ar[0][0] == ar[1][0]) {
            ar[3][0] = ar[2][0];
        }
        else if(ar[0][0] == ar[2][0]){
            ar[3][0] = ar[1][0];
        }
        else ar[3][0] = ar[0][0];

        if (ar[0][1] == ar[1][1]) {
            ar[3][1] = ar[2][1];
        }
        else if(ar[0][1] == ar[2][1]){
            ar[3][1] = ar[1][1];
        }
        else ar[3][1] = ar[0][1];

        System.out.println(ar[3][0] + " " + ar[3][1]);
    }
}
