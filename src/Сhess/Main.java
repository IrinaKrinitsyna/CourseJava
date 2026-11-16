package Сhess;

public class Main
{
    public static void main() {

        int[][] listPieces = {
                {0, 1},
                {0, 1},
                {1, 1},
                {1, 1},
        };

        Piece[] pieces = new Piece[listPieces.length];

        int i = 0;
        for (int[] list : listPieces) {
            pieces[i] = new Piece(list[0] == 1, list[1]);
            i++;
        }

        int blackCount = 0;
        for (Piece p : pieces) {
            System.out.println("Фигура: " + p.getName());
            if (!p.color) {     // color = false — чёрные
                blackCount++;
            }
        }

        double blackPercent =  (blackCount * 100.0) / pieces.length;

        System.out.println("Всего фигур: " + pieces.length);
        System.out.println("Чёрных фигур: " + blackCount + " ( " + blackPercent + "% )");
    }


}
