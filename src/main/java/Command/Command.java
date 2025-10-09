package Command;

public interface Command {

    boolean matches(String command);
    void execute();

}
