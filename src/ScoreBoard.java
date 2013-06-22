import java.util.HashMap;

public class ScoreBoard implements Spectator {

    private HashMap<String, Integer> scores = new HashMap<String, Integer>();

    public ScoreBoard(String... teams) {
        for (String team : teams) {
            scores.put(team, 0);
        }
    }

    @Override
    public void reactToGoalFor(String scoringTeam) {
        updateScore(scoringTeam);
        System.out.println(this.toString());
    }

    public void displayScore(){
        System.out.println(this.toString());
    }

    public String toString() {
        String result = "";
        for (String team : scores.keySet()) {

            result += team + ": " + scores.get(team) + " ";
        }
        return result;
    }

    private void updateScore(String scoringTeam) {
        scores.put(scoringTeam, scores.get(scoringTeam) + 1);
    }
}
