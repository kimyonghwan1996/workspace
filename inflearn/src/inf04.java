import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf04 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = Integer.parseInt(br.readLine());
        }
    }
}
