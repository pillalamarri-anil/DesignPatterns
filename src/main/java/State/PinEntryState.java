package State;

public class PinEntryState implements ATMState {

    public PinEntryState() {
        System.out.println("ATM is in Pin Entry State. Transaction in progress");
    }

    @Override
    public void nextState(ATM atm) {
        atm.setState(new InProgessState());
    }
}
