/**
 * @author 6510405377 Jitlada Yotinta
 */
public class OutOfGumballsStatus implements Status {
    private final GumballMachine gumballMachine;

    public OutOfGumballsStatus(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public String insertQuarter() {
        return "You can't insert a quarter, the machine is sold out";
    }

    @Override
    public String ejectsQuarter() {
        return "You haven't inserted a quarter";
    }

    @Override
    public String turnsCrank() {
        return "You turned, but there are no gumballs";
    }
}
