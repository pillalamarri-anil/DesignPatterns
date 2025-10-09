package Memento;

import java.util.ArrayList;
import java.util.List;

public class GameHistory {
    private List<Game.GameMemento> states;

    public GameHistory() {
        states = new ArrayList<Game.GameMemento>();
    }

    public Game.GameMemento undo() {

        if (states.size() < 2) {
            return null; // No previous state to revert to
        }
        states.remove(states.size() - 1); // Remove current state

        return states.get(states.size() - 1);
    }

    public void add(Game.GameMemento m) {
        states.add(m);
    }
}
