public class method_relate_to_string {

    // 1. array and string 
    public static void main(String[] args) {
        char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F' };

        String stringFromChars = String.valueOf(chars); // "ABCDEF"

        char[] charsFromString = stringFromChars.split("");
        // { 'A', 'B', 'C', 'D', 'E', 'F' }

        String theSameString = new String(charsFromString); // "ABCDEF"
    // 2. Splitting the string
        String sentence = "a long text";
        String[] words = sentence.split(" "); // {"a", "long", "text"}
        String text = "That's one small step for a man, one giant leap for mankind.";
        String[] parts = text.split(","); 
        // {"That's one small step for a man", " one giant leap for mankind."}
    // 3. Iterating over a string
        String scientistName = "Isaac Newton";

        for (int i = 0; i < scientistName.length(); i++) {
            System.out.print(scientistName.charAt(i) + " ");
        }
        //I s a a c   N e w t o n 
    }
}
