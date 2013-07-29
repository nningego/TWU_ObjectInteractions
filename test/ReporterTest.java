import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReporterTest extends ConsoleStreamTest {

    @Test
    public void shouldReportTheScore(){
        Reporter reporter = new Reporter();
        String scoringTeam = "A";
        reporter.reactToGoalFor(scoringTeam);

        assertEquals("Reporter: GOOOOOOOAL ... " + scoringTeam + " scored!\n", getOutContent().toString());
    }


}
