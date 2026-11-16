package Сhess;

public class Main
{
    public static void main() {

        int[][] listPieces = {
                {0, 1},
                {0, 2},
                {1, 4},
                {1, 5},
        };

        Piece[] pieces = parsInput(listPieces);
        int blackCount = getblackCount(pieces);
        double blackPercent =  (blackCount * 100.0) / pieces.length;

        System.out.println("Всего фигур: " + pieces.length);
        System.out.println("Чёрных фигур: " + blackCount + " ( " + blackPercent + "% )");
    }

    public static Piece[] parsInput(int[][] listPieces){
        Piece[] pieces = new Piece[listPieces.length];

        int i = 0;
        for (int[] list : listPieces) {
            pieces[i] = new Piece(list[0] == 1, list[1]);
            i++;
        }

        return pieces;
    }


    public static int getblackCount(Piece[] pieces) {
        int blackCount = 0;
        for (Piece p : pieces) {
            System.out.println("Фигура: " + p.getName());
            if (!p.color) {     // color = false — чёрные
                blackCount++;
            }
        }

        return  blackCount;
    }

}
