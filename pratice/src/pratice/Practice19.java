package pratice;
import java.util.Scanner;

public class Practice19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        int cnt = 0;


        if (n%3 == 0 && n/3 > 0) count1 = n/3;
        else if(n%5 == 0 && n/5 > 0) count2 = n/5;

        if (count2 == 0 || count1 < count2) cnt = count1;
        else if (count1 == 0 || count2 < count1) cnt = count2;
        
        for(int i =0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(3*i + 5*j == n){
                    int count3 = i + j;
                if (count3 != 0 && cnt > count3) cnt = count3;
                }
            }
        }
        if (cnt != 0) System.out.println(cnt);
        else System.out.println(-1);
        
    }
}
