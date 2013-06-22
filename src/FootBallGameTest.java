public class FootBallGameTest {

    public static final String teamA = "St Pauli";
    public static final String teamB = "HSV";

    public static void main(String... args) {
        FootballGame game = new FootballGame();

        game.enter(new Reporter());
        ScoreBoard scoreBoard = new ScoreBoard(teamA, teamB);
        game.enter(scoreBoard);
        game.enter(new Fan(teamA));
        game.enter(new GrumpyFan(teamA));
        game.enter(new Fan(teamB));

        scoreBoard.displayScore();
        game.goalFor(teamA);
        game.goalFor(teamB);

    }
}
