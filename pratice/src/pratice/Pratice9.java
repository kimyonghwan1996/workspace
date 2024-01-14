package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Pratice9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String[] input = new String[N];

        for(int i = 0; i < N; i ++){
            input[i] = br.readLine();
        }

        Comparator<String> comparator = Comparator
                .comparingInt(String::length) 
                .thenComparing(Comparator.naturalOrder());


        Set<String> treeSet = new TreeSet<>(comparator);

        for (String str : input) {
            treeSet.add(str);
        }           

        for (String e : treeSet) {
            System.out.print(e + " ");
        }

    }
}
