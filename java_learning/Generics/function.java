package Generics;

import java.util.Scanner;

public class function {

    public static <T> void printer(T a) {
        System.out.println(a);
    }

    public static <V> void printer(V[] a) {
        for (V i : a) {
            System.out.print(i + " ");
        }
    }

    public static <T, V> void print(T a, V b) {
        System.out.println(a + " " + b);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String c = scanner.next();
        printer(a);
        printer(c);

        Integer[] arr = {1, 2, 3, 4, 5};
        printer(arr);
        System.out.println();
        String[] arr2 = {"a", "b", "c", "d", "e"};
        printer(arr2);

        print(a,c);
    }
}
