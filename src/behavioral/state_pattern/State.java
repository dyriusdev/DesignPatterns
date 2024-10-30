package behavioral.state_pattern;

public abstract class State {

    protected Context context;

    public void SetContext(Context context) {
        this.context = context;
    }

    public abstract void Handle1();

    public abstract void Handle2();
}