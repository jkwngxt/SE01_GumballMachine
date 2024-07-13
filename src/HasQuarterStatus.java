/**
 * @author 6510405377 Jitlada Yotinta
 */
public class HasQuarterStatus implements Status {
    private final GumballMachine gumballMachine;

    public HasQuarterStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String insertQuarter() {
        return "You can't insert another quarter";
    }

    @Override
    public String ejectsQuarter() {
        gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
        return "Quarter returned";
    }

    @Override
    public String turnsCrank() {
        String result = "You turned...\nA gumball comes rolling out the slot";
        if (gumballMachine.getGumballs() - 1 == 0) {
            result += "\nOops, out of gumballs!";
        }
        gumballMachine.reduceGumball();

        if (gumballMachine.getGumballs() > 0) {
            gumballMachine.setStatus(gumballMachine.getNoQuarterStatus());
        } else {
            gumballMachine.setStatus(gumballMachine.getOutOfGumballsStatus());
        }
        return result;
    }
}
