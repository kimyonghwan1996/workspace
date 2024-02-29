package pratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice27 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자 카드의 개수 N 입력
        int n = Integer.parseInt(br.readLine());

        // 숫자 카드 정보를 저장하는 HashSet 생성
        HashSet<Integer> cardSet = new HashSet<>();
        
        // 숫자 카드 정보 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardSet.add(card);
        }

        // 몇 개의 숫자 카드를 구해야 하는지 M 입력
        int m = Integer.parseInt(br.readLine());

        // 구해야 하는 숫자 카드 목록 입력
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 각 숫자 카드의 개수를 저장하는 배열 생성
        int[] countArray = new int[m];

        // 구해야 하는 숫자 카드의 개수 계산
        for (int i = 0; i < m; i++) {
            int cardToFind = Integer.parseInt(st2.nextToken());
            if (cardSet.contains(cardToFind)) {
                countArray[i]++;
            }
        }

        // 결과 출력
        for (int count : countArray) {
            System.out.print(count + " ");
        }
    }
}
