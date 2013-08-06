public class Reporter  implements Spectator{

    public String reactToGoalFor(Team scoringTeam) {
        return "Reporter: GOOOOOOOAL ... " + scoringTeam + " scored!";
    }

}
