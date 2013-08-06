import java.util.LinkedHashMap;

public class ScoreBoard implements Spectator {

    private LinkedHashMap<Team, Integer> scores =  new LinkedHashMap<Team, Integer>();

    public ScoreBoard(Team... teams) {
        for (Team team : teams) {
            scores.put(team, 0);
        }
    }

    @Override
    public String reactToGoalFor(Team scoringTeam) {
        updateScore(scoringTeam);
        return  this.toString();
    }

    private void updateScore(Team scoringTeam) {
        Integer score = scores.get(scoringTeam);
        scores.put(scoringTeam, score+1);
    }

    @Override
    public String toString() {
        StringBuilder displayMessage = new StringBuilder();
        displayMessage.append("SCORES =>");
        for (Team team : scores.keySet()) {
            displayMessage.append(" ");
            displayMessage.append(team.toString());
            displayMessage.append(" (").append(scores.get(team)).append(")");
        }
        return displayMessage.toString();
    }

}
