package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(br.readLine());
        
        //String[] ar = new String[];
        for(int i =0; i < n; i++){
            
            String str = "";
            int m = Integer.parseInt(br.readLine());
            String z = st.nextToken();
            String ar[] = z.split("");
            

            for (int j = 0; j < ar.length; j++){
                str += ar[j].repeat(m);
             }
            System.out.println(str);
        }
        
       
    }
}
