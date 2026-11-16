// Волосатый бизнес https://acmp.ru/index.asp?main=task&id_task=39
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FluffyBusiness {
    public static void main() {

//        int[] hairCost = {73, 31, 96, 24, 46};
        int[] hairCost = {1, 2, 3, 4, 5};
//        int[] hairCost = {5, 4, 3, 2, 1};
        int n = hairCost.length;

        int[] maxCosts = getTrendMaxPrices(hairCost);
        long total = calculateTotal(hairCost, maxCosts);

        System.out.println(total);
    }

    static int[] getTrendMaxPrices(int[] hairCost) {
        int[] maxC = new int[hairCost.length + 1];
        for (int i = hairCost.length - 1; i >= 0; i--) {
            maxC[i] = Math.max(hairCost[i], maxC[i + 1]);
        }
        return maxC;
    }

    static long calculateTotal(int[] hairCost, int[] maxC) {
        long total = 0;
        int length = 1;

        for (int i = 0; i < hairCost.length; i++) {
            if (hairCost[i] >= maxC[i]) {
                total += (long) length * hairCost[i];
                length = 1;
            } else {
                length++;
            }
        }
        return total;
    }

}
