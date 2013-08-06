import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FanTest{
    @Test
    public void shouldBeHappyIfOwnTeamScores(){

        Team scoringTeam = Team.A;
        Fan fan = new Fan(scoringTeam);

        assertEquals(scoringTeam + " Fan:Yay!" , fan.reactToGoalFor(scoringTeam));
    }

    @Test
    public void shouldBeUnHappyIfOtherTeamScores(){

        Team scoringTeam = Team.A;
        Team myTeam = Team.B;
        Fan fan = new Fan(myTeam);

        assertEquals(myTeam + " Fan:Boo!" , fan.reactToGoalFor(scoringTeam));
    }

}
