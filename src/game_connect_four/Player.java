package game_connect_four;

public class Player {
    private String name;
    private GridFilling pieceColor;

    public Player(String name, GridFilling pieceColor) {
        this.name = name;
        this.pieceColor = pieceColor;
    }

    public String getName() {
        return name;
    }

    public GridFilling getPieceColor() {
        return pieceColor;
    }
}
