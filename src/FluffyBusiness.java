// Волосатый бизнес https://acmp.ru/index.asp?main=task&id_task=39
import java.io.*;

public class FluffyBusiness {
    public static void main() {

//        int[] hairCost = {73, 31, 96, 24, 46};
        int[] hairCost = {1, 2, 3, 4, 5};
//        int[] hairCost = {5, 4, 3, 2, 1};
        int n = hairCost.length;

        int[] maxC = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            maxC[i] = Math.max(hairCost[i], maxC[i + 1]);
        }

        long total = 0;
        int length = 1;

        for (int i = 0; i < n; i++) {
            if (hairCost[i] >= maxC[i]) {
                total += (long) length * hairCost[i];
                length = 1;
            } else {
                length++;
            }
        }

        System.out.println(total);
    }

}
