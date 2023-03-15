public class stringBuilder {
    public static void main(String[] args){
        // it just like normal string and different in it can be modified(mutable)
    
        // some important methods

        // 1. length()
        StringBuilder sb = new StringBuilder("I use Java");
        System.out.println(sb.length()); // 10

        //2. charAt()
        //3.setCharAt(int index, char c)
        
        StringBuilder s = new StringBuilder("start");
        sb.setCharAt(1, 'm');
        System.out.println(s); // "smart"
        
        //4 deleteCharAt(int index)

        StringBuilder s1 = new StringBuilder("dessert");
        s1.deleteCharAt(2);
        System.out.println(s1); // "desert"

        //5 append(String str)
        StringBuilder s2 = new StringBuilder("abc");
        s2.append("123");
        System.out.println(s2); // "abc123"
        
        StringBuilder messageBuilder = new StringBuilder(); // empty

        messageBuilder
                .append("From: Kate@gmail.com\n")
                .append("To: Max@gmail.com\n")
                .append("Text: I lost my keys.\n")
                .append("Please, open the door!");

        System.out.println(messageBuilder);
        // From: Kate@gmail.com
        // To: Max@gmail.com
        // Text: I lost my keys.
        // Please, open the door!

        //4. StringBuilder insert(int offset, String str)
        StringBuilder s3 = new StringBuilder("I'm a programmer.");
        sb.insert(6, "Java ");
        System.out.println(s3); // I'm a Java programmer.

        //5. StringBuilder replace(int start, int end, String str)
        StringBuilder s4 = new StringBuilder("Let's use C#");
        s4.replace(10, 12, "Java");
        System.out.println(s4); // Let's use Java

        //6 StringBuilder delete(int start, int end)
        StringBuilder s5 = new StringBuilder("Welcome");
        s5.delete(0, 3);
        System.out.println(s5); // "come"

        //7 StringBuilder reverse()
        StringBuilder s6 = new StringBuilder("2 * 3 + 8 * 4");
        s6.reverse();
        System.out.println(s6); // "4 * 8 + 3 * 2"
    }
    
}
