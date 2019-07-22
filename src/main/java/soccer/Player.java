package soccer;

public class Player {
    private String firstName;
    private String lastName;
    private int jerseyNumber;

    public Player(String firstName, String lastName, int jerseyNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jerseyNumber = jerseyNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getJerseyNumber() {
        return this.jerseyNumber;
    }
}