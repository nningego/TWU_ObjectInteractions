import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class FootballGameTest {

    @Test
    public void shouldExpectReactionFromSpectatorsWhenGoalIsMade(){

        initMocks(this);
        FootballGame footballGame = new FootballGame();

        Spectator spectator1 = mock(Spectator.class);
        Spectator spectator2 = mock(Spectator.class);
        footballGame.enter(spectator1);
        footballGame.enter(spectator2);

        Team scoringTeam = Team.A;
        footballGame.goalFor(scoringTeam);

        verify(spectator1).reactToGoalFor(scoringTeam);
        verify(spectator2).reactToGoalFor(scoringTeam);

    }
}
