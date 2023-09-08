public class string {
    public static void main(String[] args){
        // Creating strings
        String simpleString = "It is a simple string"; // a simple string
        System.out.println(simpleString);  // it prints "It is a simple string"

        String anotherString = "This is\na multiline\nstring"; // a string with escape sequences
        System.out.println(anotherString); // it prints the result in several lines

        // Get the length and characters of a string
        String s = "Hi, all";

        int len = s.length(); // the len is 7
        char theFirstChar = s.charAt(0);  // 'H' has the index 0
        char theFifthChar = s.charAt(4); // 'a' has the index 4
        char theLastChar = s.charAt(s.length() - 1); // 'l' has the index 6
        String text = "The simple text string";

        //substring(beginIndex, endIndex) returns a substring of the string in the range: beginIndex, endIndex - 1;
        System.out.println(text.substring(0,4));
        boolean empty = text.isEmpty(); // false

        String textInUpperCase = text.toUpperCase(); // "THE SIMPLE TEXT STRING"

        boolean startsWith = textInUpperCase.startsWith("THE"); // true

        /* replace all space characters with empty strings */
        String noSpaces = textInUpperCase.replace(" ", ""); // "THESIMPLETEXTSTRING"

        String textWithWhitespaces = "\t text with whitespaces   !\n  \t";

        String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"

        // It's possible to add values of different types to a string. The value will be automatically converted to a string. See an example below.
        String str = "str" + 10 + false; // the result is "str10false"

        // How to compare strings correctly?
        
        // Cant compare by != and ==
        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondInUpperCase = "SECOND";

        System.out.println(first.equals(second)); // false, the strings have different values
        System.out.println(first.equals(anotherFirst)); // true, the strings have the same value

        System.out.println(second.equals(secondInUpperCase)); // false, the strings have different cases
        System.out.println(second.equalsIgnoreCase(secondInUpperCase)); // true, it ignores cases 


    }
}
