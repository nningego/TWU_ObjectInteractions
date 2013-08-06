public class Fan implements Spectator {
    private Team team;

    public Fan(Team team) {
        this.team = team;
    }

    public String reactToGoalFor(Team scoringTeam) {
        if (scoringTeam.equals(team)) {
            return  this.toString() + weAreScoringMsg();
        } else {
            return  this.toString() + theyAreScoringMsg();
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
