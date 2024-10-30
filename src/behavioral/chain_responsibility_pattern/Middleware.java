package behavioral.chain_responsibility_pattern;

public abstract class Middleware {

    private Middleware next;

    public static Middleware Link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    protected abstract boolean Check(String email, String password);

    protected boolean CheckNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.Check(email, password);
    }
}