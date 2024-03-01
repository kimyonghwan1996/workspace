package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Practice30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashSet<String> hs = new HashSet<>();
        
        for(int i = 0; i < str.length(); i ++){
            for(int j = i+1; j <= str.length(); j++){
                String a = str.substring(i,j);
                if (!hs.contains(a)) {
                    hs.add(a);
                }
            }
        }

        System.out.println(hs.size());

    }
}
