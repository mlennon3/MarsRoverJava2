import java.util.List;

public class RoverController {

    private final Parser parser;
    private final String instructions;

    public RoverController(String instructions, Parser parser) {
        this.parser = parser;
        this.instructions = instructions;
    }

    public String controlRovers() {
        String positions = "";
        List<String> initialStatesAndMovements = parser.setUpInstructions(instructions);

        for (int i=0; i< initialStatesAndMovements.size(); i+=2) {
            Rover rover = new Rover(initialStatesAndMovements.get(i));
            positions += rover.report() + "\n";

        }
        return positions;
    }
}
