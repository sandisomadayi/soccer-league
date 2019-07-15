package soccer;

public class Player {
    public String firstName;
    public String lastName;
    public int jerseyNumber;
    public String teamName;

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