package behavioral.command_pattern;

public class FlipDownCommand implements ICommand {

    private final Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void Execute() {
        light.TurnOff();
    }
}