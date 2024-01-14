package pratice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.Scanner;
import java.util.Set;


public class Pratice04 {
    public static void main(String[] args) {
        
        /* 
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[3];
        for(int i = 0; i < ar.length; i ++){
           ar[i] = sc.nextInt();
        }

        for(int i = 0; i < ar.length; i ++){
            ar[i] = 42%ar[i];
            //System.out.print(ar[i] + " ");
        }
        int[] ar2 = IntStream.of(ar).distinct().toArray();
        
        System.out.println(Arrays.toString(ar2).length());
        */

        Scanner sc = new Scanner(System.in);
        Set<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("숫자를 입력하세요: ");
            int num = sc.nextInt();
            remainders.add(num % 42);
        }

        System.out.println(remainders.size());
    }
}


