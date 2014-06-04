import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ParserTest {

    @Test
    public void shouldSplitLines() {
        Parser parser = new Parser();
        List<String> instructions = parser.setUpInstructions("9 10 N\nLMLM");

        assertThat(instructions.get(0), is("9 10 N"));
        assertThat(instructions.get(1), is("LMLM"));

    }
}