package Memento;

public class Game {

    private int level;
    private int score;

    public Game() {
        this.level = 1;
        this.score = 0;
    }

    public void play(int scoreIncrement) {
        this.score += scoreIncrement;
        if (this.score >= level * 100) {
            level++;
            System.out.println("Level Up! New Level: " + level);
        }
    }

    public GameMemento save() {
        return new GameMemento(level, score);
    }

    public void restore(GameMemento memento) {
        this.level = memento.getLevel();
        this.score = memento.getScore();
        System.out.println("Game Restored to Level: " + level + ", Score: " + score);
    }

    @Override
    public String toString() {
        return "Game{level=" + level + ", score=" + score + '}';
    }

    static class GameMemento {
        private final int level;
        private final int score;

        public GameMemento(int level, int score) {
            this.level = level;
            this.score = score;
        }

        public int getLevel() {
            return level;
        }

        public int getScore() {
            return score;
        }
    }


}
