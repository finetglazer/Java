package Generics;

class Pair<T, V extends Number> {
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public V getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return this.first + " " + this.second;
    }


}
public class love {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 1);
        System.out.println(pair);

    }
}
