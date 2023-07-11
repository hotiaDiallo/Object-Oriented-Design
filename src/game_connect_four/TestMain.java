package game_connect_four;

public class TestMain {
    public static void main(String[] args) {
        Grid grid = new Grid(6, 7);
        Game game = new Game(grid, 4, 10);
        game.play();
    }
}
