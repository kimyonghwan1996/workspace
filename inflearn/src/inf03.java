import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf03 { //dna비밀번호 - 백준12891 다시풀기
    static int[] check2;
    static int[] check;
    static int checkSec;
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        check = new int[4];
        check2 = new int[4];
        char[] a = new char[S];
        checkSec = 0;
        a = bf.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<4; i++){
            check[i] = Integer.parseInt(br.readLine());
            if (check[i] == 0) {
                checkSec++;
            }
        }

        for(int i = 0; i < P; i++){
            Add(a[i]);
        }
        if (checkSec == 4) {Result++;
            
        }
        for(int i = P; i<S; i++){
            int j = i-P;
            Add(a[i]);
            Remove(a[j]);
            if (checkSec == 4) {Result++;}
        }
        System.out.println(result);
        bf.close();
    }
    private static void Add(char c){
        switch (c) {
            case "A":
                
                if (check2[0] == check[0]) checkSec++;
                check2[0]++;
                break;
            case "C":
            
                if (check2[1] == check[1]) checkSec++;
                check2[1]++;
                break;
            case "G":
            
                if (check2[2] == check[2]) checkSec++;
                check2[2]++;
                break;
            case "T":
            
                if (check2[3] == check[3]) checkSec++;
                check2[3]++;
                break;

        }
    }
    private static void Remove(char c){
        switch (c) {
            case "A":

                if (check2[0] == check[0]) checkSec--;
                check2[0]--;
                break;
            case "C":
            
                if (check2[1] == check[1]) checkSec--;
                check2[1]--;
                break;
            case "G":
            
                if (check2[2] == check[2]) checkSec--;
                check2[2]--;
                break;
            case "T":
            
                if (check2[3] == check[3]) checkSec--;
                check2[3]--;
                break;

        }
    }
}
