package Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;


public class reduceMethod {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = random.ints(4, 0 ,4).toArray();
        IntStream.of(arr).forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println(IntStream.of(arr).reduce(0, (e1, e2) -> (e1 + e2)));
        System.out.println(IntStream.of(arr).reduce(1, (e1, e2) -> (e1 + e2)));
        System.out.println(Arrays.stream(arr).parallel().reduce(Integer.MIN_VALUE, (e1, e2) -> Math.max(e1, e2)));
    }
}

