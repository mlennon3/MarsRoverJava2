import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void shouldReportInitialState() {
        Rover rover = new Rover("9 2 N");
        String state = rover.report();
        assertEquals(state, "9 2 N");
    }


}