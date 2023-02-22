class Main {
    public static void main(String[] args) {
        // put your code here
        System.out.println("0");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        // introducing the printf method
        System.out.printf("My Name is %s. I was born in %d", "Mike", 1998);
        // with the Real numbers use the %f and use the precise(like exact and accurate) 
        public static void main(String[] args){
            System.out.printf("Display a Number %.2f", 15.23);
        }
        // %c char, %s String, %d intlongbyteshort, %f float,double
        
        // String format method
        
        // It likes printf but it return the String not print.
        public static void main(String[] args){
            int age = 22;
            String str = String.format("My age is %d", age);
            System.out.println(str);
        }
        // My age is 22

        // The String class also has a newer and slightly simpler method formatted(Object... args) 
        // that you can use instead of the static String.format method. 
        int age = 22;
        char initial = 'M';
        String surname = "Anderson";
        double height = 1.72;
    
        String details = String.format(
                "My name is %c. %s.%nMy age is %d.%nMy height is %.2f.",//%n is new line
                initial, surname, age, height);
        System.out.println(details);
        // My name is M. Anderson.
        // My age is 22.
        // My height is 1.72.
    }
}
n