package Command;

public class SearchCommand implements Command {


    @Override
    public boolean matches(String command) {
        String[] parts = command.split(" ");

        if (parts[0].equalsIgnoreCase("SEARCH") && parts.length == 3) {
            return true;
        }
       return false;
    }

    @Override
    public void execute() {
        // Simulate searching for a file
        System.out.println("Searching for the file...");
    }
}
