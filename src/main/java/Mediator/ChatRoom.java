package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {

    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void sendMessage(String message, Colleague sender) {
        for (Colleague colleague : colleagues) {
            // Message should not be received by the sender
            if (colleague != sender) {
                colleague.receive(message);
            }
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void removeColleague(Colleague colleague) {
        colleagues.remove(colleague);
    }

}
