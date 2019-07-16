package soccer;

public class League {
    public static void main(String[] args) {
        //TODO
        Player player1 = new Player("sandiso", "madayi", 96);
        Player player2 = new Player("mad", "man", 76);
        Player player3 = new Player("min", "max", 10);

        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();

        team1.teamName = "chiefs";
        team2.teamName = "pirates";
        team3.teamName = "sundowns";

        team1.teamPlayers = thePlayers;

        Team[] teams = {team1, team2, team3};

        for (Player player : team1.teamPlayers) {
            System.out.println(player.firstName);
        }

        System.out.println("--------------------------------------------------");

        for (Team team: teams) {
            System.out.println(team.teamName);
        }
    }
}
