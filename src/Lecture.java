import java.util.Scanner;

public class Lecture {
    public static void main() {
        fortyTwo();
        coffe();
    }

    /*Упражнение 1:
        Спросить пользователя, сколько стоит чашка кофе
        Если больше 300, то вывести "Дороговато"
        Если от 150 до 300, то вывести "Норм"
        Если от 80 до 150, то "Дешево"
        Если меньше 80, то вывести "А это в рублях? А это вообще кофе?"
    */
    public static void coffe() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Стоимость кофе: ");
        int cost = scanner.nextInt();

        if (cost < 80) {
            System.out.println("А это в рублях? А это вообще кофе?");
        } else if (cost > 80 && cost < 150) {
            System.out.println("Дешево");
        } else if (cost > 150 && cost < 300) {
            System.out.println("Норм");
        } else if (cost > 300) {
            System.out.println("Дороговато");
        } else {
            System.out.println("Бесценно");
        }
    }

//    Упражнение 2:
//
//    Много раз Попросить пользователя вводить целые числа
//
//    Остановиться, когда сумма введенных чисел достигнет 42
//
//    Рассказать, сколько всего он ввел чисел
//
//    + Каков процент количества положительных чисел?
//    + Чему равна сумма отрицательных чисел?

    public static void fortyTwo() {
        int sum = 0;
        int sumNegative = 0;
        int countPositive = 0;
        int countTotal = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите число: ");
            int a = scanner.nextInt();

            sum += a;
            countTotal++;

            if (a > 0) {
                countPositive++;
            } else if (a < 0) {
                sumNegative += a;
            }

        } while (sum < 42);

        double percentPositive = (countTotal == 0)
                ? 0.0
                : (double) countPositive * 100 / countTotal;

        System.out.println("Сумма равна: " + sum);
        System.out.printf("Процент положительных чисел: %.2f%%%n", percentPositive);
        System.out.println("Сумма отрицательных чисел: " + sumNegative);
    }
}
