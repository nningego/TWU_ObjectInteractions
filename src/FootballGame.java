import java.util.ArrayList;
import java.util.List;

public class FootballGame {

    private final List<Spectator> spectators;

    public FootballGame() {
        spectators = new ArrayList<Spectator>();
    }

    public void goalFor(String scoringTeam) {
        for (Spectator spectator : spectators) {
            spectator.reactToGoalFor(scoringTeam);
        }
    }

    public void enter(Spectator observer) {
        spectators.add(observer);
    }
}
