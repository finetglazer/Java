public class math {
    public static void main(String[] args) {
        // 1. Basic and rounding methods
        Math.min(..., ...) returns the smaller value of two arguments;
        Math.max(..., ...) returns the greater value of two arguments;
        int min = Math.min(11, 81); // min is 11
        int max = Math.max(20, 30); // max is 30
        //Math.abs(...) returns the absolute value of its argument;
        // Math.floor(...) returns the largest double value that is less than or equal to its argument and is equal to an integer;
        // Math.ceil(...) returns the smallest double value that is greater than or equal to its argument and is equal to an integer.
        double floor = Math.floor(3.78); // floor is 3.0
        double ceil = Math.ceil(4.15); // ceil is 5.0
        
        // 2. Exponential functions
        
        // Math.sqrt(...) returns the square root of its argument;
        // Math.cbrt(...) returns the cube root of its argument;
        double sqrt = Math.sqrt(2); // sqrt is 1.4142...
        double cbrt = Math.cbrt(27.0); // cbrt is 3.0
        // It is also possible to raise a number to any power we would like:
        
        // Math.pow(..., ...) returns the value of the first argument raised to the power of the second argument.
        double square = Math.pow(5, 2); // the square of 5 is 25.0
        double cube = Math.pow(2, 3); // the cube of 2 is 8.0

        // 3. Trigonometric functions

        // Math.sin(...) returns the trigonometric sine of the given angle in radians;
        // Math.cos(...) returns the trigonometric cosine of the given angle in radians;
        // double sin = Math.sin(pi / 2); // sin90°  is 1.0
        // double cos = Math.cos(pi); // cos180° is -1.0
        // Math.toRadians(...) converts an angle measured in degrees to an angle measured in radians (approximately).
        // double rad = Math.toRadians(30); // rad is 0.5235...

        // 4. More

        // Math.random() returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
        double random = Math.random(); // a random value >= 0.0 and < 1.0
        // Apart from functions, the Java Math class contains two common constants:
        
        // Math.PI is the ratio of the circumference of a circle to its diameter;
        // Math.E is the base of the natural logarithm.
        double pi = Math.PI; // pi is 3.1415...
        double e = Math.E; // e is 2.71828...
    }

}
