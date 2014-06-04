import java.util.ArrayList;
import java.util.List;

public class RoverController {

    private List<String> initialStatesAndMovements;

    public RoverController(String instructions) {
        setUpInstructions(instructions);
    }

    private void setUpInstructions(String instructions) {
        String[] instructionsLines = instructions.split("\n");
        initialStatesAndMovements = new ArrayList();

        for (int i = 0; i < instructionsLines.length; i+=2) {
            String initialState = instructionsLines[i];
            String movements = instructionsLines[i+1];
            initialStatesAndMovements.add(initialState);
            initialStatesAndMovements.add(movements);
        }
    }

    public String controlRovers() {
        String positions = "";
        for (int i=0; i< initialStatesAndMovements.size(); i+=2) {
            Rover rover = new Rover(initialStatesAndMovements.get(i));
            positions += rover.report() + "\n";

        }
        return positions;
    }
}
