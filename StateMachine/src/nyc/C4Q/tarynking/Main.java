package nyc.C4Q.tarynking;


/**
 * Created by tarynking on 11/11/16.
 */
public class Main {


    public static void main(String[] args) {

        StateMachine.INPUT[] input = new StateMachine.INPUT[]{
                StateMachine.INPUT.NONE,
                StateMachine.INPUT.NONE,
                StateMachine.INPUT.TURN_KEY,
                StateMachine.INPUT.NONE,
                StateMachine.INPUT.NONE,
                StateMachine.INPUT.NONE,
                StateMachine.INPUT.SHIFT_DOWN,
                StateMachine.INPUT.NONE,
                StateMachine.INPUT.NONE,
                StateMachine.INPUT.SHIFT_UP,
                StateMachine.INPUT.SHIFT_UP,
                StateMachine.INPUT.NONE,
                StateMachine.INPUT.SHIFT_DOWN,
                StateMachine.INPUT.NONE,
                StateMachine.INPUT.TURN_KEY,
                StateMachine.INPUT.NONE,
        };

        new StateMachine().run(StateMachine.STATES.OFF, input);
    }
}
