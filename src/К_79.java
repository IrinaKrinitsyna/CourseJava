// Робот К-79 https://acmp.ru/index.asp?main=task&id_task=235

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class К_79 {
    public static void main() {
        String route = "SSLSLSLSSRSRS";

        int[][] dirs = {{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
        int orientation = 0;        // стартуем «на север»
        int x = 0, y = 0;           // стартовая клетка

        boolean[][] visited = new boolean[201][201];
        visited[100][100] = true;  // стартовая клетка уже посещена

        int steps = 0;
        int ans = -1;

        for (int p = 0; p < route.length(); p++) {
            char cmd = route.charAt(p);
            if (cmd == 'S') {
                x += dirs[orientation][0];
                y += dirs[orientation][1];
                steps++;
                if (visited[x + 100][y + 100]) {
                    ans = steps;
                    break;
                }
                visited[x + 100][y + 100] = true;
            } else if (cmd == 'L') {
                orientation = (orientation + 1) % 4;
            } else if (cmd == 'R') {
                orientation = (orientation + 3) % 4;
            }
        }
        System.out.println(ans);
    }
}
