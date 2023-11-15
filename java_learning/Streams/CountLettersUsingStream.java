package Streams;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountLettersUsingStream {
    public static void main(String[] args) {
        Random random = new Random();
        Object[] chars = random.ints(100, (int)'a', (int)'z' + 1).mapToObj(e -> (char)e).toArray();

        Stream.of(chars).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Map<Object, Long> mp = Stream.of(chars).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        mp.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
