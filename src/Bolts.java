 //Болты и гайки https://acmp.ru/index.asp?main=task&id_task=294
public class Bolts {
    public static void main() {
        int[][][] arr = {
            {
                {1000, 10, 100},
                {1200, 20, 90}
            }, {
                {5000, 15, 23},
                {4000, 17, 22}
            }
        };

        for (int[][] set : arr) {
            long costBolts = (long) set[0][0] * (100 - set[0][1]) / 100;
            long costNuts = (long) set[1][0] * (100 - set[1][1]) / 100;

            long pairs = Math.min(costBolts, costNuts);
            long damage = (long) set[0][0] * set[0][2] + (long) set[1][0] * set[1][2] - pairs * (set[0][2] + set[1][2]);

            System.out.println(damage);
        }

    }
}
