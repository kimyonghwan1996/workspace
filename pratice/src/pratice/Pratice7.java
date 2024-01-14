package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pratice7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 운동할 시간
        int m = Integer.parseInt(st.nextToken()); // 초기 맥박
        int M = Integer.parseInt(st.nextToken()); // 최대 맥박, X+T <= M
        int T = Integer.parseInt(st.nextToken()); // 운동 맥박
        int R = Integer.parseInt(st.nextToken()); // 휴식시 감소할 맥박
        int X = m; //변화될 맥박
        int cnt = 0;
        

        while (N != 0) {
            if (X + T <= M) {
                cnt ++;
                X += T;
                N --;
            }
            else if(X - R >= m){
                cnt ++;
                X -= R;
            }
            else if(X - R < m) {
                X = m;
                cnt ++;
            }
            else {
                System.out.println(-1); 
                return;
            }
        }

        System.out.println(cnt);
        
    }
}
