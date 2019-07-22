package soccer;

public class League {
    public static void main(String[] args) {
        //TODO
        Player player1 = new Player("Sandiso", "Madayi", 96);
        Player player2 = new Player("Mad", "Man", 76);
        Player player3 = new Player("Min", "Max", 10);

//        player1.firstName = "sandiso";
//        player2.firstName = "sandman";

        Player[] firstTeamPlayers = {player1, player2, player3};

        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();

        team1.setTeamName("Chiefs");
        team2.setTeamName("Pirates");
        team3.setTeamName("Sundowns");

        team1.setTeamPlayers(firstTeamPlayers);

        Player player4 = new Player("Robert", "Service", 15);
        Player player5 = new Player("Robbie", "Burns", 14);
        Player player6 = new Player("Rafael", "Sabatini", 11);

        Player[] secondTeamPlayers = {player4, player5, player6};
        team2.setTeamPlayers(secondTeamPlayers);

        Team[] teams = {team1, team2, team3};

        Game currentGame = new Game();
        currentGame.setHomeTeam(team1);
        currentGame.setAwayTeam(team2);

        Goal firstGoal = new Goal();

        firstGoal.setThePlayer(secondTeamPlayers[2]);
        firstGoal.setTheTeam(currentGame.getAwayTeam());
        firstGoal.setTheTime(55);

        Goal[] theGoals = {firstGoal};
        currentGame.setGoals(theGoals);
        
        System.out.println("Goal scored after " + firstGoal.getTheTime() + " minutes by " + player5.getFirstName() + " of " + team2.getTeamName());
    }
}
