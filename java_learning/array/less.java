public class less {
    public static void main(String[] args){
        // array la 1 kieu du lieu dang tham chieu
        int[] numbers = { 1, 2, 3, 4 }; // instantiating and initializing an array of 1, 2, 3, 4
        // The most general way to create an array is to use the special keyword new and specify the necessary number of elements:
        int n = 15; // n is a length of an array
        int[] numbers = new int[n];
        int size = 10;
        char[] characters = new char[size];

        // It takes an array, start index, end index (exclusive) and the value for filling the array
        Arrays.fill(characters, 0, size / 2, 'A'); 
        Arrays.fill(characters, size / 2, size, 'B');

        System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]

        // length
        int[] array = { 1, 2, 3, 4 }; // an array of numbers
        
        int length = array.length; // number of elements of the array
                
        System.out.println(length); // 4

    }
}
