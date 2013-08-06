import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ScoreBoardTest {
    private ScoreBoard scoreBoard;
    private Team teamA;
    private Team teamB;

    @Before
    public void setUp() throws Exception {
        scoreBoard = new ScoreBoard(Team.A, Team.B);
        teamA = Team.A;
        teamB = Team.B;
    }

    @Test
    public void shouldReportScoreOfScoringTeam(){
        Team scoringTeam = teamA;
        assertThat( scoreBoard.reactToGoalFor(scoringTeam) , is("SCORES => A (1) B (0)"));
    }

    @Test
    public void shouldKeepTrackOfMultipleScores(){

        assertThat(scoreBoard.reactToGoalFor(teamA) , is("SCORES => "+teamA+" (1) "+teamB+" (0)"));
        assertThat(scoreBoard.reactToGoalFor(teamB) , is("SCORES => "+teamA+" (1) "+teamB+" (1)"));
        assertThat(scoreBoard.reactToGoalFor(teamA) , is("SCORES => "+teamA+" (2) "+teamB+" (1)"));
    }
}
