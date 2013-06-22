public class Reporter implements Spectator {

    public void reactToGoalFor(String scoringTeam) {
        System.out.println("Reporter: GOOOOOOOAL ... " + scoringTeam + " scored!");
    }

}
