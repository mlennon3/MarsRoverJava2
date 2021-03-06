import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverControllerTest {

    private Parser parser;

    @Before
    public void setUp() throws Exception {
        parser = new Parser();

    }

    @Test
    public void shouldReportARoversPosition() {
        String instructions = "1 2 E\nMRMR";
        RoverController roverController = new RoverController(instructions, parser);
        String positions = roverController.controlRovers();
        assertThat(positions, is("1 2 E\n"));
    }

    @Test
    public void shouldReportTwoRoversPositions() {
        String instructions = "10 20 E\nMRMR\n30 40 N\nLLL";
        RoverController roverController = new RoverController(instructions, parser);
        String positions = roverController.controlRovers();
        assertThat(positions, is("10 20 E\n30 40 N\n"));
    }



}