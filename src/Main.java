import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println("Mighty Gumball, Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");

        char selected;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            selected = scanner.next().charAt(0);
            System.out.println("Menu: C)heck inventory I)nsert quarter E)xit");
            if (selected == 'E' || selected == 'e') {
                break;
            } else if (selected == 'C' || selected == 'c') {
                System.out.println("Inventory: " +
                        gumballMachine.getGumballs() + "gumball" + (gumballMachine.getGumballs() <= 1? "":"s"));

                System.out.println("Machine is waiting for quarter\n");
            } else if (selected == 'I' || selected == 'i') {
                System.out.println("You insert a quarter");
                if (!gumballMachine.insertQuarter()) {
                    System.out.println("Quarter returned");
                }

            }
        }


        System.out.println("You turned...");
        gumballMachine.turnCrank();
        System.out.println("A gumball comes rolling out the slot");
    }
}
