public class GrumpyFan extends Fan {
    public GrumpyFan(Team team) {
        super(team);
    }

    @Override
    protected String weAreScoringMsg() {
        return "... Meh...";
    }

    @Override
    protected String theyAreScoringMsg() {
        return "... Meh...";
    }


}
