package State;

import javax.smartcardio.Card;

public class CardInsertState implements ATMState {

    CardInsertState() {
        System.out.println("Card Inserted state. Please enter your PIN.");
    }

    @Override
    public void nextState(ATM atm) {
        atm.setState(new PinEntryState());
    }
}
