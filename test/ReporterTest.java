import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReporterTest {

    @Test
    public void shouldReportTheScore(){
        Reporter reporter = new Reporter();
        Team scoringTeam = Team.A;
        assertThat(reporter.reactToGoalFor(scoringTeam), is("Reporter: GOOOOOOOAL ... " + scoringTeam + " scored!"));
    }


}
