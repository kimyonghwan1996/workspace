package pratice;

import java.util.Scanner;

public class Memo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sN = sc.next();
        char[] arr = sN.toCharArray();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i] - '0';
        }
        System.out.println(sum);
    }
}
