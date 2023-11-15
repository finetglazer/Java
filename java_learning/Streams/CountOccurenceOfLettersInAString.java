package Streams;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurenceOfLettersInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        Character[] characters = new Character[chars.length];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = chars[i];
        }
        Stream.of(characters).map(e -> Character.toUpperCase(e)).forEach(e -> System.out.print(e + " "));
        Stream.of(characters).collect(Collectors.groupingBy(e -> e, Collectors.counting())).forEach((k ,v) ->
        System.out.println(k + ": " + v));
    }
}
