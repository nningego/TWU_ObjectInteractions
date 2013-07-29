import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FanTest extends ConsoleStreamTest{
    @Test
    public void shouldReportTheScore(){

        Fan fan = new Fan("A");
        String scoringTeam = "A";
        fan.reactToGoalFor(scoringTeam);

        assertEquals(scoringTeam + " Fan:Yay!\n" , getOutContent().toString());
    }

}
