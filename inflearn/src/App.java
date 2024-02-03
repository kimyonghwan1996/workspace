import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Integer.parseInt(br.readLine());
        long[] ar = new long[n];
        for(int i = 0; i < n; i++){
            ar[i] = Long.parseInt(br.readLine());
        }
    }
}
