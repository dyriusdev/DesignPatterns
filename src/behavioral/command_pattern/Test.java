package behavioral.command_pattern;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Enter commando on/off");
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        Light lamp = new Light();
        ICommand switchUp = new FlipUpCommand(lamp);
        ICommand switchDown = new FlipDownCommand(lamp);
        Switch sw = new Switch();

        if (cmd.equals("on")) {
            sw.StoreAndExecute(switchUp);
        } else if (cmd.equals("off")) {
            sw.StoreAndExecute(switchDown);
        } else {
            System.out.println("Command 'on' or 'off' is required");
        }
    }
}