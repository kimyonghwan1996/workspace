package pratice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Pracitce31 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            TreeSet<Integer> pq = new TreeSet<>();
            
            for(int i = 0; i < n; i++){
                int m = Integer.parseInt(br.readLine());

                for(int j = 0; j < m; j++){
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    String str = st.nextToken();
                    int num = Integer.parseInt(st.nextToken());

                    if ("I".equals(str)) {
                        pq.add(num);
                    } else if ("D".equals(str) && !pq.isEmpty()) {
                        if (num == 1 ) {
                            pq.remove(pq.last());
                        } else if (num == -1 ) {
                            pq.remove(pq.first());
                        }
                    }

                }
                if (pq.isEmpty()) {
                    System.out.println("EMPTY");
                } 
                else {
                    bw.write(pq.last() + " " +pq.first() +"\n");
                }
                
            }
            bw.flush();
            bw.close();
        }
}
