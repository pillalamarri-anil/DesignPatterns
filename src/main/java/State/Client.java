package State;

public class Client {

    public static void main(String[] args) {

        ATM atm = new ATM(new NoCardState());

        atm.nextState(); // changed to card inserted state

        atm.nextState(); // changed to pin entered state

        atm.nextState(); // changed to inprogress state

        atm.nextState(); // changed to no card state again

    }
}
