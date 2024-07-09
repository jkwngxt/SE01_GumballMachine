public class GumballMachine {
    private int gumballs;
    private boolean hasQuarter;
    private boolean doesSoldOut;

    public GumballMachine(int gumballs) {
        this.gumballs = gumballs;
        hasQuarter = false;
        doesSoldOut = false;
    }

    public boolean insertQuarter() {
        if (!hasQuarter && !doesSoldOut) {
            hasQuarter = true;
            return true;
        }
        return false;
    }

    public void turnCrank() {
        gumballs--;
        if (gumballs == 0) {
            doesSoldOut = true;
        }
        hasQuarter = false;
    }

    public boolean doesSoldOut() {
        return doesSoldOut;
    }

    public int getGumballs() {
        return gumballs;
    }
}
