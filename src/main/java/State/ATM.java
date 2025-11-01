package State;

public class ATM {
    private ATMState state;

    public ATM(ATMState state) {
        this.state = state;
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public void nextState() {
        state.nextState(this);
    }
}
