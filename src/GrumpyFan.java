public class GrumpyFan extends Fan {
    public GrumpyFan(String teamA) {
        super(teamA);
    }

    @Override
    protected String weAreScoringMsg() {
        return "... meh.";
    }

    @Override
    public String toString() {
        return "Grumpy " + super.toString();
    }
}
