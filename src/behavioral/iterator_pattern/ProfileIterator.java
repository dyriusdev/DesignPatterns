package behavioral.iterator_pattern;

public interface ProfileIterator {

    boolean HasNext();

    Profile GetNext();

    void Reset();
}