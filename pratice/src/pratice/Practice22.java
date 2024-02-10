package pratice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Practice22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] arr = new String[n][m];

        // 체스판 입력 받기
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.substring(j, j + 1);
            }
        }

        // 첫 번째 칸이 'W'로 시작하는 경우와 'B'로 시작하는 경우 두 가지를 고려
        int minChanges = Integer.MAX_VALUE;
        String[] pattern1 = {"W","B","W","B","W","B","W","B"};
        String[] pattern2 = {"B","W","B","W","B","W","B","W"};

        for (int startRow = 0; startRow <= n - 8; startRow++) {
            for (int startCol = 0; startCol <= m - 8; startCol++) {
                int changes1 = countChanges(arr, startRow, startCol, pattern1);
                int changes2 = countChanges(arr, startRow, startCol, pattern2);
                minChanges = Math.min(minChanges, Math.min(changes1, changes2));
            }
        }

        System.out.println(minChanges);
    }

    // 주어진 패턴과 실제 체스판을 비교하여 변경이 필요한 개수를 반환
    private static int countChanges(String[][] arr, int startRow, int startCol, String[] pattern) {
        int changes = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!arr[startRow + i][startCol + j].equals(pattern[j])) {
                    changes++;
                }
            }
            // 패턴이 바뀌는 부분에서는 pattern 배열의 인덱스를 조절하여 계속 사용
            String temp = pattern[0];
            for (int k = 0; k < 7; k++) {
                pattern[k] = pattern[k + 1];
            }
            pattern[7] = temp;
        }

        return changes;
    }
}
