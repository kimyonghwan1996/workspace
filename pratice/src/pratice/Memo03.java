package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
//백준 9012
public class Memo03 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Character[] a = new Character[n];
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i<n; i++){

            if (a[0] == ')') {
                return ;
            }
            else if (a[i] == '(') {
                stack.push(a[i]);
            }
            else if ()
        }
    }
}
