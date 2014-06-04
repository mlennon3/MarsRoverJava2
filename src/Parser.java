import java.util.ArrayList;
import java.util.List;

public class Parser {

    public List<String> setUpInstructions(String instructions) {
        String[] instructionsLines = instructions.split("\n");

        return addInitialStatesAndMovements(instructionsLines);
    }

    private List<String> addInitialStatesAndMovements(String[] instructionsLines) {
        List<String> initialStatesAndMovements = new ArrayList<String>();
        for (int i = 0; i < instructionsLines.length; i+=2) {
            String initialState = instructionsLines[i];
            String movements = instructionsLines[i+1];

            initialStatesAndMovements.add(initialState);
            initialStatesAndMovements.add(movements);
        }
        return initialStatesAndMovements;
    }
}
