package Streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class taskILDStream {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 2, 3, 1};
        System.out.println(IntStream.of(numbers)
                .sorted().findFirst().getAsInt());	// 1

        System.out.println(IntStream.of(numbers)
                .limit(2).sorted().findFirst().getAsInt());	// 1

        System.out.println(IntStream.of(numbers).max().getAsInt());	// 4

        System.out.println(IntStream.of(numbers).max().getAsInt());	// 4

        System.out.println(IntStream.of(numbers).distinct().skip(1).filter(e -> e > 2).sum());

        System.out.println(IntStream.of(numbers).distinct().sorted().skip(2).average().getAsDouble());

        boolean d = IntStream.of(numbers).anyMatch(e -> e > 4);
        System.out.println(d);

        d = IntStream.of(numbers).allMatch(e -> e >= 1);
        System.out.println(d);

        IntStream.of(numbers).mapToObj(e -> (char)(e + 50)).forEach(e -> System.out.print(e + " "));
        System.out.println();
        IntStream.of(numbers).mapToObj(e -> (char)(e + 'A')).forEach(System.out::print);


        int[] number = {1, 4, 2, 3, 1};

        IntSummaryStatistics stats = IntStream.of(number).summaryStatistics();
        System.out.println("\n" + stats);


        int[][] m = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Stream.of(m).mapToInt(e -> IntStream.of(e).sum()).sum());

        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};
        Stream.of(names).mapToInt(e -> e.length()).forEach(e -> System.out.println(e + " "));

        int res = Stream.of(names).mapToInt(e -> e.length()).sum();
        System.out.println(res);
    }
}
