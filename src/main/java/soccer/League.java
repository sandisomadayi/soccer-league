package soccer;

public class League {
    public static void main(String[] args) {
        //TODO
        Player player1 = new Player("Sandiso", "Madayi", 96);
        Player player2 = new Player("Mad", "Man", 76);
        Player player3 = new Player("Min", "Max", 10);

//        player1.firstName = "sandiso";
//        player2.firstName = "sandman";

        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();

        team1.teamName = "Chiefs";
        team2.teamName = "Pirates";
        team3.teamName = "Sundowns";

        team1.teamPlayers = thePlayers;
        team2.teamPlayers = new  Player[3];

        team2.teamPlayers[0] = new Player("Robert", "Service", 15);
        team2.teamPlayers[1] = new Player("Robbie", "Burns", 14);
        team2.teamPlayers[2] = new Player("Rafael", "Sabatini", 11);

        Team[] teams = {team1, team2, team3};

        Game currentGame = new Game();
        currentGame.homeTeam = team1;
        currentGame.awayTeam = team2;

        Goal firstGoal = new Goal();

        firstGoal.thePlayer = currentGame.homeTeam.teamPlayers[2];
        firstGoal.theTeam = currentGame.homeTeam;
        firstGoal.theTime = 55;

        Goal[] theGoals = {firstGoal};
        currentGame.goals = theGoals;
        
        System.out.println("Goal scored after " + currentGame.theGoals[0].theTime + " minutes by " + currentGame.theGoals[0].thePlayer.playerName + " of " + currentGame.theGoals[0].theTeam.teamName);
    }
}
