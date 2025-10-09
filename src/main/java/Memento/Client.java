package Memento;

public class Client {
    public static void main(String[] args) {

        Game game = new Game();
        GameHistory history = new GameHistory();
        history.add(game.save());

        game.play(10);
        history.add(game.save());

        System.out.println(game);

        game.restore(history.undo());

        System.out.println(game);

    }
}
