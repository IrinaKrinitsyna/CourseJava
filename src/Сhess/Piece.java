package Сhess;

public class Piece {
    public final boolean color;
    public final int type;

    private String[] types = {
        "King","Queen","Rook","Bishop","Knight","Pawn"
    };

    public Piece(boolean color, int type) {
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return types[this.type];
    }
}
