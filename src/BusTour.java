// Автобусная экскурсия https://acmp.ru/index.asp?main=task&id_task=233
public class BusTour {
    public static void main() {
        int heightBus = 437;

        int[][] listTours = {
            {763},
            {763, 245, 113},
            {437}
        };

        for (int[] tours : listTours) {
            int crush = 0;

            for (int i = 0; i < tours.length; i++){
                if (tours[i] <= heightBus) {
                    crush = i + 1;
                    break;
                }
            }

            if (crush == 0) {
                System.out.println("No crash");
            } else {
                System.out.println("Crash " + crush);
            }

        }
    }
}
