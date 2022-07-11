package ChainedGeneric;

public class Pair<T, S> {
// only for one type
// public class Pair<T>
    private T first;
    private S second;

    public Pair() {}

    public Pair(T first, S second) {
// only for one type
    // public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
    // only for one type
    // public T getSecond() {
        return second;
    }

    public void setSecond(S second) {
        // only for one type
    // public T setSecond() {
        this.second = second;
    }
}
