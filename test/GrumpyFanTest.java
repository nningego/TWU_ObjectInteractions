import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GrumpyFanTest {

    private Team teamA;
    private Team teamB;


    @Before
    public void setUp() throws Exception {
        teamA = Team.A;
        teamB = Team.B;
    }

    @Test
    public void shouldBeIndifferentToOwnTeamScoring(){
        Team scoringTeam = teamA;
        GrumpyFan grumpyFan = new GrumpyFan(teamA);
        assertThat(grumpyFan.reactToGoalFor(scoringTeam), is("A Fan:... Meh..."));
    }

    @Test
    public void shouldBeIndifferentToOtherTeamScoring(){
        Team scoringTeam = teamB;
        GrumpyFan grumpyFan = new GrumpyFan(teamA);
        assertThat(grumpyFan.reactToGoalFor(scoringTeam), is("A Fan:... Meh..."));
    }

}
