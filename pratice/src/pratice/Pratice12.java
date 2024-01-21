package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pratice12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        list.add(br.readLine().trim()); // trim()을 사용하여 양 끝의 공백 제거

        for (String str : list) {
            String[] tokens = str.split(" ");
            ArrayList<String> trimmedTokens = new ArrayList<>();

            for (String token : tokens) {
                if (!token.isEmpty()) {
                    trimmedTokens.add(token);
                }
            }
            System.out.println(trimmedTokens.size());
        }
        
    }
}