package soccer;

public class Team {
    private String teamName;
    private Player[] teamPlayers;
    private Team[] teams;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Player[] getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(Player[] teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }
}
