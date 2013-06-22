public class Fan implements Spectator {
    private String team;

    public Fan(String team) {
        this.team = team;
    }

    public void reactToGoalFor(String scoringTeam) {
        if (scoringTeam.contains(team)) {
            System.out.println(this.toString() + weAreScoringMsg());
        } else {
            System.out.println(this.toString() + theyAreScoringMsg());
        }
    }

    protected String theyAreScoringMsg() {
        return "Boo!";
    }

    protected String weAreScoringMsg() {
        return "Yay!";
    }

    public String toString() {
        return team + " Fan:";
    }
}
