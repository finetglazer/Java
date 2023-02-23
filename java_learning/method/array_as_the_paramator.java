public class array_as_the_paramator {
    public static void main(){
        1.
        A parameter of an array type looks like a primitive type parameter. 
        But there is one important difference related to the fact that an array is a reference type.
        when u pass a primitive value like paramator it do not change the the val when u invoke the 
        method with paramator is that. But with array, st is in contrast.
        Ex:
        public static void swapFirstAndLastElements(int[] nums) { // nums is an array
            if (nums.length < 1) {
                return; // it returns nothing, i.e. just exits the method
            }
        
            int temp = nums[nums.length - 1]; // save the last element in a temporary local variable
            nums[nums.length - 1] = nums[0];  // now, the last element becomes the first
            nums[0] = temp;                   // now, the first element becomes the former last
        }
        public static void main(String[] args) {

            int[] numbers = { 1, 2, 3, 4, 5 }; // numbers
        
            System.out.println(Arrays.toString(numbers)); // before swapping
        
            swapFirstAndLastElements(numbers); // swapping
        
            System.out.println(Arrays.toString(numbers)); // after swapping
        }
        the answer:
        [1, 2, 3, 4, 5]
        [5, 2, 3, 4, 1] 
        2. Varargs(variable-length arguments)
            syntax: type+... + name

        used like the array
        public static void printNumberOfArguments(int... numbers) {
            System.out.println(numbers.length);
        }
        printNumberOfArguments(1);
        printNumberOfArguments(1, 2);
        printNumberOfArguments(1, 2, 3);
        printNumberOfArguments(new int[] { }); // no arguments here
        printNumberOfArguments(new int[] { 1, 2 });
        answer:
        1
        2
        3
        0
        2
        
        3. paramator & Varargs;
        If a method has more than one parameter, 
        the vararg parameter must be the last one in the declaration of the method.
        public static void method(double... varargs, int a) { /* do something */ }
        public static void method(int a, double... varargs) { /* do something */ }

    }
}
