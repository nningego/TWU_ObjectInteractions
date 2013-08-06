import org.junit.Test;

//BDD
public class RunFootBallGameTest {
    @Test
    public void shouldSimulateFootBallGame(){

        Team teamA = Team.A;
        Team teamB = Team.B;


        FootballGame game = new FootballGame();

        game.enter(new Reporter());
        ScoreBoard scoreBoard = new ScoreBoard(teamA, teamB);
        game.enter(scoreBoard);
        game.enter(new Fan(teamA));
        game.enter(new GrumpyFan(teamA));
        game.enter(new Fan(teamB));

        System.out.println(game.goalFor(teamA));
        System.out.println(game.goalFor(teamB));
        System.out.println(game.goalFor(teamB));

    }
}
