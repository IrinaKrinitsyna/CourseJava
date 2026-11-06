package Dots;

import java.util.Scanner;

public class Main {

    public static void main() {

//        getDistance();
//        getTriangleArea();
//        getMaxLength();
    }

    public static void getDistance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x1: ");
        int x1 = scanner.nextInt();

        System.out.print("Введите y1: ");
        int y1 = scanner.nextInt();

        System.out.print("Введите x2: ");
        int x2 = scanner.nextInt();

        System.out.print("Введите y2: ");
        int y2 = scanner.nextInt();

        double distance = Flatness.getDistance(new Dot(x1, y1), new Dot(x2, y2));
        System.out.println("Расстояние : " + distance);
    }

    public static void getTriangleArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x1: ");
        int x1 = scanner.nextInt();

        System.out.print("Введите y1: ");
        int y1 = scanner.nextInt();

        System.out.print("Введите x2: ");
        int x2 = scanner.nextInt();

        System.out.print("Введите y2: ");
        int y2 = scanner.nextInt();

        System.out.print("Введите x3: ");
        int x3 = scanner.nextInt();

        System.out.print("Введите y3: ");
        int y3 = scanner.nextInt();

        double area = Flatness.getTriangleArea(new Dot(x1, y1), new Dot(x2, y2), new Dot(x3, y3));
        System.out.println("Площадь  : " + area);
    }

    public static void getMaxLength() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x1: ");
        int x1 = scanner.nextInt();

        System.out.print("Введите y1: ");
        int y1 = scanner.nextInt();

        System.out.print("Введите x2: ");
        int x2 = scanner.nextInt();

        System.out.print("Введите y2: ");
        int y2 = scanner.nextInt();

        System.out.print("Введите x3: ");
        int x3 = scanner.nextInt();

        System.out.print("Введите y3: ");
        int y3 = scanner.nextInt();

        double maxLength = Flatness.getMaxLength(new Dot(x1, y1), new Dot(x2, y2), new Dot(x3, y3));
        System.out.println("Длинна максимального отрезка : " + maxLength);
    }
}
