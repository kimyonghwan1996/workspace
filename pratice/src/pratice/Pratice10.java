package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pratice10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            String S = br.readLine();
            int cnt = 1;
            int sum = 0;

            for(int j = 0; j<S.length(); j++){
                if (S.charAt(j) == 'O') {
                    sum += cnt;
                    cnt++;
                    //System.out.println(cnt);
                }
                else cnt = 1;
            }
            System.out.println(sum);
			sum = 0;
        }

    }
}
