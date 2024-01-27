package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Permutation<T> {
        private int n;
        private int r;
        private int[] now;
        private boolean[] visited;
        private List<List<T>> result;

        public List<List<T>> getResult() {
            return result;
        }

        public Permutation(int n, int r) {
            this.n = n;
            this.r = r;
            this.now = new int[r];
            this.visited = new boolean[n];
            this.result = new ArrayList<>();
        }
    
        public void permutation(List<T> list, int depth) {
            if (depth == r) {
                List<T> temp = new ArrayList<>();
                for (int i = 0; i < now.length; i++) {
                    temp.add(list.get(now[i]));
                }
                result.add(temp);
                return;
            }
    
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    now[depth] = i;
                    permutation(list, depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
public class Practice17 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            list.add(i, Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        Permutation<Integer> perm = new Permutation<>(list.size(), n);
        perm.permutation(list, 0);
        List<List<Integer>> result = perm.getResult();

        int max = 0;
        
        for (List<Integer> set : result) {
            int sum = 0;
            for (int i = 0; i < set.size()- 1; i++) {
                sum += Math.abs(set.get(i) - set.get(i + 1));
            }
            if(sum > max) max = sum;
            
        }
        System.out.println(max);
    }
}
