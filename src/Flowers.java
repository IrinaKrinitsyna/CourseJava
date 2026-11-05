//Цветочки https://acmp.ru/index.asp?main=task&id_task=504
public class Flowers {
    public static void main() {
        String flowers = "GCV";

        int i = 5;
        do {
            flowers = "" + flowers.charAt(0) + flowers.charAt(2) + flowers.charAt(1);
            flowers = "" + flowers.charAt(1) + flowers.charAt(0) + flowers.charAt(2);
            i--;
        }
        while (i > 0);

        System.out.println(flowers);
    }
}
