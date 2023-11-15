package Streams;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class AnalyzeNumbersUsingStream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
        }

        double avg = DoubleStream.of(numbers).average().getAsDouble();
        DoubleStream.of(numbers).filter(e -> e > avg).forEach(e -> System.out.print(e + " "));
    }
}
