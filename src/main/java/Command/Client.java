package Command;

import java.lang.module.FindException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        CommandExecutor executor = new CommandExecutor();
        executor.addCommand(new CopyCommand());
        executor.addCommand(new SearchCommand());

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        executor.execute(command);

    }
}
