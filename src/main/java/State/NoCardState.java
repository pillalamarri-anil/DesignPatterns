package State;

public class NoCardState implements ATMState {

    public NoCardState() {
        System.out.println("No card state. Please insert your card.");
    }

    @Override
    public void nextState(ATM atm) {
        atm.setState(new CardInsertState());
    }
}
