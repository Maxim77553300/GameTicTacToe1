package supercat2;

@FunctionalInterface
public interface MyOperation<T> {
    T getResult(T value1, T value2);
}
