package Mediator;

public class Client {

    public static void main(String[] args) {

        Mediator chatRoom = new ChatRoom();

        Colleague alice = new Colleague("Alice", chatRoom);
        Colleague bob = new Colleague("Bob", chatRoom);
        Colleague charlie = new Colleague("Charlie", chatRoom);

        chatRoom.addColleague(alice);
        chatRoom.addColleague(bob);
        chatRoom.addColleague(charlie);

        alice.sendMessage("Hello, everyone!");

    }
}
