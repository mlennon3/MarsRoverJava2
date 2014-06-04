public class Main {
    public static void main(String[] args) {
        String instructions = ("1 2 E\nLMLM\n5 2 S\nRRRR");
        RoverController roverController = new RoverController(instructions);
        String state = roverController.controlRovers();
        System.out.println(state);
    }
}
