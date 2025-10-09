package Command;

public class CopyCommand implements Command {

    @Override
    public boolean matches(String command) {

        String[] parts = command.split(" ");

        if (parts[0].equalsIgnoreCase("copy") && parts.length == 3) {
            return true;
        }
        return false;
    }

    @Override
    public void execute() {
        System.out.println("Executing Copy Command");
    }
}