import java.util.*;

public class Random {
    public static void main(String[] args) {
        // 1. Pseudorandom numbers and seeding

        // The random numbers we are going to discuss aren't truly random 
        // because they can always be determined by an initial value, called seed.

        // Every time we get a new random number, we actually get the next number in a predefined sequence. 
        // These numbers are often called pseudorandom, and they are not completely unpredictable! 
        // We can calculate them all if we know the initial value and the algorithm of the sequence. 
        // That initial value is called a seed.
    
        // 3. Creating a pseudorandom generator
        // Java provides the Random class to generate pseudorandom values of different types, 
        // such as int, long, double, and even boolean. 
        // We will consider how to use this class only for numbers.
        // import
        // 1. import java.util.random

        // We have two constructors:
        // + Random();
        // + Random(long seed)

        // If we don't specify a seed, the generator will give us a new sequence every time. 
        // But if we specify the seed, the sequence will be calculated based on it.

        // 3. The basic method

        // int nextInt() returns a pseudorandom value of the int type;
        // int nextInt(int n) returns a pseudorandom value of int type in the range from 0 (inclusive) to n (exclusive);
        // long nextLong() returns a pseudorandom value of long type;
        // double nextDouble() returns a pseudorandom value of double type between 0.0 and 1.0;
        // void nextBytes(byte[] bytes) generates random bytes and places them into a user-supplied byte array.

        // Random random = new Random();
        // System.out.println(random.nextInt(5)); // it may print 0, 1, 2, 3, 4
        // Random rd = new Random(100000);
        // System.out.println(rd.nextInt(5)); // it may print 0, 1, 2, 3, 4
        // System.out.println(rd.nextInt(5)); // it may print 0, 1, 2, 3, 4
        for (char i = '0';i <='9';i++) {
            System.out.println(i);
        }
    }
}
