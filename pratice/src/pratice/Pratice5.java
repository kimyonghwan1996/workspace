package pratice;

import java.util.Arrays;
import java.util.Scanner;

public class Pratice5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        //int max = Arrays.stream(ar).max().getAsInt(); //가장큰수

        for(int i = 0; i < ar.length; i++){
            ar[i] = sc.nextInt();
        }
        
        int max = Arrays.stream(ar).max().getAsInt(); //가장큰수
        //System.out.println(max);
        
        for(int i = 0; i < ar.length; i++){  
            //System.out.print(ar[i] + " ");
            if(ar[i] <= max) ar[i] = ar[i]*100/max;
            //System.out.print(ar[i] + " ");
        }
        
        double sum = 0;
        for(int i = 0; i < ar.length; i++){  
            sum += ar[i];
        }
        double average = sum / ar.length;
        System.out.println(average);

    }

}