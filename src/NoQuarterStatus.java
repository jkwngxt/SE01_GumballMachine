/**
 * @author 6510405377 Jitlada Yotinta
 */
public class NoQuarterStatus implements Status {
    private final GumballMachine gumballMachine;

    public NoQuarterStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String insertQuarter() {
        gumballMachine.setStatus(gumballMachine.getHasQuarterStatus());
        return "You insert a quarter";
    }

    @Override
    public String ejectsQuarter() {
        return "You haven't inserted a quarter";
    }

    @Override
    public String turnsCrank() {
        return "You turned but there's no quarter";
    }
}
