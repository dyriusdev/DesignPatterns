package behavioral.mediator_pattern;

public abstract class Colleague {

    protected IMediator mediator;

    public Colleague(IMediator mediator) {
        this.mediator = mediator;
    }
}