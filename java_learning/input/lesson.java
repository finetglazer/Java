import java.util.Scanner; // xuat thu vien co chua ham scan

public class lesson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input for string
        String word1 = scanner.next(); // "This"
        String line1 = scanner.nextLine(); // " is a simple"
        String word2 = scanner.next(); // "multiline"
        String word3 = scanner.next(); // "input,"
        String line2 = scanner.nextLine(); // ""
        // int
        int a = scanner.nextInt();
        System.out.println(a);
        // long
        long s1 = scanner.nextLong();
        long s2 = scanner.nextLong();

        long sum = s1 + s2;
    }
}