package pratice;
import java.util.Collections;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pracitce31 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            PriorityQueue<Integer> reversePq =  new PriorityQueue<>(Collections.reverseOrder());
            
            for(int i = 0; i < n; i++){
                int m = Integer.parseInt(br.readLine());
                for(int j = 0; j < m; j++){
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    String str = st.nextToken();
                    int num = Integer.parseInt(st.nextToken());

                    if ("I".equals(str)) {
                        pq.add(num);
                    } else if ("D".equals(str) && !pq.isEmpty()) {
                        if (num == 1) {
                            reversePq.clear();
                            reversePq.addAll(pq);
                            reversePq.poll(); 
                            pq.clear();
                            pq.addAll(reversePq);
                              
                        } else if (num == -1) {
                            pq.poll();
                        }
                    }

                }
                if (pq.isEmpty()) {
                    System.out.println("EMPTY");
                } else {
                    reversePq.clear();
                    reversePq.addAll(pq);
                    System.out.println(reversePq.peek() + " " + pq.peek());
                }

            }
        
        }
    
}
