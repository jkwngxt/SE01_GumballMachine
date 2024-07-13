import java.util.Scanner;

/**
 * @author 6510405377 Jitlada Yotinta
 */
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        char selected;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu: C)heck inventory  I)nsert quarter  R)eturn quarter  T)erns crank  E)xit");
            selected = scanner.next().charAt(0);

            if (selected == 'E' || selected == 'e') {
                System.out.println("Exit...");
                break;

            } else if (selected == 'I' || selected == 'i') {
                System.out.println(gumballMachine.insertQuarter());

            } else if (selected == 'R' || selected == 'r') {
                System.out.println(gumballMachine.ejectsQuarter());

            } else if (selected == 'C' || selected == 'c') {
                System.out.println(gumballMachine);

            } else if (selected == 'T' || selected == 't') {
                System.out.println(gumballMachine.turnsCrank());

            } else {
                System.out.println("Wrong option! Try again");
            }
        }
    }
}
