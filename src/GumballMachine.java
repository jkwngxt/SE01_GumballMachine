/**
 * @author 6510405377 Jitlada Yotinta
 */
public class GumballMachine {
    private int gumballs;
    private final HasQuarterStatus hasQuarterStatus;
    private final NoQuarterStatus noQuarterStatus;
    private final OutOfGumballsStatus outOfGumballsStatus;
    private Status status;

    public GumballMachine(int gumballs) {
        this.gumballs = gumballs;
        hasQuarterStatus = new HasQuarterStatus(this);
        noQuarterStatus = new NoQuarterStatus(this);
        outOfGumballsStatus = new OutOfGumballsStatus(this);
        status = noQuarterStatus;
    }

    public String insertQuarter() {
        return status.insertQuarter();
    }

    public String ejectsQuarter() {
        return status.ejectsQuarter();
    }

    public String turnsCrank() {
        return status.turnsCrank();
    }

    public int getGumballs() {
        return gumballs;
    }

    @Override
    public String toString() {
        String result = "Mighty Gumball, Inc.\n" +
                "Java-enabled Standing Gumball Model #2004\n" +
                "Inventory: " + gumballs + " gumball" + (gumballs <= 1 ? "\n" : "s\n");

        if (status == noQuarterStatus) {
            return result + "Machine is waiting for quarter\n";
        }

        if (status == hasQuarterStatus) {
            return result + "Machine is waiting for turning\n";
        }

        return result + "Machine is sold out\n";
    }

    public void reduceGumball() {
        gumballs--;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public HasQuarterStatus getHasQuarterStatus() {
        return hasQuarterStatus;
    }

    public NoQuarterStatus getNoQuarterStatus() {
        return noQuarterStatus;
    }

    public OutOfGumballsStatus getOutOfGumballsStatus() {
        return outOfGumballsStatus;
    }
}
