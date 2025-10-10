package State;

public class InProgessState implements ATMState{

    public InProgessState() {
        System.out.println("Transaction in progress state. Please wait...");
    }

    @Override
    public void nextState(ATM atm) {
            atm.setState(new NoCardState());
    }
}
