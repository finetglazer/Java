import java.util.*;

public class floatPointTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double zero = 0.0;
        double one = 1.0;
        double negNumber = -1.75;
        double pi = 3.1415;

        System.out.println(pi); // 3.1415

        float negValue = -0.15f;
        System.out.println(pi); // 3.1415 without f

        double eps = 5e-3; // means 5 * 10^(-3) = 0.005
        double n = 0.01e2; // means 0.01 * 10^2 = 1.0
    
        // For double and float operands, the operator / performs a division, not an integer division.

        System.out.println(one / 2); // 4.934511125
        // Pay attention to an important thing that beginners often miss:

        double d1 = 5 / 4; // 1.0
        double d2 = 5.0 / 4; // 1.25

        // cause of  5/4 is the operator division of 2 int.

        // when u get the input like this:
        double k = scanner.nextDouble();
        // 3,15 instead of 3.15
        System.out.println(k);
    }
}
