import java.util.ArrayList;
import java.util.List;

public class FootballGame {

    private final List<Spectator> spectators;

    public FootballGame() {
        spectators = new ArrayList<Spectator>();
    }

    public String goalFor(Team scoringTeam) {
        StringBuilder responses = new StringBuilder();
        for (Spectator spectator : spectators) {
            responses.append(spectator.reactToGoalFor(scoringTeam));
            responses.append("\n");
        }
        return responses.toString();
    }

    public void enter(Spectator observer) {
        spectators.add(observer);
    }
}
