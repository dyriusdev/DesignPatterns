package behavioral.command_pattern;

public class FlipUpCommand implements ICommand {

    private final Light light;

    public FlipUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void Execute() {
        light.TurnOn();
    }
}
