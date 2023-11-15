package Streams;

import java.util.Random;
import java.util.stream.DoubleStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
//        Random random = new Random();
//        int[] list = random.ints(200_000_000).toArray();
//
//        System.out.println("Number of processors: " + Runtime.getRuntime().availableProcessors());
//
//        long startTime = System.currentTimeMillis();
//        int[] list1 = IntStream.of(list).filter(e -> e > 0).sorted()
//                .limit(5).toArray();
//        System.out.println(Arrays.toString(list1));
//        long endTime = System.currentTimeMillis();
//        System.out.println("Sequential execution time is " +
//                (endTime - startTime) + " milliseconds");
//
//        startTime = System.currentTimeMillis();
//        int[] list2 = IntStream.of(list).parallel().filter(e -> e > 0)
//                .sorted().limit(5).toArray();
//        System.out.println(Arrays.toString(list2));
//        endTime = System.currentTimeMillis();
//
//        System.out.println("Parallel execution time is " +
//                (endTime - startTime) + " milliseconds");

//        Write a statement to obtain an array of 1000 random double values between 0.0
//        and 1.0, excluding 1.0

        DoubleStream.of(new Random().doubles(200_000, 0.0, 1.0).toArray()).parallel().limit(1000).filter(e -> e != 1.0).forEach(e -> System.out.print(e + " "));


    }
}

