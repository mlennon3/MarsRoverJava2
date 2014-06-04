public class Rover {
    private String state;

    public Rover(String state) {
        this.state = state;
    }

    public String report() {
        return state;
    }
}
