package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice15 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        sb.append((int)(Math.pow(2, n)-1)).append('\n');
        System.out.print(sb);
        Hanoi(n,1,2,3);
        
    }

    public static void Hanoi(int N,int start, int mid, int to){
            StringBuilder sb = new StringBuilder();
            if (N == 1) {
                sb.append(start + " " + to +"\n");
                System.out.print(sb);
                return;
            }

            // A -> C로 옮긴다고 가정할 떄,
            // STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
            Hanoi(N - 1, start, to, mid);
            
            // STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
            sb.append(start + " " + to + "\n");
            System.out.print(sb);
            // STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
            Hanoi(N - 1, mid, start, to);
            
        }
}