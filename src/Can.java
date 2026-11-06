//Два бандита https://acmp.ru/index.asp?main=task&id_task=33
import java.util.Scanner;

public class Can {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        int sum = a + b - 1;

        System.out.println("1: " + (sum - a));
        System.out.println("2: " + (sum - b));
    }
}
