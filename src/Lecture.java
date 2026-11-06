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

    public static void fortyTwo() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Введите число: ");
            int a = scanner.nextInt();
            sum += a;
        } while (sum < 42);

        System.out.print("Сумма ровна: " + sum);
    }
}
