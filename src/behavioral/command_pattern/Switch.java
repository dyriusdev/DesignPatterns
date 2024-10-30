package behavioral.command_pattern;

import java.util.ArrayList;
import java.util.List;

public class Switch {

    private final List<ICommand> commands = new ArrayList<>();

    public void StoreAndExecute(ICommand command) {
        commands.add(command);
        command.Execute();
    }
}