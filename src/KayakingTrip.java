// Байдарочный поход https://acmp.ru/index.asp?main=task&id_task=869

import java.util.Arrays;

public class KayakingTrip {
    public static void main() {
        int D = 135;
        int[] persons = {50, 74, 60, 82};

        Arrays.sort(persons);

        int l = 0;                      // указатель на самого лёгкого
        int f = persons.length - 1;     // указатель на самого тяжёлого
        int boats = 0;                  // счётчик байдарок

        while (l <= f) {
            if (l < f && persons[l] + persons[f] <= D) {
                l++;
            }
            f--;
            boats++;
        }

        System.out.println(boats);
    }
}
